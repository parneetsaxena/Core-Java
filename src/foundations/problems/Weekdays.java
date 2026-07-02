package foundations.problems;

enum Weekday{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class Weekdays {
    public static void main(String[] args) {
        Weekday day = Weekday.FRIDAY;
        switch(day){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY:
                System.out.println("Working day");
                break;
            case SATURDAY,SUNDAY:
                System.out.println("Holiday");
                break;
        }
    }
}
