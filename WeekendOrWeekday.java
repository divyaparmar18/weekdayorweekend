import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the day");
        String day = obj.next();
        if(day.equalsIgnoreCase("monday")||(day.equalsIgnoreCase("tuesday"))||(day.equalsIgnoreCase("wednesday"))||(day.equalsIgnoreCase("thursday"))||(day.equalsIgnoreCase("friday"))) {
            System.out.println("The day you entered is a weekday, so you have to work");
        }
        else if (day.equalsIgnoreCase("saturday")||(day.equalsIgnoreCase("sunday"))){
            System.out.println("Yeah! the day you entered is weekend, you can take rest");
        }
        else{
            System.out.println("invalid in put");
        }
    }
}
