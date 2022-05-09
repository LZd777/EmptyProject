package Homework1_1;

public class Demo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.a = 3;
        t1.b = 4;
        t1.c = 5;
        System.out.println("t1是三角形吗？" + t1.isTriangle());
        System.out.println("t1是直角三角形吗？" + t1.isRightTriangle());
        System.out.println("t1是等腰三角形吗？" + t1.isIsoscelesTriangle());
        System.out.println("t1是等边三角形吗？" + t1.isEquilateralTriangle());
        System.out.println("t1的周长：" + t1.perimeter());
        System.out.println("t1的面积：" + t1.area());
    }
}
