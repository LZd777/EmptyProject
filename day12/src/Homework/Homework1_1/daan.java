package Homework.Homework1_1;

import java.util.function.Predicate;

public class daan {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        es.add(new Employee(4, "李四", 24, 24000));
        es.add(new Employee(3, "张三", 23, 13000));
        es.add(new Employee(5, "王五", 25, 15000));
        es.add(new Employee(1, "赵六", 27, 17000));
        es.add(new Employee(2, "钱七", 16, 6000));

        System.out.println("所有员工：");
        Employee[] all = es.get(new Predicate() {
            @Override
            public boolean test(Object o) {
                return true;
            }
        });
        ArrayTools.print(all);
        System.out.println("--------------------------------");
        System.out.println("所有年龄超过25的员工：");
        all = es.get(new Predicate() {
            @Override
            public boolean test(Object o) {
                return ((Employee) o).getAge() > 25;
            }
        });
        ArrayTools.print(all);
        System.out.println("--------------------------------");
        System.out.println("所有薪资高于15000的员工：");
        all = es.get(new Predicate() {
            @Override
            public boolean test(Object o) {
                Employee e = (Employee) o;
                return e.getSalary() > 15000;
            }
        });
        ArrayTools.print(all);
        System.out.println("--------------------------------");
        System.out.println("所有年龄超过25且薪资高于15000的员工：");
        all = es.get(new Predicate() {
            @Override
            public boolean test(Object o) {
                Employee e = (Employee) o;
                return e.getAge() > 25 && e.getSalary() > 15000;
            }
        });
        ArrayTools.print(all);
    }
}
