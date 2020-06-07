package com.reflect;


import com.jdbc.entity.Emp;
import com.jdbc.entity.Emp2;
import com.jdbc.util.DBUtil;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
 *要查询N张表，但是不想写N个方法，能否写一个方法完成所有表的查询工作
 * */
public class BaseDaoImpl {

    /**
     * 统一查询表的方法
     */
    public List getRows(String sql, Object[] params, Class clazz) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList list = new ArrayList();

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }
            //开始执行查询操作，resultset种的返回结果，需要将返回的结果放置到不同的对象中
            rs = pstmt.executeQuery();
            //获取结果集合的元数据对象
            ResultSetMetaData metaData = rs.getMetaData();
            //判断查询到的每一行记录中包含多少个列
            int columnCount = metaData.getColumnCount();
            //循环遍历resultset
            while (rs.next()) {
                Object obj = clazz.newInstance();
                for (int i = 0; i < columnCount; i++) {
                    //从结果集合中获取单一的值
                    Object objValue = rs.getObject(i + 1);
                    //获取列的名称
                    String columnName = metaData.getColumnName(i + 1).toLowerCase();
                    //获取类中的属性
                    Field declaredField = clazz.getDeclaredField(columnName);
                    //获取类中属性对应的set方法
                    Method method = clazz.getMethod(getSetMame(columnName), declaredField.getType());
                    if (objValue instanceof Number) {
                        Number number = (Number) objValue;
                        String fname = declaredField.getType().getName();
                        if ("int".equals(fname) || "java.lang.Integer".equals(fname)) {
                            method.invoke(obj, number.intValue());
                        } else if ("byte".equals(fname) || "java.lang.Byte".equals(fname)) {
                            method.invoke(obj, number.byteValue());
                        } else if ("short".equals(fname) || "java.lang.Short".equals(fname)) {
                            method.invoke(obj, number.shortValue());
                        } else if ("long".equals(fname) || "java.lang.Long".equals(fname)) {
                            method.invoke(obj, number.longValue());
                        } else if ("float".equals(fname) || "java.lang.Float".equals(fname)) {
                            method.invoke(obj, number.floatValue());
                        } else if ("double".equals(fname) || "java.lang.Double".equals(fname)) {
                            method.invoke(obj, number.doubleValue());
                        }
                    } else {
                        method.invoke(obj, objValue);
                    }
                }
                list.add(obj);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(conn, pstmt, rs);
        }

        return list;
    }


    /**
     * 统一插入方法
     */
    public int insert(Object object) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        //准备拼接的sql
        String sql = "insert into ";
        //获取表名
        String tableName = object.getClass().getSimpleName();
        //获取传入对象所有字段
        Field[] declaredFields = object.getClass().getDeclaredFields();
        try {
            //通过工具类获取connection
            conn = DBUtil.getConnection();
            //通过传入对象生成对象实例
            Object obj = object.getClass().newInstance();
            String fields = "";
            String values = "";
            for (Field f : declaredFields) {
                //获取get方法
                Method get = object.getClass().getDeclaredMethod(getGetMethodName(f.getName().toLowerCase()));
                //通过get方法确定字段是否为空值or空串
                Object objValue = get.invoke(object);
                if (objValue != null || !"".equals(objValue)) {
                    //拼接需要插入值的字段
                    fields += "," + f.getName();
                    //确认value值的类型
                    if (objValue instanceof Number) {
                        Number number = (Number) objValue;
                        String fname = f.getType().getName();
                        if ("int".equals(fname) || "java.lang.Integer".equals(fname)) {
                            values += "," + number.intValue();
                        } else if ("byte".equals(fname) || "java.lang.Byte".equals(fname)) {
                            values += "," + number.byteValue();
                        } else if ("short".equals(fname) || "java.lang.Short".equals(fname)) {
                            values += "," + number.shortValue();
                        } else if ("long".equals(fname) || "java.lang.Long".equals(fname)) {
                            values += "," + number.longValue();
                        } else if ("float".equals(fname) || "java.lang.Float".equals(fname)) {
                            values += "," + number.floatValue();
                        } else if ("double".equals(fname) || "java.lang.Double".equals(fname)) {
                            values += "," + number.doubleValue();
                        }
                    } else if (objValue instanceof String) {
                        //此处判断逻辑可以删除，如果日期为Date的话
                        if (f.getName().equals("hiredate")) {
                            values += ",to_date('" + objValue.toString() + "','YYYY-MM-DD')";
                            continue;
                        }
                        values += ",'" + objValue.toString() + "'";
                    } else if (objValue instanceof Date) {
                        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                        values += ", to_date('" + format.format(objValue)+"','YYYY-MM-DD')";
                    }

                }

            }
            //生成最终需要执行的insert语句
            sql = sql + tableName + "(" + fields.substring(1) + ") values(" + values.substring(1) + ")";
            //System.out.println(sql);
            pstmt = conn.prepareStatement(sql);
            int i = pstmt.executeUpdate();
            return i;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(conn,pstmt);
        }


        return 0;
    }

    /**
     * 统一删除方法
     */
    public int delete(Object object) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        //准备拼接的sql
        String sql = "delete ";
        //获取表名
        String tableName = object.getClass().getSimpleName();
        //获取传入对象所有字段
        Field[] declaredFields = object.getClass().getDeclaredFields();
        try {
            //通过工具类获取connection
            conn = DBUtil.getConnection();
            //通过传入对象生成对象实例
            Object obj = object.getClass().newInstance();
            String fields = "";
            for (Field f : declaredFields) {
                //获取get方法
                Method get = object.getClass().getDeclaredMethod(getGetMethodName(f.getName().toLowerCase()));
                //通过get方法确定字段是否为空值or空串
                Object objValue = get.invoke(object);
                if (objValue != null || !"".equals(objValue)) {
                    //拼接需要插入值的字段
                    fields += f.getName();
                    //确认value值的类型
                    if (objValue instanceof Number) {
                        Number number = (Number) objValue;
                        String fname = f.getType().getName();
                        if ("int".equals(fname) || "java.lang.Integer".equals(fname)) {
                            fields += "=" + number.intValue() + " and ";
                        } else if ("byte".equals(fname) || "java.lang.Byte".equals(fname)) {
                            fields += "=" + number.byteValue()+ " and ";
                        } else if ("short".equals(fname) || "java.lang.Short".equals(fname)) {
                            fields += "=" + number.shortValue()+ " and ";
                        } else if ("long".equals(fname) || "java.lang.Long".equals(fname)) {
                            fields += "=" + number.longValue()+ " and ";
                        } else if ("float".equals(fname) || "java.lang.Float".equals(fname)) {
                            fields += "=" + number.floatValue()+ " and ";
                        } else if ("double".equals(fname) || "java.lang.Double".equals(fname)) {
                            fields += "=" + number.doubleValue()+ " and ";
                        }
                    } else if (objValue instanceof String) {
                        fields += "='" + objValue.toString() + "'"+ " and ";
                    } else if (objValue instanceof Date) {
                        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                        fields += "= to_date('" + format.format(objValue)+"','YYYY-MM-DD')"+ " and ";
                    }

                }

            }

            //生成where条件部分
            String whereSql = fields.substring(0, fields.lastIndexOf("and"));
            //生成最终需要执行的delete语句
            sql = sql + tableName + " where " + whereSql;
            System.out.println(sql);
            pstmt = conn.prepareStatement(sql);
            int i = pstmt.executeUpdate();
            if (i==1){
                conn.commit();
                return i;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(conn,pstmt);
        }


        return 0;
    }

    /**
     * 统一更新方法
     */
    public int update(Object oldObject,Object newObj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        //准备拼接的sql
        String sql = "update ";
        //获取表名
        String tableName = newObj.getClass().getSimpleName();
        String setValue = productSql(SqlType.UPDATE,newObj);
        String whereCondition = productSql(SqlType.WHERE,oldObject);
        String finalSql = sql + tableName + setValue + whereCondition;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(finalSql);
            int i = pstmt.executeUpdate();
            if (i == 1){
                conn.commit();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(conn,pstmt);
        }
        return 0;
    }

    //基于重复代码过多，简单封装了重复代码（目前仅实现where和set部分）
    public String productSql(SqlType sqlType,Object object) {
        String sql = "";
        //获取传入对象所有字段
        Field[] declaredFields = object.getClass().getDeclaredFields();
            //通过传入对象生成对象实例
        try {
            Object obj = object.getClass().newInstance();

        String setSql = "";
            String whereSql = "";

            if (SqlType.UPDATE.equals(sqlType)){
                setSql = " set ";
            }else if(SqlType.WHERE.equals(sqlType)){
                whereSql = " where ";
            }

            for (Field f : declaredFields) {
                String temp = "";
                //获取get方法
                Method get = object.getClass().getDeclaredMethod(getGetMethodName(f.getName().toLowerCase()));
                //通过get方法确定字段是否为空值or空串
                Object objValue = get.invoke(object);
                if (objValue != null || !"".equals(objValue)) {
                    //拼接需要插入值的字段
                    temp += f.getName();

                    //确认value值的类型
                    if (objValue instanceof Number) {
                        Number number = (Number) objValue;
                        String fname = f.getType().getName();
                        if ("int".equals(fname) || "java.lang.Integer".equals(fname)) {
                            temp += "=" + number.intValue();
                        } else if ("byte".equals(fname) || "java.lang.Byte".equals(fname)) {
                            temp += "=" + number.byteValue();
                        } else if ("short".equals(fname) || "java.lang.Short".equals(fname)) {
                            temp += "=" + number.shortValue();
                        } else if ("long".equals(fname) || "java.lang.Long".equals(fname)) {
                            temp += "=" + number.longValue();
                        } else if ("float".equals(fname) || "java.lang.Float".equals(fname)) {
                            temp += "=" + number.floatValue();
                        } else if ("double".equals(fname) || "java.lang.Double".equals(fname)) {
                            temp += "=" + number.doubleValue();
                        }
                    } else if (objValue instanceof String) {
                        temp += "='" + objValue.toString() + "'";
                    } else if (objValue instanceof Date) {
                        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
                        temp += "= to_date('" + format.format(objValue)+"','YYYY-MM-DD')";
                    }
                    if (!"".equals(whereSql) && objValue != null){
                        whereSql += temp + " and ";
                    }else if(!"".equals(setSql) && objValue != null){
                        setSql += temp + " , ";
                    }
                }

            }
            if (!"".equals(whereSql)){
                sql = whereSql.substring(0, whereSql.lastIndexOf("and"));
            }else if(!"".equals(setSql)){
                sql = setSql.substring(0, setSql.lastIndexOf(","));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //System.out.println(sql);
        return sql;
    }

    public String getSetMame(String name) {
        return "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public String getGetMethodName(String name) {
        return "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
    }


    public static void main(String[] args) throws ParseException {
        BaseDaoImpl baseDao = new BaseDaoImpl();
        /*List rows = baseDao.getRows("select empno,ename,sal,deptno from emp where deptno = ?", new Object[]{10}, Emp.class);
        for (Iterator it=rows.iterator();it.hasNext();){
            Emp emp = (Emp) it.next();
            System.out.println(emp.toString());
        }*/
/*
        List rows = baseDao.getRows("select * from dept", new Object[]{}, Dept.class);
        for (Iterator it=rows.iterator();it.hasNext();){
            Dept dept = (Dept) it.next();
            System.out.println(dept.toString());
        }*/

        /*Emp2 emp = new Emp2();
        emp.setEmpno(3555);
        emp.setEname("jack");
        emp.setJob("SALES");
        emp.setMgr(2222);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = dateFormat2.parse("2020-06-07 10:29:01");
        emp.setHiredate(now);
        emp.setSal(1000.0);
        emp.setComm(500.0);
        emp.setDeptno(40);*/
        //baseDao.insert(emp);
        //Dept dept = new Dept(50,"BeiJing","Beijing City");
        //baseDao.insert(dept);

        //baseDao.delete(emp);

        Emp2 oldemp = new Emp2();
        oldemp.setEmpno(2222);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        Date now = dateFormat2.parse("2020-06-07");
        Emp2 newEmp = new Emp2(3333,"Hogwarts","MANAGER",7839,now,3000.0,1500.0,40);
        baseDao.update(oldemp,newEmp);
    }
}
