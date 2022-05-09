package Homework;

public class Homework05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int[] arr1 = {1, 2, 3, 4, 5, 2, 1};
        boolean b = true;


        for (int i = 0; i < arr.length; i++) {
            b = true;
            if (arr[i] == arr[arr.length - 1 - i]) {
            } else {
                b = false;
                break;
            }
        }

        System.out.println(b ? "对称" : "不对称");

        for (int i = 0; i < arr1.length; i++) {
            b = true;
            if (arr1[i] == arr1[arr1.length - 1 - i]) {
            } else {
                b = false;
                break;
            }
        }
        System.out.println(b ? "对称" : "不对称");

    }

}
