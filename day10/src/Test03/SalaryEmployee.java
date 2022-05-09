package Test03;

public class SalaryEmployee extends Employee{
    private double xinzi;
    private int workday;
    private int holiday;

    @Override
    public double earning(){
        return xinzi - xinzi/workday * holiday;
    }
    @Override
    public String getInfo(){
        return getName() + earning()+xinzi+workday+holiday;
    }

    public SalaryEmployee(double xinzi, int workday, int holiday) {
        this.xinzi = xinzi;
        this.workday = workday;
        this.holiday = holiday;
    }

    public double getXinzi() {
        return xinzi;
    }

    public void setXinzi(double xinzi) {
        this.xinzi = xinzi;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }
}
