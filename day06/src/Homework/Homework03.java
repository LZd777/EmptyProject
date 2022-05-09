package Homework;

import java.io.InputStream;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学员人数");
        int size = sc.nextInt();
        int[] scoreArr = new int[size];
        String[] nameArr = new String[size];
        boolean b = false;

        for (int i = 0; i < scoreArr.length; i++) {

            System.out.println("请输入学员名字");
            String name = sc.next();
            nameArr[i] = name;

            System.out.println("请输入学员分数");
            int score = sc.nextInt();
            scoreArr[i] =score;

        }


        System.out.println("本班的满分学员:");
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(nameArr[i]+"的成绩是"+scoreArr[i]);
            if (100 == scoreArr[i]){
                System.out.println(nameArr[i]);
            }
        }


        if (!b){
            System.out.println("没有满分学员" );
        }


    }
}
