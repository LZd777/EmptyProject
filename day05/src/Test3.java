public class Test3 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        char[] arr1 = new char[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('a' + i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"->" + (char) (arr[i] - 32));
        }
    }
}