package Homework.Homework01;
//重写抽象方法drive，输出“脚踏双轮自行车，优哉游哉往前走”
public class Bicycle extends Vehicle{
    //构造器
    public Bicycle(int wheels) {
        super(wheels);
    }

    @Override
    public void drive() {
        System.out.println("脚踏双轮自行车，优哉游哉往前走");
    }


}
