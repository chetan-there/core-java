// Package declaration (not mandatory, but useful for organizing code)
package OOP.src.ToStringMethod;  

// Class definition for Car
public class Car {

    // Instance variables (Attributes of the Car object)
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    // Overriding the toString() method from Object class
    @Override  // This annotation is optional but recommended, ensures correct overriding
    public String toString() {
        // Returning a meaningful string representation of the Car object
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
