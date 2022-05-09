package Test01;

public enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    @Override
    public String toString() {
        return weekName;
    }

    String weekName;

    Week(String weekName) {
        this.weekName = weekName;
    }
}
