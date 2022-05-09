package Homework.Homework01;
//重写抽象方法drive，输出“脚踏三轮车，稳稳当当往前走“
public class Tricycle extends Vehicle{
    //构造器

    public Tricycle(int wheels) {
        super(wheels);
    }

    @Override
    public void drive() {
        System.out.println("脚踏三轮车，稳稳当当往前走");
    }
}
