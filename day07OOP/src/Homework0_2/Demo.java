package Homework0_2;

public class Demo {
    public static void main(String[] args) {
        MyDate birthday = new MyDate();
        birthday.year = 1999;
        birthday.month = 11;
        birthday.day = 13;
        System.out.println("我的生日是"+birthday.show());

        MyDate comeDate = new MyDate();
        comeDate.year = 2022;
        comeDate.month = 4;
        comeDate.day = 18;
        System.out.println("我来尚硅谷的日期是"+comeDate.show());


        MyDate leaveDate = new MyDate();
        leaveDate.year = 2022;
        leaveDate.month = 10;
        leaveDate.day = 30;
        System.out.println("我离开尚硅谷的日期是"+leaveDate.show());
    }
}
