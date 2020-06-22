package com.jdbc.pool.hikaricp;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.SQLException;

public class HikariCP2 {
    public static void main(String[] args) throws SQLException {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/demo?serverTimezone=GMT");
        ds.setUsername("root");
        ds.setPassword("123456");
        System.out.println(ds.getConnection());
        ds.close();
    }
}
