package Homework;

public class Homework03 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }

        System.out.println("--------");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(i);
        }

        System.out.println("--------");
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j - i > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2-1; j++) {
                System.out.print(i);
            }
            System.out.println(i);
        }

    }
}
