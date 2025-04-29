import java.util.Scanner;

/**
 * PasswordChecker has methods to test for a valid password.
 */
public class PasswordChecker {
	
	/**
	 * Checks whether the string contains a digit.
	 * 
	 *
	 * @param str 
	 * @return true if the string contains a digit; otherwise false
	 */
	public static boolean hasDigit(String str) {
		//TODO: Debug and fix the error
		for (int i = 0; i < str.length(); i++) {
		    char c = str.charAt(i); 
		    if (Character.isDigit(c))
		    	return true;
		}
		return false;
	}
	
	/**
	 * Checks whether the string contains a special character #?!
	 *
	 * @param str 
	 * @return true if the string contains a special character; otherwise false
	 */
	public static boolean hasSpecial(String str) {
		//TODO: Implement
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '?' || c == '!' || c == '-' || c == '#')
				return true;
		}
		return false;
	}
	
	/**
	 * Checks whether the string is a valid password having 
	 * a minimum length of 8 and contains a digit and a special character. 
	 *
	 * @param str 
	 * @return true if the string has 8 or more characters including a digit and a special character; otherwise false
	 */
	public static boolean isValidPassword(String str) {
		//TODO: Implement
		if (hasSpecial(str) && hasDigit(str) && str.length() >= 8)
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password: ");
		String password = input.nextLine();
		
		//Test hasDigit
//		boolean hasDigit = hasDigit(password);
//		System.out.println("Has a digit: " + hasDigit);
		
		//Test hasSpecial
//		boolean hasSpecial = hasSpecial(password);
//		System.out.println("Has a special: " + hasSpecial);
		
		//Test isValidPassword
		boolean isValid = isValidPassword(password);
		System.out.println("Is valid: " + isValid);
		
	}

}
