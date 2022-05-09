package Homework;

public class Homework03 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('a' + i);
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 10 >= 0 && i % 10 < 9 && i != 25) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }

        }
        System.out.println("小写字母的倒序排序：");

        for (int i = arr.length-1; i >= 0; i--) {
            count++;
            if(count == 10 || i == 0){
                System.out.println(arr[i]);
                count = 0;
            }else if(count < 10) {
                System.out.print(arr[i]+",");
            }
        }

    }
}