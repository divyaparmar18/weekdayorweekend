import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class WeekendOrWeekday {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the day");
        String day = obj.next();
        if(day.equalsIgnoreCase("monday")){
            System.out.println("The day you entered is a weekday");
        }
        else if(day.equalsIgnoreCase("tuesday")){
            System.out.println("The day you entered is weekday");
        }
        else if(day.equalsIgnoreCase("wednesday")){
            System.out.println("The day you entered is weekday");
        }
        else if(day.equalsIgnoreCase("thursday")){
            System.out.println("The day you enterd is weekday");
        }
        else if(day.equalsIgnoreCase("friday")){
            System.out.println("The day you have entered is weekday");
        }
        else if(day.equalsIgnoreCase("saturday")){
            System.out.println("Yeah! the day you have entered is a weekend");
        }
        else if(day.equalsIgnoreCase("sunday")){
            System.out.println("Yeah! the day you have entered is a weekend");
        }
        else{
            System.out.println("invalid in put");
        }
    }
}
