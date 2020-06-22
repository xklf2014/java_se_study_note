package com.jdbc.pool.dbcp;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCPTest {
    public static void main(String[] args) {
        //数据库连接池资源，之后在操作数据库资源时只需要获取连接即可
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?serverTimezone=GMT");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Connection connection = dataSource.getConnection();
            String sql = "select * from emp";
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("ename"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                dataSource.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
