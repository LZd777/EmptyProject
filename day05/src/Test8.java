public class Test8 {
    public static void main(String[] args) {
        int[] arr = {144, 21, 45, 38, 436, 7, 54, 23, 23, 34};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+"  ");

            }
            System.out.println();
        }
    }
}
