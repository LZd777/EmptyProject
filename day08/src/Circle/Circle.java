package Circle;


public class Circle {
    double radius;

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2*radius*Math.PI;
    }

    String getInfo(){

        return "半径："+radius+",周长："+getPerimeter() +",面积："+getArea();
    }

}
