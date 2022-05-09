package ems.view;

import ems.bean.Employee;
import ems.service.EmployeeService;
public class EmployeeView {
    /**
     * 关联到管理器对象，内部数组长度写死成10个
     */
    private EmployeeService empService = new EmployeeService(10);

    /**
     * 进入主程序
     */
    public void enterMainMenu() {
        //声明布尔变量
        boolean loopFlag = true;
        do {
            System.out.println("-----------------员工信息管理---------------- -");
            System.out.println("        1 添加员工");
            System.out.println("        2 修改员工");
            System.out.println("        3 删除员工");
            System.out.println("        4 员工列表");
            System.out.println("        5 退   出");
            System.out.println();
            System.out.print("        请选择(1 - 5)：");
            // 读取用户选择
            char choice = EMSUtility.readMenuSelection();
            switch (choice) {
                case '1':
                    addNewEmployee();
                    break;
                case '2':
                    modifyEmployee();
                    break;
                case '3':
                    deleteEmployee();
                    break;
                case '4':
                    listAllEmployees();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    // 获取用户输入的确认
                    char confirm = EMSUtility.readConfirmSelection();
                    if (confirm == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);
    }

    /**
     * 添加新员工
     */
    private void addNewEmployee() {
        System.out.println("---------------------添加员工---------------------");
        System.out.print("姓名：");
        String name = EMSUtility.readString(10);
        System.out.print("性别：");
        char gender = EMSUtility.readChar();
        System.out.print("年龄：");
        int age = EMSUtility.readInt();
        System.out.print("工资：");
        double salary = EMSUtility.readDouble();
        System.out.print("电话：");
        String phone = EMSUtility.readString(20);
        System.out.print("邮箱：");
        String email = EMSUtility.readString(30);
        // 创建Employee对象
        Employee employee = new Employee();
        employee.setName(name);
        employee.setGender(gender);
        employee.setAge(age);
        employee.setSalary(salary);
        employee.setPhone(phone);
        employee.setEmail(email);

        // 通过调用管理器对象完成 员工添加
        boolean flag = empService.addEmployee(employee);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
            listAllEmployees();
        } else {
            System.out.println("---------------------添加失败---------------------");
        }
    }

    /**
     * 修改员工
     */
    private void modifyEmployee () {
        System.out.println("---------------------修改员工---------------------");
        listAllEmployees();
        System.out.print("请选择待修改员工编号(-1退出)：");
        // 获取用户输入的编号
        int no = EMSUtility.readInt();
        if (no == -1) {
            return;
        }
        // 根据编号定位要修改的目标对象
        Employee target = empService.getEmployee(no - 1);
        if (target == null) {
            System.out.println("--------------指定编号[" + no + "]的员工不存在-----------------");
            return;
        }
        System.out.println("<直接回车表示不修改>");
        System.out.print("姓名(" + target.getName() + ")：");
        String name = EMSUtility.readString(10, target.getName());
        target.setName(name);
        System.out.print("性别(" + target.getGender() + ")：");
        char gender = EMSUtility.readChar(target.getGender());
        target.setGender(gender);
        System.out.print("年龄(" + target.getAge() + ")：");
        int age = EMSUtility.readInt(target.getAge());
        target.setAge(age);
        System.out.print("工资(" + target.getSalary() + ")：");
        double salary = EMSUtility.readDouble(target.getSalary());
        target.setSalary(salary);
        System.out.print("电话(" + target.getPhone() + ")：");
        String phone = EMSUtility.readString(20, target.getPhone());
        target.setPhone(phone);
        System.out.print("邮箱(" + target.getEmail() + ")：");
        String email = EMSUtility.readString(50, target.getEmail());
        target.setEmail(email);
        System.out.println("---------------------修改完成---------------------");
        listAllEmployees();
    }

    /**
     * 删除员工
     */
    private void deleteEmployee () {
        System.out.println("---------------------删除员工---------------------");
        listAllEmployees();
        System.out.print("请选择待删除员工编号(-1退出)：");
        // 获取用户输入的编号
        int no = EMSUtility.readInt();
        if (no == -1) {
            return;
        }
        System.out.print("确认是否删除(Y/N)：");
        // 获取用户输入的确认
        char confirm = EMSUtility.readConfirmSelection();
        if (confirm == 'Y') {
            boolean flag = empService.removeEmploee(no - 1);
            if (flag) {
                System.out.println("---------------------删除完成---------------------");
                listAllEmployees();
            } else {
                System.out.println("---------------------删除失败---------------------");
            }
        }
    }

    /**
     * 员工列表
     */
    private void listAllEmployees() {
        System.out.println("---------------------------------员工列表--------------------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t工资\t\t电话\t\t邮箱");
        // 真的获取所有员工
        Employee[] allEmployees = empService.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println((i + 1) + "\t" + allEmployees[i].toString());
        }
        System.out.println("-----------------------------员工列表完成-------------------------------------");
    }

}