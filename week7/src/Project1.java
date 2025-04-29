import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int students = input.nextInt();
		
		int[] scores = new int[students];

		System.out.print("Enter " + students + " scores: ");
		
		for (int i = 0; i < students; i++) {
			scores[i] = input.nextInt();
		}
		
		for (int i = 0; i< students; i++) {
			System.out.println("Student " + i + " score is " + (1.0 * scores[i]) + " and grade is " + calculateGrade(scores[i], scores));
		}

	}
	
	public static int getHighest(int[] arr) {
		int highest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				highest = arr[i];
			}
		}
		return highest;
		
	}
	
	public static char calculateGrade(int score, int[]scores) {
		char grade = 'F';
		int best = getHighest(scores);
		if (score >= best - 10) {
			grade = 'A';
		} else if (score >= best - 20) {
			grade = 'B';
		} else if (score >= best - 30) {
			grade = 'C';
		} else if (score >= best - 40) {
			grade = 'D';
		}
		return grade;
	}
	
}
