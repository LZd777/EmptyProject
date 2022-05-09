package Test02;

public interface Jimppable {
    int  i = 10;
    void jump();
    default void TestDefault(){
        System.out.println("缺省方法");
    }
    static void Test(){
        System.out.println("静态方法");
    }
}
