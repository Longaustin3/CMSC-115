import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Get the month from the user
		System.out.println("Enter a month in the year (e.g., 1 for Jan): ");
		int month = input.nextInt();
		
		// Get the year from the user
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		// check the year for a leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
				
		// declare the variables for the monthName and days that will be used in the switch case
		String monthName = "";
		int days = 0;		
		
		// Check which month and assign it a name, then assign days depending on which month is executed
		switch (month) {
			case 1: 
				monthName = "January";
				days = 31;
				break;
			case 2:
				monthName = "February";
				if (isLeapYear) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 3:
				monthName = "March";
				days = 31;
				break;
			case 4:
				monthName = "April";
				days = 30;
				break;
			case 5:
				monthName = "May";
				days = 31;
				break;
			case 6:
				monthName = "June";
				days = 30;
				break;
			case 7:
				monthName = "July";
				days = 31;
				break;
			case 8:
				monthName = "August";
				days = 31;
				break;
			case 9:
				monthName = "September";
				days = 30;
				break;
			case 10:
				monthName = "October";
				days = 31;
				break;
			case 11:
				monthName = "November";
				days = 30;
				break;
			case 12:
				monthName = "December";
				days = 31;
				break;
		}
		
		System.out.println(monthName + " " + year + " has " + days + " days");
	}

}
