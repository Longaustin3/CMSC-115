public class Discussion {
    public static void main(String[] args) {
        // Instantiate two Car objects
        Car car1 = new Car("Ford", 2014);
        Car car2 = new Car("Chevrolet", 2018);
        
        // Display information about each car
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}

class Car {
    // Data fields
    String make;
    int year;
    
    // Constructor that can initialize the data
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
    
    // Method to print the information about the car
    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Year of Manufacture: " + year);
    }
}