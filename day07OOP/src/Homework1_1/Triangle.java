package Homework1_1;

public class Triangle {
    double a;
    double b;
    double c;

    //判断是否是一个三角形
    boolean isTriangle() {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    //判断是否是一个直角三角形
    boolean isRightTriangle() {
        return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
    }

    //判断是否是一个等腰三角形
    boolean isIsoscelesTriangle() {
        return a == b || a == c || b == c;
    }

    //判断是否是一个等边三角形
    boolean isEquilateralTriangle() {
        return a == c && a == b;
    }

    //根据三条边，用海伦公式求面积
    double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //求周长
    double perimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}