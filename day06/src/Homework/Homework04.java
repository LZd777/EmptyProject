package Homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        char[] koiFishWords = {'一', '今', '地', '定', '尚', '年', '开', '我', '果', '火', '爱', '硅', '结', '花', '谷', '遍'};
        System.out.println(koiFishWords.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汉字");
        char word = sc.next().charAt(0);
        sc.close();

        int index = -1;

        for (int left = 0, right = koiFishWords.length - 1; left <= right; ) {
            int mid = (left + right) / 2;
            if (koiFishWords[mid] == word) {
                index = mid;
                break;
            } else if (word >= koiFishWords[mid]) {
                left = mid + 1;
            } else if (word <= koiFishWords[mid]) {
                right = mid - 1;
            }

        }
        if(index!=-1){
            System.out.println("恭喜获得锦鲤红包500元");
        }else{
            System.out.println("再接再厉");
        }
    }
}