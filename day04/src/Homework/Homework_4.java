package Homework;

public class Homework_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(i==9/2-j||i==9/2+j||j==9/2+i||j==9/2+(9-i-1)){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
