package Homework1_2;

public class MyDate {
    int year;
    int month;
    int day;

    //判断是否是闰年
    boolean isLeapYear() {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    //根据月份值，返回对应的英语单词
    String monthName() {
        String s = "";
        switch (month) {
            case 1:
                s = "January";
                break;
            case 2:
                s = "February";
                break;
            case 3:
                s = "March";
                break;
            case 4:
                s = "April";
                break;
            case 5:
                s = "May";
                break;
            case 6:
                s = "June";
                break;
            case 7:
                s = "July";
                break;
            case 8:
                s = "August";
                break;
            case 9:
                s = "September";
                break;
            case 10:
                s = "October";
                break;
            case 11:
                s = "November";
                break;
            case 12:
                s = "December";
                break;

        }
        return s;
    }

    //返回这个月的总天数
    int totalDaysOfMonth() {
        int a = 0;
        if (month == 2) {
            if (isLeapYear()) {
                a = 29;
            } else {
                a = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            a = 30;
        } else {
            a = 31;
        }
        return a;
    }

    //返回这一年的总天数
    int totalDaysOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    //返回这一天是当年的第几数
    int daysOfTheYear() {
        int days = 0;
        switch (month) {
            case 12:

                days += 30;
            case 11:

                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += 28;

                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days++;
                }
            case 2:
                days += 31;
            case 1:
                days += day;
        }
        return days;
    }
}
