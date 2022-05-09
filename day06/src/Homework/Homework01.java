package Homework;

public class Homework01 {
    public static void main(String[] args) {
        int[] arr =new int[10];
        for (int i = 0; i < arr.length; i++) {
            int temp = (int)(Math.random()*100-1);
            if (temp%2==0){
                arr[i] = temp;
            }else {
                arr[i] = temp+1;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp;
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
