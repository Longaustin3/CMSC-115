import java.util.Scanner;
 
public class ProjectFive {

    // Method to calculate the distance between two cities
    public static double calculateDistance(double[] city1, double[] city2) {
        return Math.sqrt(Math.pow(city1[0] - city2[0], 2) + Math.pow(city1[1] - city2[1], 2));
    }

    // Method to find the central city and its total distance
    public static double[] findCentralCity(double[][] cities, int numCities) {
        double minTotalDistance = Double.MAX_VALUE;
        double[] centralCity = null;
        
        // Iterate through each city and calculate the total distance to all other cities
        for (int i = 0; i < numCities; i++) {
            double totalDistance = 0;
            for (int j = 0; j < numCities; j++) {
                if (i != j) {
                    totalDistance += calculateDistance(cities[i], cities[j]);
                }
            }
            // Update the central city if the current city has a smaller total distance
            if (totalDistance < minTotalDistance) {
                minTotalDistance = totalDistance;
                centralCity = cities[i];
            }
        }
        
        // Return both the central city and its total distance
        return new double[] { centralCity[0], centralCity[1], minTotalDistance };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the number of cities
        System.out.print("Enter the number of cities: ");
        int numCities = scanner.nextInt();
        
        // Ask the user to input the coordinates of the cities
        double[][] cities = new double[numCities][2];
        System.out.print("Enter the coordinates of the cities: ");
        
        for (int i = 0; i < numCities; i++) {
            cities[i][0] = scanner.nextDouble();
            cities[i][1] = scanner.nextDouble();
        }
        
        // Find the central city and its total distance
        double[] result = findCentralCity(cities, numCities);
        
        // Output the result
        System.out.printf("The central city is at (%.1f, %.1f)\n", result[0], result[1]);
        System.out.printf("The total distance to all other cities is %.15f\n", result[2]);
    }

}
