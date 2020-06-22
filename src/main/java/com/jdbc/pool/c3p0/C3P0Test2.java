package com.jdbc.pool.c3p0;

import com.mchange.v2.c3p0.DataSources;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class C3P0Test2 {
    public static void main(String[] args) throws SQLException {
        DataSource ds_unpooled = DataSources.unpooledDataSource("jdbc:mysql://localhost:3306/demo?serverTimezone=GMT",
                "root",
                "123456");
        /*DataSource ds_pooled = DataSources.pooledDataSource( ds_unpooled );
        Connection connection = ds_pooled.getConnection();
        String sql = "select * from emp";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("ename"));
        }*/
        Map overrides = new HashMap();
        overrides.put("maxStatements", "200");
        overrides.put("maxPoolSize", new Integer(50));
        DataSource ds_pooled = DataSources.pooledDataSource( ds_unpooled , overrides);
        Connection connection = ds_pooled.getConnection();
        String sql = "select * from emp";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("ename"));
        }

    }

}
