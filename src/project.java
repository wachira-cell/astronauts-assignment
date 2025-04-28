import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        int person=5;
        int crew;
        crew=++person;
        crew=++person;
        crew=++person;
        crew=++person;
        crew=++person;
        System.out.println(crew);
        double liter=10;//liters per day
        double day=2;//the number of days
        liter*=day;
        System.out.println("The numbers of litres in 10 days is"+liter);
        double diameter=10;//diameter of planet alpha in m
        double length=Math.PI*diameter;
        System.out.println("The length of the planet alpha is"+length);
        double speed=10;//speed of the first astronaut(in m/s)
        double time=4;//time in s
        double distance=3*speed*time;
        System.out.println(distance);
        int n = 50;  // Steps by Astronaut 1 on the  1
        int p = 2;   // Multiplier for Astronaut 2

        // Astronaut 2's steps:
        int steps2 = n * (p - (-1));

        // Astronaut 3's steps:
        int steps3 = steps2 - (-100);

        // Total steps:
        int totalSteps = n - (-steps2) - (-steps3);

        System.out.println("Total steps walked by all astronauts: " + totalSteps);
        int number=9;//number of astronauts
        int capacity=5;
        boolean below_capacity=number <= capacity;
        System.out.println(below_capacity);
        double liter1=6 ;//volume of oxygen taken by an atsronaut per minute
        int minute=6;//amount of time in minutes in space
        double ballon=60;//ballon capacity
        boolean Ispossible=liter1*minute <= ballon;
        System.out.println(Ispossible);
        int value=10;//volume of water in liters taken by each astronaut per day
        int generalValue=1000;//volume of water in liters  in the  spaceship
        boolean enough_water=person*value*day <= generalValue;
        System.out.println(enough_water);
        double height;//height jumped on the earth
        double shipHeight;//spaceship height on planet Alpha
        double h;//height multiplier
        double alpha_jump=height*h;
        boolean can_jump=alpha_jump > shipHeight;
        System.out.println(can_jump);
        Scanner sc=new Scanner(System.in);
        System.out.print("HOW MANY PLANETS ARE IN THE SOLAR SYSTEM? ");
        Scanner scanner;
        int answer = scanner.nextInt();
        if(answer==8) {
            System.out.println("YES");
    } else {
        System.out.println("NO");
    }
        scanner.close();
        Scanner scanner = new Scanner(System.in);
        System.out.print("HOW MANY PLANETS ARE IN THE SOLAR SYSTEM? ");
        int answer = scanner.nextInt();
        if (answer == 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        if (numberOfStudents % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        String result = (numberOfStudents % 2 == 0) ? "YES" : "NO";
        System.out.println(result);

        scanner.close();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius (r): ");
        double r = scanner.nextDouble();
        System.out.print("Enter the x coordinate: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y coordinate: ");
        double y = scanner.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        String zone = (distance < r) ? "green zone" :
                (distance == r) ? "yellow zone" :
                        "zone of death";

        System.out.println(zone);

        scanner.close();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of applicants: ");
        int a = scanner.nextInt();
        System.out.print("Enter the number of cups: ");
        int c = scanner.nextInt();
        double cupsPerApplicant = (double) c / a;
        System.out.println("Each applicant can get " + cupsPerApplicant + " cups.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of lunar soil (kg): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of guests: ");
        int g = scanner.nextInt();
        float soilPerGuest = (float) m / (float) g;
        System.out.println("Each guest gets " + soilPerGuest + " kg of lunar soil.");
        int num = 70;
        char character = (char) num;
        System.out.println("The character corresponding to integer " + num + " is: " + character);
        char s = 'S';
        char o = 'O';
        int signalValue = (int) s + (int) o + (int) s;
        System.out.println("The numerical equivalent of the SOS signal is: " + signalValue);
        String[] binaryStrings = {
                "01001000",
                "01100101",
                "01101100",
                "01101100",
                "01101111"
        };
        for (String binary : binaryStrings) {
            char character = (char) Integer.parseInt(binary, 2); // Convert binary to integer, then to char
            System.out.print(character);
        }













    }
}