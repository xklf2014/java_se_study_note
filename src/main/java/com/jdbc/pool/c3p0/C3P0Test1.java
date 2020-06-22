package com.jdbc.pool.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3P0Test1 {
    public static Connection connection;
    public static ComboPooledDataSource dataSource;

    public static void getConnection(){
        dataSource = new ComboPooledDataSource();
    }

    public static void query(){
        try {
            connection = dataSource.getConnection();
            String sql = "select * from emp";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("ename"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            dataSource.close();
        }

    }

    public static void main(String[] args) throws PropertyVetoException {
        getConnection();
        query();


    }

}

