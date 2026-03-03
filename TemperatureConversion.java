import java.util.Scanner;

// Create TemperatureConversion class to convert Celsius to Fahrenheit
class TemperatureConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create variable celsius and take user input
        double celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("The " + celsius + " celsius is " 
                + fahrenheitResult + " fahrenheit");

        input.close();
    }
}