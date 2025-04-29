import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		System.out.println("The formatted number is " + format(num, width));
		
	}
	
	public static String format(int number, int width) {
		String formattedString = String.format("%0" + width + "d", number);
		return formattedString;
	}
}
