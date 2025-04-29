public class version2 {

	public static void main(String[] args) {
        // Call the method to perform tasks with different arguments
        operation(2, 3, "addition");
        operation(4, 5, "multiplication");
        operation(10, 3, "subtraction");
    }

    // Method that performs an operation based on the given parameters
    public static void operation(int num1, int num2, String type) {
        int result = 0;

        // Perform the operation based on the type passed as parameter
        switch (type) {
            case "addition":
                System.out.println("\n" + type + ": " + num1 + " + " + num2);
                result = num1 + num2;
                break;
            case "multiplication":
                System.out.println("\n" + type + ": " + num1 + " * " + num2);
                result = num1 * num2;
                break;
            case "subtraction":
                System.out.println("\n" + type + ": " + num1 + " - " + num2);
                result = num1 - num2;
                break;
            default:
                System.out.println("Unknown.");
                return;
        }

        System.out.println("Result: " + result);
    }

}