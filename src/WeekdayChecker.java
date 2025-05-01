import java.util.Scanner;

public class WeekdayChecker {

    public static String checkDayType(String day) {
        // Use switch statement to determine if the day is a work day or a weekend
        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return "work day";
            case "saturday":
            case "sunday":
                return "weekend";
            default:
                return "wrong day of the week name";
        }
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
