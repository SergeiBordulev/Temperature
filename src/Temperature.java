import java.util.Scanner;

public class Temperature {
    private static double convertToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    private static double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in degrees Celsius (example 20,5):");
        double celsiusTemperature = scanner.nextDouble();

        System.out.println("Temperature in Kelvin: " + convertToKelvin(celsiusTemperature));
        System.out.println("Temperature in Fahrenheit: " + convertToFahrenheit(celsiusTemperature));
    }
}
