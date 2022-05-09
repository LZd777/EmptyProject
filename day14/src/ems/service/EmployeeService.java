package ems.service;

import ems.bean.Employee;

//员工管理类
public class EmployeeService {
    private Employee[] employees;//用来保存员工对象的数组
    private int realCount = 0;              //记录已保存员工对象的数量

    public EmployeeService() {
    }

    //该类至少提供以下方法：

    /**
     * 用途构造器
     *
     * @param totalCount 数组大小
     */
    public EmployeeService(int totalCount) {
        this.employees = new Employee[totalCount];
    }

    /**
     * 传入员工对象，添加至数组
     *
     * @param emp
     * @return
     */
    public boolean addEmployee(Employee emp) {
        if (realCount == this.employees.length) {
            return false;//数组以满
        }
        this.employees[realCount] = emp;
        realCount++;
        return true;
    }

    /**
     * 删除指定索引员工
     * @param index 删除员工索引
     * @return 删除成功返回true；false表示索引无效，无法删除
     */
    public boolean removeEmploee(int index) {
        if (index < 0 || index >= realCount) {//索引超出有效范围
            return false;//删除失败
        }
        //把删除之后的每个元素前移1位
        for (int i = index; i < employees.length; i++) {
            employees[i] = employees[i + 1];
        }
        realCount--;//把员工-1
        employees[realCount] = null;//把最后一个员工z

        return true;
    }

    /**
     * 查找指定索引员工
     * @param index
     * @return
     */
    public Employee getEmployee(int index) {
        if (index >= 0 && index < realCount) {//有效索引
            return employees[index];//返回员工对象
        }
        return null;//表示未找到员工
    }

    //查找员工数组
    public Employee[] getAllEmployees() {
        //创建数组，用于存储有效的员工对象
        Employee[] emps = new Employee[realCount];
        //遍历原来的员工数组，把有效员工复制到新数组
        for (int i = 0; i < realCount; i++) {
            emps[i] = employees[i];
        }
        return emps;
    }
}
