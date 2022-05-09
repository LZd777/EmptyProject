package Homework;

public class Homework04 {
    public static void main(String[] args) {
        char[] arr = new char[26 * 2 + 10];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('a' + i);
            arr[i + 26] = (char) ('A' + i);
        }

        for (int i = 0; i < 10; i++) {
            arr[arr.length - 1 - i] = (char) ('9' - i);
        }


        String s = "";
        for (int i = 0; i < 6; i++) {
            int index = (int)(Math.random()*arr.length);
            s += arr[index];
        }

        System.out.println("验证码是："+s );

    }
}
