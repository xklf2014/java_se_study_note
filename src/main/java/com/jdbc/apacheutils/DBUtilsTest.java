package com.jdbc.apacheutils;

import com.jdbc.entity.Emp;
import com.jdbc.util.MySqlDBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DBUtilsTest {
    public static Connection connection;

    public static void testQuery() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp where empno = ?";
        QueryRunner runner = new QueryRunner();
        Emp query = runner.query(connection, sql, new BeanHandler<Emp>(Emp.class),7499);
        System.out.println(query);
        connection.close();
    }

    public static void testList() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        List<Emp> query = runner.query(connection, sql, new BeanListHandler<Emp>(Emp.class));
        query.forEach((q)->{
            System.out.println(q);
        });

        connection.close();
    }

    public static void testArray() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        Object[] query = runner.query(connection, sql, new ArrayHandler());
        for (Object o : query) {
            System.out.println(o);
        }

        connection.close();
    }

    public static void testArrayList() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        List<Object[]> query = runner.query(connection, sql, new ArrayListHandler());
        for (Object[] objects : query) {
            System.out.println(objects[0]+"======"+objects[1]);
        }

        connection.close();
    }

    public static void testMap() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        Map<String, Object> query = runner.query(connection, sql, new MapHandler());
        Set<Map.Entry<String, Object>> entries = query.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey()+"===="+entry.getValue());
        }


        connection.close();
    }

    public static void testSacalar() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select count(*) from emp";
        QueryRunner runner = new QueryRunner();
        Object query = runner.query(connection, sql, new ScalarHandler<>());
        System.out.println(query);
        connection.close();
    }

    public static void testMyHandler() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp where empno = ?";
        QueryRunner runner = new QueryRunner();
        Emp e = runner.query(connection, sql, new ResultSetHandler<Emp>() {
            @Override
            public Emp handle(ResultSet resultSet) throws SQLException {
                if (resultSet.next()){
                    Emp emp = new Emp();
                    emp.setEmpno(resultSet.getInt("empno"));
                    emp.setEname(resultSet.getString("ename"));
                    emp.setJob(resultSet.getString("job"));
                    emp.setMgr(resultSet.getInt("mgr"));
                    emp.setHiredate(resultSet.getString("hiredate"));
                    emp.setSal(resultSet.getDouble("sal"));
                    emp.setComm(resultSet.getDouble("comm"));
                    emp.setDeptno(resultSet.getInt("deptno"));
                    return emp;
                }
                return null;
            }
        },7499);
        System.out.println(e);
        connection.close();
    }

    public static void testInsert() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "insert into emp(empno,ename,deptno) values(?,?,?);";
        QueryRunner runner = new QueryRunner();
        int jack = runner.update(connection, sql, 1000, "Jack", 40);
        connection.close();
    }

    public static void testupdate() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "update emp set ename = ? where empno = ?";
        QueryRunner runner = new QueryRunner();
        int jack = runner.update(connection, sql,  "HaHa",1000);
        connection.close();
    }

    public static void testdelete() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "delete from emp where empno = ?";
        QueryRunner runner = new QueryRunner();
        int jack = runner.update(connection, sql,1000);
        connection.close();
    }

    public static void main(String[] args) throws SQLException {
        //testQuery();
        //testList();
        //testArray();
        //testArrayList();
        //testMap();
        //testSacalar();
        //testMyHandler();
        //testInsert();
        //testupdate();
        testdelete();
    }
}
