public class Test1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        int n = t1.digui(4);
        System.out.println(n);
    }

    int digui(int n){
     if (n==1){
         return 1;
     }//else {}
         return digui(n - 1) * n;

    }

}
