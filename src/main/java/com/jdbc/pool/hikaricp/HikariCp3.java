package com.jdbc.pool.hikaricp;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;

public class HikariCp3 {
    public static void main(String[] args) throws IOException, SQLException {
        Properties props = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/java/com/jdbc/pool/hikaricp/hikaricp.properties");
        props.load(fileInputStream);
        /*props.setProperty("dataSourceClassName", "com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        props.setProperty("dataSource.user", "root");
        props.setProperty("dataSource.password", "123456");
        props.setProperty("dataSource.databaseName", "jdbc:mysql://localhost:3306/demo?serverTimezone=GMT");
        props.put("dataSource.logWriter", new PrintWriter(System.out));*/

        HikariConfig config = new HikariConfig(props);
        HikariDataSource ds = new HikariDataSource(config);
        System.out.println(ds.getConnection());
        ds.close();

    }
}

