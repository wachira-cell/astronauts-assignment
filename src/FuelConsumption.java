//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class FuelConsumption {

    public static String calculateFuelConsumption(String planet) {
        // Define the fuel consumption per million km
        double fuelPerMillionKm = 1.0; // 1 ton of fuel per 1 million km

        // Define the distance to each planet
        double distanceToSaturn = 1195;  // Saturn's distance in million km
        double distanceToUranus = 2600;  // Uranus' distance in million km

        // Determine the fuel consumption for the specified planet
        if (planet.equalsIgnoreCase("Saturn")) {
            double fuelNeeded = distanceToSaturn * fuelPerMillionKm;
            return "Fuel consumption to Saturn: " + fuelNeeded + " tons";
        } else if (planet.equalsIgnoreCase("Uranus")) {
            double fuelNeeded = distanceToUranus * fuelPerMillionKm;
            return "Fuel consumption to Uranus: " + fuelNeeded + " tons";
        } else {
            return "Fuel consumption cannot be calculated.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the planet name
        System.out.print("Enter the name of the planet (e.g., Saturn, Uranus): ");
        String planet = scanner.nextLine();

        // Display the fuel consumption message
        System.out.println(calculateFuelConsumption(planet));

        scanner.close();
    }
}

