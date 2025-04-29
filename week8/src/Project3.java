import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and columns
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Initialize the 2D array
        double[][] array = new double[rows][cols];

        // Read the elements of the array
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        // Call locateLargest to find the location of the largest element
        Location location = locateLargest(array);

        // Display the result
        System.out.println("The location of the largest element is at (" + location.x + "," + location.y + ")");
    }

    public static Location locateLargest(double[][] a) {
        // Initialize the Location object
        Location location = new Location();

        // Assume the first element is the largest
        double m = a[0][0]; // maxValue
        int x = 0; // row index
        int y = 0; // column index

        // Traverse the array to find the largest value
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > m) {
                    m = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        // Set the Location object values
        location.maxValue = m;
        location.x = x;
        location.y = y; 

        return location;
    }
}

class Location {
    // fields to store the location information
    int x;
    int y;
    double maxValue;
}
