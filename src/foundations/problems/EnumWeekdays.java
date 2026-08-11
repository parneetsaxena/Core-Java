package foundations.problems;

enum Weekday{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumWeekdays {
    public static void main(String[] args) {
        Weekday day = Weekday.SUNDAY;
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
