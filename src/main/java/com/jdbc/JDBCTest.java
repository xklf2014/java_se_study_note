package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
*
* 如果需要建立连接，java中提供了一套标准，数据库厂商来进行实现，包含实现之类，实现的之类文件在哪？
* 一般情况下存放在安装目录
*
* */
public class JDBCTest {
    public static void main(String[] args) throws Exception {

        /*
        * 1、加载驱动
        *   当执行了当前代码之后，会返回一个CLass对象，在此对象的创建过程中，会调用具体类的静态代码块
        *
        * */
        Class.forName("oracle.jdbc.OracleDriver");
        /*
        * 2、建立连接
        *   第一步中已经将driver对象注册到了drivermanager中，所以此时可以直接通过DriverManager来获取数据的来接
        *   输入数据库连接的参数
        *       url：数据库的地址
        *       username：用户名
        *       password：密码
        * */
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:test", "scott", "tiger");
        //3、测试连接是否成功
        System.out.println(connection);
        //4、定义sql语句
        String sql = "select * from emp";
        /*
        * 5、准备静态处理块对象，将sql放置到静态处理块中，理解为sql语句放置对象
        *   在执行sql语句的过程中，需要一个对象来存放sql语句，将对象进行执行的时候调用的是数据库服务，数据库会从当前对象中
        *   拿到对应的sql进行执行
        * */
        Statement statement = connection.createStatement();
        /*
        * 6、执行sql,返回值是集合对象
        *   将执行结果放到ResultSet集合中，是返回结果的一个集合
        *   需要经过循环迭代才能够获取其中的每一条记录
        *
        *   statement在执行的时候可以选择三种方式
        *       1、execute：任何sql语句都可以执行
        *       2、executeQuery：只能执行查询语句
        *       3、executeUpdate：只能执行DML语句
        * */
        ResultSet resultSet = statement.executeQuery(sql);
        /*
        * 7、循环处理
        *   使用while循环，有2种获取具体值的方式，第一种是通过下标索引来获取，从1开始。第二种是通过列表来获取，
        *   那种好？推荐使用第二种，列明一般不会发生更改
        * */
        while(resultSet.next()){
            int anInt = resultSet.getInt(1);
            System.out.println(anInt);
            String ename = resultSet.getString("ename");
            System.out.println(ename);
            System.out.println("------------");

        }

        //关闭连接
        statement.close();
        connection.close();

    }

}
