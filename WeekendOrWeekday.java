public class WeekendOrWeekday {
    public static void main(String[] args) {
        String day = args[0];
        if(isaWeekday(day)) {
            System.out.println("The day you entered is a weekday, so you have to work");
        }
        else if (isaWeekend(day)){
            System.out.println("Yeah! the day you entered is weekend, you can take rest");
        }
        else{
            System.out.println("invalid in put");
        }
    }

    private static boolean isaWeekend(String day) {
        return day.equalsIgnoreCase("saturday")||(day.equalsIgnoreCase("sunday"));
    }

    private static boolean isaWeekday(String day) {
        return day.equalsIgnoreCase("monday")||(day.equalsIgnoreCase("tuesday"))||(day.equalsIgnoreCase("wednesday"))||(day.equalsIgnoreCase("thursday"))||(day.equalsIgnoreCase("friday"));
    }
}
