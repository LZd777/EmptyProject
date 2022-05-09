package Homework1_2;

public class Demo {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.year = 2022;
        myDate.month = 4;
        myDate.day = 27;

        boolean b = myDate.isLeapYear();
        System.out.println("判断是否是闰年" + b);

        String world = myDate.monthName();
        System.out.println("现在是" + world);

        int totalDaysOfMonth = myDate.totalDaysOfMonth();
        System.out.println("这个月的总天数"+totalDaysOfMonth);

        int totalDaysOfYear = myDate.totalDaysOfYear();
        System.out.println("这一年的总天数"+totalDaysOfYear);

        int daysOfTheYear = myDate.daysOfTheYear();
        System.out.println("这一天是当年的第"+daysOfTheYear+"天");
    }
}
