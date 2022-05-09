package jicheng;
/*（1）父类Graphic图形
        包含属性：name（图形名），属性私有化
        包含求面积getArea()：返回0.0
        求周长getPerimeter()方法：返回0.0
        显示信息getInfo()方法：返回图形名称、面积、周长

        （2）子类Circle圆继承Graphic图形
        包含属性：radius
        重写求面积getArea()和求周长getPerimeter()方法，显示信息getInfo()加半径信息

        （3）子类矩形Rectange继承Graphic图形
        包含属性：length、width
        重写求面积getArea()和求周长getPerimeter()方法*/
public class Demo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setName("圆形");
        c1.radius = 10;
        c1.getArea();
        c1.getPerimeter();
        System.out.println(c1.getInfo());

        Rectange r1 = new Rectange();
        r1.setName("矩形");
        r1.length = 10;
        r1.width = 5;
        r1.getArea();
        r1.getPerimeter();
        System.out.println(r1.getInfo());
    }
}
