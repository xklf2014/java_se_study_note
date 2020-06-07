package com.jdbc.dao.impl;

import com.jdbc.dao.EmpDao;
import com.jdbc.entity.Emp;
import com.jdbc.util.DBUtil;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EmpDaoImpl2 implements EmpDao {
    /*
    * 当插入数据的时候，要注意属性和类型的匹配
    * 1、Date
    * 2、String类型在拼接sql的时候必须加'
    *
    * */

    @Override
    public void insert(Emp emp) {
        Connection connection = null;
        PreparedStatement statement = null;
        Date hiredate = null;
            try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);

            hiredate = new Date(new java.util.Date().getTime());

            //拼接sql
            String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,emp.getEmpno());
            statement.setString(2,emp.getEname());
            statement.setString(3,emp.getJob());
            statement.setInt(4,emp.getMgr());
            statement.setDate(5,hiredate);
            statement.setDouble(6,emp.getSal());
            statement.setDouble(7,emp.getComm());
            statement.setInt(8,emp.getDeptno());

            System.out.println(sql);
            //表示受影响的行数
            int i = statement.executeUpdate();
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
        PreparedStatement statement = null;

        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            //拼接sql
            String sql = "delete from emp where empno =? ";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,emp.getEmpno());
            System.out.println(sql);
            //表示受影响的行数
            int i = statement.executeUpdate();
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
        PreparedStatement statement = null;

        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            //拼接sql
            String sql = "update emp set ename = ? where empno = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1,emp.getEname());
            statement.setInt(2,emp.getEmpno());
            System.out.println(sql);
            //表示受影响的行数
            int i = statement.executeUpdate();
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
        PreparedStatement statement = null;
        Emp emp = null;
        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            String sql = "select * from emp where empno = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,empno);
            //拼接sql
            System.out.println(sql);
            ResultSet resultSet = statement.executeQuery();

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

    @Override
    public Emp getEmpByEname(String ename) {
        Connection connection = null;
        PreparedStatement statement = null;
        Emp emp = null;
        try {
            connection = DBUtil.getConnection();
            //设置事务是否自动提交，true表示自动提交，false表示不是自动提交
            connection.setAutoCommit(true);
            String sql = "select * from emp where ename = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1,ename);
            //拼接sql
            System.out.println(sql);
            ResultSet resultSet = statement.executeQuery();

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
