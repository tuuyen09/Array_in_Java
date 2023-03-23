import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != -1) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    float f = scanner.nextFloat();
                    double c = (5.0 / 9) * (f - 32);
                    System.out.println("Celsius = " + c);
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    float cel = scanner.nextFloat();
                    double fah = (9.0 / 5 * cel) + 32;
                    System.out.println("Fahrenheit = " + fah);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}
