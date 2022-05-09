package Homework1_3;

public class Demo {
    public static void main(String[] args) {
        ArrayTools tools = new ArrayTools();

        int[] arr = {1,2,10,4,5,10,7,8,9,10};

        System.out.println("元素总和：" + tools.sum(arr));
        System.out.println("最大值：" + tools.max(arr));
        System.out.println("第1次出现10的下标：" + tools.indexOf(arr, 10));
        System.out.println("最后1次出现10的下标：" + tools.lastIndexOf(arr, 10));
        System.out.println("第1次出现3的下标：" + tools.indexOf(arr,3));
    }
}
