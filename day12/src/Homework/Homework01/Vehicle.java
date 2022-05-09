package Homework.Homework01;
/*- 包含私有的的int类型的属性wheels，代表轮子的数量
        - 包含有参构造Vehicle(int wheels)
        - 包含抽象方法public abstract void drive()
        - 重写toString()：返回轮子的数量*/
abstract class Vehicle {
    private int wheels;//轮子数量

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return ""+wheels;
    }
}
