package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/7
 *
 * 构造方法与重载：定义一个网络用户类，要处理的信息有用户 ID、用户密码、 email 地址。
 * 在建立类的实例时把以上三个信息都作为构造函数的参数输入，
 * 其中用户 ID 和用户密码必须缺省时 email地址是用户 ID 加上字符串"@gameschool.com"。
 *
 *
 **/
public class NetUser {

    private int id;
    private String password;
    private String email;

    public NetUser() {
    }

    public NetUser(int id, String password) {
        this.id = id;
        this.password = password;
        this.email = id+"@gameschool.com";
    }

    public NetUser(int id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public void show(){
        System.out.println("编号："+id);
        System.out.println("密码："+password);
        System.out.println("邮件："+email);
    }





}
