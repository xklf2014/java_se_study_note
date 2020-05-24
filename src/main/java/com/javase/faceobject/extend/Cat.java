package com.javase.faceobject.extend;

/**
 * @Author story
 * @CreateTIme 2020/5/10
 **/
public class Cat extends Pet {
    private String sound;

    public Cat(String name, int age, boolean gender, String sound) {
        //调用父类构造方法
        super(name, age, gender);
        this.sound = sound;
    }

    public Cat() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void show(){
        String gender = "母";
        if (super.getGender() ){
            gender = "公";
        }
        System.out.println("喵咪名字"+super.getName()+"\t年龄"+super.getAge()+"\t性别"+gender);
    }

    public void superShow(){
        super.show();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sound='" + sound + '\'' +
                '}';
    }
  /* 子类无法重写父类静态方法
   @Override
    public static void print(){
        System.out.println("子类静态方法");
    }*/
}
