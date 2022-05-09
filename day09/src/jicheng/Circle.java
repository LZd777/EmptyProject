package jicheng;

public class Circle extends Graphic {
    double radius;

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double getPerimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    String getInfo() {
        return "图形名称：" + getName() + "，半径：" + radius + "，面积：" + getArea() + "，周长：" + getPerimeter();
    }
}
