package Test01;

public class Test1 {
    public static void main(String[] args) {
        Man man = new Man();

        man.walk();
        man.eat();
        man.smoke();

        Woman woman = new Woman();
        woman.walk();
        woman.eat();
        woman.buy();
    }
}
