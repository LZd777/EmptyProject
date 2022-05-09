package Test03;

public class Manager extends SalaryEmployee {
    public Manager(double xinzi, int workday, int holiday) {
        super(xinzi, workday, holiday);
    }

    public Manager(double xinzi, int workday, int holiday, double jiangjin, double jiangjinbili) {
        super(xinzi, workday, holiday);
        this.jiangjin = jiangjin;
        this.jiangjinbili = jiangjinbili;
    }

    private double jiangjin;
    private double jiangjinbili;

    @Override
    public double earning() {
        return getXinzi() - getXinzi()/getWorkday() * getHoliday();
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
