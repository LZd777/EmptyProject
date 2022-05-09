package Homework.Homework01;
//重写抽象方法drive，输出“脚踏独轮车，摇摇摆摆往前走”
public class Monocycle extends Vehicle{
    //构造器
    public Monocycle(int wheels) {
        super(wheels);
    }

    @Override
    public void drive() {
        System.out.println("脚踏独轮车，摇摇摆摆往前走");
    }
}
