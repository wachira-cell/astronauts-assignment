//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.HashMap;
public class astronautics_event {
    public static void mgetAstronauticsEvent(int year) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashMap<Integer, String> events = new HashMap<>();
        events.put(1961, "First manned spaceflight");
        events.put(1969, "First person to walk on the Moon");
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a year to find astronautics events: ");
            year = scanner.nextInt();
            scanner.close();



        }
    }
}