package com.javase.faceobject.extend.info;

/**
 * @Author story
 * @CreateTIme 2020/5/11
 **/
public class CylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        circle.show();

        System.out.println("========");

        Cylinder cylinder = new Cylinder(5,7);
        cylinder.showVolume();
    }
}
