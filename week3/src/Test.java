public class Test {
    public static void main(String[] args) {
        int num = 3;  // Let's assume we are checking the number 3 for all cases.

        
//        Nested if example
        
//        A nested if statement is a great way to check multiple conditions in a hierarchical way. In the example, the program checks if the number is greater than 0 to see if it 
//        is a positive number. Once the number has proven to be positive, the program uses another if statement to check if the number is also an even number. There could then be 
//        another if statement inside of that one that could check if the number was also divisible by 5, there isn’t a limit in java to level of nested if statements that you can 
//        use (Ngugi, 2024). If this was a multi-way if statement, it would terminate once the first true condition is found and would not evaluate if the number was even. 
        
        if (num > 0) {
            System.out.println("The number is positive.");
            if (num % 2 == 0) {
                System.out.println("It is also an even number.");
            } else {
                System.out.println("It is an odd number.");
            }
        } else {
            System.out.println("The number is non-positive.");
        }

        
//        Multi-way if example
        
//        Multi-way if statements are better for checking multiple conditions sequentially. The example simply checks if the number is equal to 1, 2, or three, but these 
//        could be any number of conditions. 
        
        if (num == 1) {
            System.out.println("The number is one.");
        } else if (num == 2) {
            System.out.println("The number is two.");
        } else if (num == 3) {
            System.out.println("The number is three.");
        } else {
            System.out.println("The number is something else.");
        }

        
//        Switch statement example
        
//        Switch statements are best used to test a single variable against different values. To demonstrate this, I opted to use the same example as multi-way if 
//        statements and turn it into a switch statement to display how a switch statement can be cleaner than a multi-way if statement. This method makes it easy to 
//        execute different statements depending on the value of the expression (Aggarwal, 2025). 
        
        switch (num) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 2:
                System.out.println("The number is two.");
                break;
            case 3:
                System.out.println("The number is three.");
                break;
            default:
                System.out.println("The number is something else.");
                break;
        }
    }
}