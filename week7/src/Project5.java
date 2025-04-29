import java.util.Scanner;

public class Project5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Get the size of the list
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();

        // Initialize the array based on the size
        int[] list = new int[size];

        // Get the elements of the list from the user
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        // Print the list
        System.out.print("The list has " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(); // Newline after the list

        // Check if the list is sorted
        System.out.println(isSorted(list) ? "The list is already sorted" : "The list is not sorted");
	}

	public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] >= list[i + 1]) {
                return false; // If any element is greater than the next, the list is not sorted
            }
        }
        return true; // If no such pair is found, the list is sorted
    }
}
