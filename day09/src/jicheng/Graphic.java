package jicheng;

public class Graphic {
    private String name;
    double getArea(){
        return 0.0;
    }
    double getPerimeter(){
        return 0.0;
    }
    String getInfo(){
        return "图形名称："+name+"，面积："+getArea()+"，周长："+getPerimeter();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
