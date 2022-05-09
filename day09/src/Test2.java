public class Test2 {
    public static void main(String[] args) {

   Cat cat = new Cat();
    cat.name = "tom";
    cat.age = 3;
    cat.eat();
}

}
class Animal{
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
}
class Cat extends Animal{

}