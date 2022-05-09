public class Test1Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "AE86";
        car1.proce = 1000;
        System.out.println(car1.name);
        System.out.println(car1.proce);
        car1.steer();
        System.out.println("----------");
        Car car2 = new Car();
        car2.name = "五菱";
        car2.proce = 2000;
        System.out.println(car2.name);
        System.out.println(car2.proce);
        car2.steer();
    }
}
