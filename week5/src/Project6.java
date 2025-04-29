import java.util.Scanner;

public class Project6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// get the 12 digit ISBN from the user
		System.out.print("Enter the first 12 digits of an ISBN number as a string: ");
		String isbn = input.nextLine();
		
		int sum = 0;
		// validate the ISBN
		if (isbn.length() != 12 || !isbn.matches("\\d{12}")) {
			System.out.println(isbn + " is an invalid input");
		} else {
						
			for (int i = 0; i < 12; i++) {
				int digit = Character.getNumericValue(isbn.charAt(i));
				if (i % 2 == 0) {
					sum += digit;
				} else {
					sum += 3 * digit;
				}	
			}
			// calculate checksum
			int checksum = 10 - (sum) % 10;
			
			// if checksum = 10 set it to 0
			if (checksum == 10) {
				checksum = 0;
			}
			
			System.out.println("The ISBN-13 number is " + isbn + checksum);
		}
	}
}


