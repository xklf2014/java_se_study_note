package com.jdbc.pool.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3P0Test {
    public static void main(String[] args) throws PropertyVetoException {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass( "com.mysql.jdbc.Driver" );
        cpds.setJdbcUrl( "jdbc:mysql://localhost:3306/demo?serverTimezone=GMT" );
        cpds.setUser("root");
        cpds.setPassword("123456");

        try {
            Connection connection = cpds.getConnection();
            String sql = "select * from emp";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("ename"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            cpds.close();
        }
    }
}
