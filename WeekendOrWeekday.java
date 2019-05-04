import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the day");
        String day = obj.next();
        if(day.equals("monday")||(day.equals("MONDAY"))) {
            System.out.println("The day you entered is a weekday");
        }
        else if(day.equals("tuesday")||(day.equals("TUESDAY"))){
            System.out.println("The day you entered is weekday");
        }
        else if(day.equals("wednesday")||(day.equals("WEDNESDAY"))){
            System.out.println("The day you entered is weekday");
        }
        else if(day.equals("thursday")||(day.equals("THURSDAY"))){
            System.out.println("The day you enterd is weekday");
        }
        else if(day.equals("friday")||(day.equals("FRIDAY)"))){
            System.out.println("The day you have entered is weekday");
        }
        else if(day.equals("saturday")||(day.equals("SATURDAY"))){
            System.out.println("Yeah! the day you have entered is a weekend");
        }
        else if(day.equals("sunday")||(day.equals("SUNDAY"))){
            System.out.println("Yeah! the day you have entered is a weekend");
        }
    }
}
