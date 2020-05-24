package com.javase.faceobject;

/**
 * @Author story
 * @CreateTIme 2020/5/4
 **/
public class Point {
    double x;
    double y;

    public void calc(Point p){
        double z = Math.sqrt(Math.pow(p.x-x,2) + Math.pow(p.y-y,2));
        System.out.println("距离为"+z);
    }

    public void swtich(Point point){
        double tmp = x;
        x = point.x;
        point.x = tmp;

        tmp = y;
        y = point.y;
        point.y = tmp;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point p = new Point(3,5);
        Point p1 = new Point(2,4);
        p.calc(p1);
        p.swtich(p1);

        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
}
