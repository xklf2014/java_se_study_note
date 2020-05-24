package com.javase.faceobject;

import java.sql.Date;

/**
 * @Author story
 * @CreateTIme 2020/5/8
 **/

/*
*   package:包，对应到文件系统就是多级目录
*   为了解决2个问题：
*       1、文件重名问题
*       2、为类方便管理类，将具体处理功能的代码放到同一个目录下
*
* 使用：
*   一般定义package会放置在java文件的第一行
*       package域名倒写
*       package com.baidu
*
* 完全限定名： 包名+类名
*
*   JDK常用的包：
*       lang:不需要手动导入，自动加载
*       util:工具包
*       net:网络包
*       io:输入输出流包
* */
public class PackageDemo {
    public static void main(String[] args) {
        Date date = new Date(1000000);
    }
}
