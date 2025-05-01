import java.util.Scanner;

public class WeekdayChecker {

    public static String checkDayType(String day) {
        // Use a switch expression with lambda syntax to determine work day or weekend
        return switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> "work day";
            case "saturday", "sunday" -> "weekend";
            default -> "wrong day of the week name";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the name of the day
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().trim();

        // Get the result based on the day
        String result = checkDayType(day);

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}
