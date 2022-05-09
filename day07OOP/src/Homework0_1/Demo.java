package Homework0_1;

public class Demo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.number = 1;
        emp1.name = "张三";
        emp1.age = 23;
        emp1.pay = 10000.0;
        System.out.println("第1位员工编号：" + emp1.number + "  姓名：" + emp1.name + "  年龄" + emp1.age + "  薪资" + emp1.pay);


        Employee emp2 = new Employee();
        emp2.number = 2;
        emp2.name = "李四";
        emp2.age = 22;
        emp2.pay = 11000.0;
        System.out.println("第2位员工编号：" + emp2.number + "  姓名：" + emp2.name + "  年龄" + emp2.age + "  薪资" + emp2.pay);
    }

}
