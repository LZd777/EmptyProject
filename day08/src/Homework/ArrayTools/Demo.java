package Homework.ArrayTools;

public class Demo {
    public static void main(String[] args) {
        ArrayTools tools = new ArrayTools();

        int[] arr = {2,4,1,3,6};
        System.out.println("排序前：" + tools.toString(arr));
        tools.sort(arr);
        System.out.println("排序后：" + tools.toString(arr));
        System.out.println("查找5：" + tools.binarySearch(arr, 5));

        char[] letters = {'h','e','w','o','d'};
        System.out.println("排序前：" + tools.toString(letters));
        tools.sort(letters);
        System.out.println("排序后：" + tools.toString(letters));
        System.out.println("查找'a'：" + tools.binarySearch(letters, 'a'));

        double[] nums = {2.3, 1.5, 2.0, 3.5, 3.0};
        System.out.println("排序前：" + tools.toString(nums));
        tools.sort(nums);
        System.out.println("排序后：" + tools.toString(nums));
        System.out.println("查找1.5：" + tools.binarySearch(nums, 1.5));
    }
}
