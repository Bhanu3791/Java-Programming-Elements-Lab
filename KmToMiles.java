// Create KmToMiles class to convert kilometers to miles
class KmToMiles {
    public static void main(String[] args) {

        // Create variable distanceInKm and assign 10.8
        double distanceInKm = 10.8;

        // Create conversion factor variable
        double conversionFactor = 1.6;

        // Calculate miles
        double distanceInMiles = distanceInKm / conversionFactor;

        // Display result
        System.out.println("The distance " + distanceInKm +
                " km in miles is " + distanceInMiles);
    }
}