public class Test2 {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        int n = t2.eatPeach(10);
        System.out.println(n);
/*        int x =1;
        for (int i = 0; i < 10; i++) {
            x = (x+1)*2;
            System.out.println(x);
            }*/

    }

    int eatPeach(int n){
        if (n==1){
            return 1;
        }
        return eatPeach(n-1)*2+2;

    }
}
