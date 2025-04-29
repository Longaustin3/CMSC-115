import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time in milliseconds: ");
		long millis = input.nextLong();
		System.out.println(convertMillis(millis));
		
	}
	
	public static String convertMillis(long millis) {
		long hours = millis / (1000 * 60 * 60);
		long minutes = (millis / (1000 * 60)) % 60;
		long seconds = (millis / 1000) % 60;
		
		String conversion = String.format("%d:%d:%d", hours, minutes, seconds);
		return conversion;
	}
}
