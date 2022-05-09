public class Rectangle {
    int chang;
    int kuan;

    public int mianji(int  chang ,int kuan) {
        int mianj = chang * kuan;

        return mianj;
    }

    public int zhouchang(int  chang ,int kuan) {
        int zhouchang = (chang + kuan) * 2;

        return zhouchang;
    }
    public void show(int  chang ,int kuan) {
        System.out.println("长："+chang+"  宽："+kuan+"  周长："+zhouchang(chang,kuan)+"  面积："+mianji(chang,kuan));
    }
}
