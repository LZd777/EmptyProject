package Test03;

public class HourEmployee extends Employee {
    private int workHour;
    private int hourMoney;

    public double earning() {
        return workHour * hourMoney;
    }

    public String getInfo() {
        return getName() + earning() + workHour + hourMoney;
    }

    public void leave(){

    }
}
