import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeekendOrWeekday {
    public static void main(String[] args) {
        String day = args[0].toLowerCase();
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
        return day.equals("saturday")||(day.equals("sunday"));
    }

    private static boolean isaWeekday(String day) {
        Set<String> WeekdaySet = new HashSet<>(List.of("monday","tuesday","wednesday","thursday","friday"));
        if(WeekdaySet.contains(day)) {
            return true;
        }
        return (false);
    }
}
