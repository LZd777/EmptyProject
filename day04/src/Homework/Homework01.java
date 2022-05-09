package Homework;

public class Homework01 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                if (i % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
    }
}
