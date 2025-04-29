import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get the number of sides and length from the user
		System.out.print("Enter the number of sides: ");
		int numOfSides = input.nextInt();
		System.out.print("Enter the length of a side: ");
		double sideLength = input.nextDouble();
		
		// calculate the area of the polygon
		double area = (numOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numOfSides));
		
		// display the area to the user
		System.out.printf("The area of the polygon is %.4f", area);
	}

}
