public class Test9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*150);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0 && arr[i]%7 != 0) {
                count++;
            }
        }
        System.out.println("有"+count+"个");
    }
}
