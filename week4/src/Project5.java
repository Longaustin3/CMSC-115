import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String social = input.nextLine();
		
//		// store the first character under a variable
//		char character = social.charAt(0);
		
//		// check if the string is formatted properly as an SSN
//		if (social.length() == 11 && social.charAt(3) == '-' && social.charAt(6) == '-' && Character.isDigit(character)) {
//			System.out.println(social + " is a valid social security number");
//		} else {
//			System.out.println(social + " is an invalid social security number");
//		}
		
		if (social.matches("\\d{3}-\\d{2}-\\d{4}")) {
			System.out.println(social + " is a valid social security number");
	    } else {
	    	System.out.println(social + " is an invalid social security number");
	    }
	}

}
