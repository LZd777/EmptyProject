package Homework.ArrayTools;

public class ArrayTools {
    int binarySearch(char[] arr, char value) {
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    int binarySearch(int[] arr, int value) {
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    int binarySearch(double[] arr, double value) {
        for (int left = 0, right = arr.length - 1; left <= right; ) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    String toString(int[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i];
            }
        }
        result += "}";
        return result;
    }

    String toString(char[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i];
            }
        }
        result += "}";
        return result;
    }

    String toString(double[] arr) {
        String result = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result += arr[i] + ",";
            } else {
                result += arr[i];
            }
        }
        result += "}";
        return result;
    }
}


