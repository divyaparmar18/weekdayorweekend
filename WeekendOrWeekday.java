import java.util.Scanner;
public class WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the day");
        String day = obj.next();
        if(day.equals("monday")||(day.equals("MONDAY"))) {
            System.out.println("The day you entered is a weekday");
        }
    }
}
