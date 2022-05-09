package Homework2_1;

public class Demo {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "张三";
        citizen.idNumber = "110250199512012535";
        citizen.setBirthday(1995, 12, 1);
        System.out.println(citizen.getInfo());
    }
}
