package com.jdbc.pool.hikaricp;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HikariCp {
    public static void main(String[] args) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/demo?serverTimezone=GMT");
        config.setUsername("root");
        config.setPassword("123456");

        HikariDataSource ds = new HikariDataSource(config);
        try {
            Connection connection = ds.getConnection();
            String sql = "select * from emp";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("ename"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ds.close();
        }


    }
}
