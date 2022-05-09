package Homework.Homework03;

public class Demo {
    public static void main(String[] args) {
        Bird[] b = new Bird[3];
        b[0] = new Penguin();
        b[1] = new Swan();
        b[2] = new Chicken();

        for (int i = 0; i < b.length; i++) {
            if (b[i] instanceof Penguin) {
                Penguin penguin = (Penguin)b[i];
                penguin.eat();
                penguin.swim();
            }else if (b[i] instanceof Swan) {
                Swan swan = (Swan)b[i];
                swan.eat();
                swan.fly();
                swan.swim();
            }else if (b[i] instanceof Chicken) {
                Chicken chicken = (Chicken)b[i];
                chicken.eat();
                chicken.fly();
            }


        }
    }
}
