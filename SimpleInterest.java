import java.util.Scanner;

// Create SimpleInterest class to compute simple interest
class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        double principal;
        double rate;
        double time;

        System.out.print("Enter Principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        input.close();
    }
}