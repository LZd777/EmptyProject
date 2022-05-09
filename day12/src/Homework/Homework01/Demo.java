package Homework.Homework01;

public class Demo {
    public static void main(String[] args) {
        Vehicle m1 = new Monocycle(1);
        m1.drive();
        System.out.println(m1.toString());

        Vehicle b1 = new Bicycle(2);
        b1.drive();
        System.out.println(b1.toString());

        Vehicle t1 = new Tricycle(3);
        t1.drive();
        System.out.println(t1.toString());
    }
}
