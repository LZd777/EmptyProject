package Homework.Homework1_1;

import java.util.function.Predicate;

public class EmployeeService {
    private Employee[] arr = new Employee[5];
    private int total;//记录员工数

    //添加员工
    public void add(Employee emp) {
        if (total > arr.length) {
            System.out.println("数组已满");
            return;
        }
        arr[total++] = emp;
    }

    public Employee[] get(Predicate p) {
        int count = 0;//计数器
        // 调用p.test方法判定符合条件的对象
        for (Employee employee : arr) {
            if (p.test(employee)) {
                count++;
            }
        }
        //创建接受数组
        Employee[] result = new Employee[count];
        count = 0;//计数器清零

        //添加符合条件的对象到接受数组
        for (Employee employee : arr) {
            if (p.test(employee)) {
                result[count++] = employee;
            }
        }
        return result;
    }
}


