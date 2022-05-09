public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

        for (int i = 0; i < arr.length; i+=2) {
            if ((arr[i] - 2 )% 2 != 0 && arr[i] != 1&&arr[i]!=0){
                for (int j = 1; j < arr[i]-1; j++) {
                    if (arr[i]%j ==0){
                        System.out.println(arr[i]);
                        break;
                    }
                }
            } else if (arr[i] == 2){
                System.out.println(arr[i]);
            }

        }

    }
}
