package Homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年:");
        int year = sc.nextInt();

        System.out.print("请输入月:");
        int month = sc.nextInt();

        System.out.print("请输入日:");
        int day = sc.nextInt();

        int days = 0;

        for (int i = 1; i < 13; i++) {
            if (i == month) {
                days += day;
                break;
            } else {
                if (i == 4 && i == 6 && i == 9 && i == 11) {
                    days += 30;
                } else if (i == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days += 29;
                    } else {
                        days += 28;
                    }
                } else {
                    days += 31;
                }
            }
        }
        System.out.println(days);

    }
}
