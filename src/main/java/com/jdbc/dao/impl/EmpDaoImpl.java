package com.jdbc.dao.impl;

import com.jdbc.dao.EmpDao;
import com.jdbc.entity.Emp;
import com.jdbc.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDaoImpl implements EmpDao {
    /*
    * 当插入数据的时候，要注意属性和类型的匹配
    * 1、Date
    * 2、String类型在拼接sql的时候必须加'
    *
    * */

    @Override
    public void insert(Emp emp) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql
            String sql = "insert into emp values(" + emp.getEmpno() + ",'" + emp.getEname() + "','" +
                    emp.getJob() + "'," +emp.getMgr()+",to_date('"+ emp.getHiredate() + "','YYYY-MM-DD')," + emp.getSal() + "," +
                    emp.getComm() + "," + emp.getDeptno() + ")";
            System.out.println(sql);
            //表示受影响的行数
            int i = statement.executeUpdate(sql);
            System.out.println("影响的行数是：\t"+i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection,statement);
        }
    }

    @Override
    public void delete(Emp emp) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql
            String sql = "delete from emp where empno = " + emp.getEmpno();
            System.out.println(sql);
            //表示受影响的行数
            int i = statement.executeUpdate(sql);
            System.out.println("影响的行数是：\t"+i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection,statement);
        }
    }

    @Override
    public void update(Emp emp) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql
            String sql = "update emp set ename ='" + emp.getEname() + "' where empno = "+emp.getEmpno();
            System.out.println(sql);
            //表示受影响的行数
            int i = statement.executeUpdate(sql);
            System.out.println("影响的行数是：\t"+i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection,statement);
        }
    }

    @Override
    public Emp getEmpByEmpno(Integer empno) {
        Connection connection = null;
        Statement statement = null;
        Emp emp = null;
        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql
            String sql = "select * from emp where empno = " + empno;
            System.out.println(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            Integer eno = null;
            String ename = null;
            String job = null;
            Integer mgr = null;
            String hiredate = null;
            Double sal = null;
            Double comm = null;
            Integer deptno = null;
            while (resultSet.next()){
                 eno = resultSet.getInt("empno");
                 ename = resultSet.getString("ename");
                 job = resultSet.getString("job");
                 mgr = resultSet.getInt("mgr");
                 hiredate = resultSet.getString("hiredate");
                 sal = resultSet.getDouble("sal");
                 comm = resultSet.getDouble("comm");
                 deptno = resultSet.getInt("deptno");
            }
            return emp = new Emp(eno,ename,job,mgr,hiredate,sal,comm,deptno);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection,statement);
        }
        return emp;
    }

    @Override
    public Emp getEmpByEname(String ename) {
        Connection connection = null;
        Statement statement = null;
        Emp emp = null;
        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            //拼接sql
            String sql = "select * from emp where ename = " + ename;
            System.out.println(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                emp = new Emp(resultSet.getInt("empno"),resultSet.getString("ename"),resultSet.getString("job"),
                        resultSet.getInt("mgr"),resultSet.getString("hiredate"),resultSet.getDouble("sal"),
                        resultSet.getDouble("comm"),resultSet.getInt("deptno"));
            }
            return emp;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection,statement);
        }
        return emp;
    }
}
