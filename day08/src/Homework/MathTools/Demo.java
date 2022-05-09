package Homework.MathTools;

public class Demo {
    public static void main(String[] args) {
        MathTools tools = new MathTools();

        System.out.println("1,2,3,4,5都是偶数吗？" + tools.isEven(1,2,3,4,5));
        System.out.println("1,2,3,4,5都是正数吗？" + tools.isPositive(1,2,3,4,5));
        int[] array = tools.toArray(1, 2, 3, 4, 5);
        System.out.println("array数组的元素：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
