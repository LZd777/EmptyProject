package Homework;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年:");
        int year = sc.nextInt();
        int days = 0;
        int dayn = 0;

        if (year >= 2000) {

            System.out.print("请输入月:");
            int month = sc.nextInt();

            if (month > 0 && month < 13) {

                System.out.print("请输入日:");
                int day = sc.nextInt();

                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    dayn = 30;
                } else if (month == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        dayn = 29;
                    } else {
                        dayn = 28;
                    }
                } else {
                    dayn = 31;
                }
                if (day <= dayn && day > 0) {
                    for (int k = 2000; k <=year; k++) {
                        if(k==year){

                    for (int i = 1; i < 13; i++) {
                        if (i == month) {
                            days += day;
                            break;
                        } else {
                            if (i == 4 || i == 6 || i == 9 || i == 11) {
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
                    //System.out.println(days);
                            System.out.println((days%5)<4&&(days%5)>0?"打鱼":"晒网");

                    }else{
                            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                                days += 366;
                            } else {
                                days += 365;
                            }
                        }
                    }
                } else {
                    System.out.println("输入日不合法");
                }
            } else {
                System.out.println("输月不合法");
            }
        } else {
            System.out.println("输年不合法");
        }


    }

}
