public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.chang =8;
        r.kuan =5;
        int mianji = r.mianji(r.chang, r.kuan);
        System.out.println("面积是" +mianji);
        int zhouchang = r.zhouchang(r.chang, r.kuan);
        System.out.println("周长是"+zhouchang);
        r.show(r.chang,r.kuan);
    }
}

