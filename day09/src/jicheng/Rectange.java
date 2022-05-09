package jicheng;

public class Rectange extends Graphic {
    double length;
    double width;

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return (length + width) * 2;
    }

    String getInfo() {
        return "图形名称：" + getName() + "，面积：" + getArea() + "，周长：" + getPerimeter();
    }
}
