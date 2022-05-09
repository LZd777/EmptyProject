import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        String[] arr = new String[8];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位姓名");

            arr[i] = sc.next();;
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
