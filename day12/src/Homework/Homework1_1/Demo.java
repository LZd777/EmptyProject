package Homework.Homework1_1;

public class Demo {
    public static void main(String[] args) {
        EmployeeService e1 = new EmployeeService();
        e1.add(new Employee(1, "唐三", 25, 200));
        e1.add(new Employee(2, "戴沐白", 25, 200));
        e1.add(new Employee(3, "小舞", 25, 200));
        e1.add(new Employee(4, "朱竹清", 25, 200));
        e1.add(new Employee(5, "奥斯卡", 25, 200));

        //e1.get()
    }
}

