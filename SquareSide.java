import java.util.Scanner;

// Create SquareSide class to compute side from perimeter
class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        double perimeter;

        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Compute side
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        input.close();
    }
}