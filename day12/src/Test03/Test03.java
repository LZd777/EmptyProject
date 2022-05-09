package Test03;

public class Test03 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.breathe();
        animal.sleep();
        LiveAble.drink();
        Plant plant = new Plant();
        plant.eat();
        plant.breathe();
        plant.sleep();
        LiveAble.drink();
    }
}
