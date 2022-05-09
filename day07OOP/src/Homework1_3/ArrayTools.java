package Homework1_3;

public class ArrayTools {
    //求所有元素总和
    int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }

    //求所有元素的最大值
    int max(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length;i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    //查找value在arr数组中第一次出现的下标，如果不存在返回-1
    int indexOf(int[] arr, int value){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value==arr[i]){
                index=i;
                break;
            }
        }
        return index;
    }

    //查找value在arr数组中最后一次出现的下标，如果不存在返回-1
    int lastIndexOf(int[] arr, int value){
            int index = -1;
            for (int i = arr.length-1; i >=0; i++) {
                if (value==arr[i]){
                    index=i;
                    break;
                }
            }
            return index;
    }
}
