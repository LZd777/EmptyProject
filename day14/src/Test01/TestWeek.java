package Test01;

public class TestWeek {
    public static void main(String[] args) {
       Week week = Week.SATURDAY;
        switch(week){
            case MONDAY:
                System.out.println( week.toString());
            break;
            case TUESDAY:
                System.out.println( week.toString());
            break;
            case WEDNESDAY:
                System.out.println( week.toString());
            break;
            case THURSDAY:
                System.out.println( week.toString());
            break;
            case FRIDAY:
                System.out.println( week.toString());
            break;
            case SATURDAY:
                System.out.println( week.toString());
            break;
            case SUNDAY:
                System.out.println( week.toString());
            break;

        }
    }
}
