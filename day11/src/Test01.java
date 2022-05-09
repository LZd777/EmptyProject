public class Test01 {
    public static void main(String[] args) {
 //       Daughter d = new Daughter();
//        d.test();
    }


    class Father {
        protected int num = 10;

        public int getNum() {
            return num;
        }
    }

    class Son extends Father {
        private int num = 20;

        public void test() {
            System.out.println(getNum());//10
            System.out.println(this.getNum());//10
            System.out.println(super.getNum());//10
        }
    }

    class Daughter extends Father {
        private int num = 20;

        @Override
        public int getNum() {
            return num;
        }

        public void test() {
            System.out.println(getNum());//20
            System.out.println(this.getNum());//20
            System.out.println(super.getNum());//10
        }
    }
}
