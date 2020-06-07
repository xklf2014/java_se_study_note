package com.jdbc.apacheutils;

import com.jdbc.entity.Emp;
import com.jdbc.util.MySqlDBUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtilsTest {
    public static Connection connection;

    public static void testQuery() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp where empno = ?";
        QueryRunner runner = new QueryRunner();
        Emp query = runner.query(connection, sql, new BeanHandler<Emp>(Emp.class));
        System.out.println(query);
        connection.close();
    }

    public static void main(String[] args) throws SQLException {
        testQuery();
    }
}
