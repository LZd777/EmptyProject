package Test02;

public class Cat implements Jimppable {
    @Override
    public void jump() {
        System.out.println("猫跳华尔兹");
    }

    @Override
    public void TestDefault() {
        System.out.println("实现缺省方法");
    }
}
