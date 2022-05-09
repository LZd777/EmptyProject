package Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println("请输入一个单词");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] arr = word.toCharArray();

        boolean b = true;
        for (int i = 0; i < arr.length - i; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println(word + "是回文单词");
        } else {
            System.out.println(word + "不是回文单词");

        }


    }
}
