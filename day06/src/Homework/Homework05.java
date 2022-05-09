package Homework;

public class Homework05 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,2,2,3};

        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num ^= arr[i];
        }

        System.out.println("出现奇数次的是：" + num);
    }
}
