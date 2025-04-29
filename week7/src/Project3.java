import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		double[][] list = new double[rows][cols];
		
		System.out.println("Enter the array: ");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("The location of the largest element is at (" + locateLargest(list)[0] + ", " + locateLargest(list)[1] + ")");
	}
	
	public static int[] locateLargest(double[][] a) {
		double largest = Double.NEGATIVE_INFINITY;
		int[] location = new int [2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		
		return location;
	}
}
