import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int positiveCount = 0;
		int negativeCount = 0;
		int total = 0;
		int count = 0;
		
		// Ask the user to enter the integers
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		// while loop to run until a 0 is encountered
		while (true) {
			int userInp = input.nextInt();
			// break the loop if the int is 0
			if (userInp == 0) {
				break;
			}
			// add to the positive or negative counts depending on the integer
			if (userInp > 0) {
				positiveCount++;
			} else if (userInp < 0) {
				negativeCount++;
			}
			// add the integer to the total and increment count
			total += userInp;
			count++; 
		}
		// as long as there is at least one integer other than 0 (count > 0) then calculate the following
		if (count > 0) {
			double average = (double) total / count;
			System.out.println("The number of positives is " + positiveCount);
			System.out.println("The number of negatives is " + negativeCount);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);
		} else {
			System.out.println("No numbers are entered except 0");
		}
	}
}