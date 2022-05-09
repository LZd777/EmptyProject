public class Test6 {
    public static void main(String[] args) {
        int[] arr = {11,32,54,67,45,45,34,56,345,34,23,34,54};
        int a = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum += arr[i];
                a++;
            }
        }
        System.out.println("有"+a+"个偶数，偶数和为"+sum);
    }
}
