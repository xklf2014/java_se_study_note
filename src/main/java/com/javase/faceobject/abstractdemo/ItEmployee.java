package com.javase.faceobject.abstractdemo;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/

/*
* 2.以面向对象的思想，编写自定义类描述IT从业者。设定属性包括：姓名，年龄，技术方向，工作年限, 工作单位和职务；
*   方法包括：工作
    要求：
        1) 设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
        2) 限定IT从业人员必须年满15岁，无效信息需提示，并设置默认年龄为15。
        3) 限定“技术方向”是只读属性
        4) 工作方法通过输入参数，接收工作单位和职务，输出个人工作信息
            编写测试类，测试IT从业者类的对象及相关方法（测试数据信息自定义）
*
* */
public class ItEmployee {
    private String name;
    private int age = 15;
    private final String skill = "java";
    private int workingAge;
    private String company;
    private String job;

    public void work(String company,String job){
        System.out.println("姓名："+name+",年龄"+age+",技能方向"+skill+
                ",工作年限"+workingAge+"当前在"+company+"公司工作，职位是"+job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15){
            System.out.println("年龄不能小于15岁，已修改为默认15岁");
        }else{
            this.age = age;
        }
    }

    public String getSkill() {
        return skill;
    }

    public int getWorkingAge() {
        return workingAge;
    }

    public void setWorkingAge(int workingAge) {
        this.workingAge = workingAge;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public ItEmployee(String name, int age, int workingAge) {
        this.name = name;
        this.setAge(age);
        this.workingAge = workingAge;
    }

    public ItEmployee() {
    }
}
