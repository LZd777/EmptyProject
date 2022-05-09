import jdk.internal.org.objectweb.asm.tree.MethodInsnNode;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {11, 24, -5, 23, -6, 16, 9, 33, 22};
        int max ;
        max = arr[0];
        int min;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("数组中的最大数是" + max);
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("数组中的最小数是" + min);

    }
}
