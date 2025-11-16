// Base class
class Vehicle {
    String brand;

    // Constructor that sets the brand
    Vehicle(String brand) {
        this.brand = brand;
    }
}

// Subclass
class Car extends Vehicle {
    String model;

    // Constructor that adds model and uses super() to initialize brand
    Car(String brand, String model) {
        super(brand); // call parent constructor
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Main class to test
public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.displayInfo();
    }
}
