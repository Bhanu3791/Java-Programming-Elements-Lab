import java.util.Scanner;

// Create QuotientRemainder class to compute quotient and remainder
class QuotientRemainder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create variables and take user input
        int number1;
        int number2;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        // Compute quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display result
        System.out.println("The Quotient is " + quotient +
                " and Remainder is " + remainder +
                " of two numbers " + number1 +
                " and " + number2);

        input.close();
    }
}