public class Project1 {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        
        // Display the properties of the first rectangle
//        System.out.println("Rectangle 1:");
//        System.out.println("Width: " + rectangle1.width);
//        System.out.println("Height: " + rectangle1.height);
//        System.out.println("Area: " + rectangle1.getArea());
//        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("The area of a rectangle with width " + rectangle1.width + " and height " + rectangle1.height + " is " + rectangle1.getArea());
        System.out.println("The perimeter of a rectangle is " + rectangle1.getPerimeter());
        
        // Display the properties of the second rectangle
//        System.out.println("\nRectangle 2:");
//        System.out.println("Width: " + rectangle2.width);
//        System.out.println("Height: " + rectangle2.height);
//        System.out.println("Area: " + rectangle2.getArea());
//        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("The area of a rectangle with width " + rectangle2.width + " and height " + rectangle2.height + " is " + rectangle2.getArea());
        System.out.println("The perimeter of a rectangle is " + rectangle2.getPerimeter());
    }
}

class Rectangle {
    // Data fields for width and height
    double width;
    double height;
    
    // No-argument constructor with default values
    public Rectangle() {
        this.width = 1.0;
        this.height = 2.0;
    }
    
    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // Method to calculate area
    public double getArea() {
        return width * height;
    }
    
    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}