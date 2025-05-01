import java.util.Scanner;

public class CallCostCalculator {

    public static double calculateCost(String operator, int seconds) {
        double costPerSecond = 0.0;

        // Determine the cost per second based on the operator
        if (operator.equalsIgnoreCase("Nerto")) {
            costPerSecond = 0.10; // 10 cents
        } else if (operator.equalsIgnoreCase("Quadro")) {
            costPerSecond = 0.20; // 20 cents
        } else if (operator.equalsIgnoreCase("Resto")) {
            costPerSecond = 0.215; // 21.5 cents
        } else {
            return -1; // Invalid operator
        }

        // Calculate the total cost
        return costPerSecond * seconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the operator name
        System.out.print("Enter the operator (Nerto, Quadro, Resto): ");
        String operator = scanner.nextLine();

        // Prompt the user to input the number of seconds
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        // Calculate and display the communication cost
        double cost = calculateCost(operator, seconds);
        if (cost == -1) {
            System.out.println("Invalid operator. Please choose one of the following: Nerto, Quadro, Resto.");
        } else {
            System.out.printf("The communication cost for %d seconds with %s operator is %.2f dollars.\n", seconds, operator, cost);
        }

        scanner.close();
    }
}
