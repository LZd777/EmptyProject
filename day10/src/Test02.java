public class Test02 {
    public static void main(String[] args) {
        Traffic[] tra = new Traffic[3];
        tra[0] = new Car();
        tra[1] = new Bidycle();
        tra[2] = new Car();
    }

}
class Traffic{
    public void  drive(){
        System.out.println("开车");
    }
}

class Car extends Traffic{
    @Override
    public void drive(){
        System.out.println("驾驶汽车");
    }
}

class Bidycle extends Traffic{
    @Override
    public void drive(){
        System.out.println("骑自行车");
    }
}