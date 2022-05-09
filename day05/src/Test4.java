import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        int age = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位年龄");
            age = sc.nextInt();
            arr[i] = age;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}

