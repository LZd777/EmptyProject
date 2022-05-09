package Test02;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.jump();
        c.TestDefault();
        Jimppable.Test();
        System.out.println(Jimppable.i);
        int a = c.i;
        System.out.println(a);
    }
}
