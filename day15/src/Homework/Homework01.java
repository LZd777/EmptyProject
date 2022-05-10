package Homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入绳子长度：");
        int length = sc.nextInt();
        int sum_l = 0; // 直线上点位距离和
        int[] arr = {2,3,4,5,2,3,6,7,9,0};
        for (int i = 0; i <arr.length ; i++) {
            sum_l += arr[i];
            // 当指点上点位距离和大于等于绳长时，输出点位个数
            if (sum_l >= length){
                System.out.println("直线点位长度："+sum_l);
                System.out.println("绳长为"+length+"覆盖"+(i+1)+"个点");
                break;
            }
        }
    }

}
