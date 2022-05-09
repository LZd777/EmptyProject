package ems.bean;

public class Employee {
    private String name;//姓名
    private char gender;// 性别
    private int age;//年龄
    private double salary;// 工资
    private String phone;//电话号码
    private String email;//电子邮箱

    public Employee() {
    }

    public Employee(String name, char gender, int age, double salary, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Emoloyee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


