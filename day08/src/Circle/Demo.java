package Circle;
// （1）定义圆Circle类，包含radius半径属性，getArea()求面积方法，
// getPerimeter()求周长方法，String getInfo()返回圆对象的详细信息的方法**
// （2）在测试类中创建长度为5的Circle[]数组，用来装5个圆对象，
// 并给5个圆对象的半径赋值为[1,10)的随机值
public class Demo {
    public static void main(String[] args) {
        Circle[] arr = new Circle[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Circle();
            arr[i].radius = (Math.random()*10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }


    }

}
