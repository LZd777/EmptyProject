package Homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

        String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");

        int temp = sc.nextInt();
        if (temp >= 1 && temp <= 12) {
            System.out.println(arr[temp - 1]);
        }else {
            System.out.println("输入不合法");
        }
    }
}

