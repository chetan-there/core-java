// Package declaration (same as Car class to access it)
package OOP.src.ToStringMethod;  

// Main class containing the main method to run the program
public class Main {

    public static void main(String[] args) { 
        // Explanation of toString() method usage
        // toString() is a special method inherited by all Java objects.
        // It returns a string that "textually represents" an object.
        // It can be used explicitly (calling it directly) or implicitly.

        // Creating an instance (object) of Car
        Car c1 = new Car();  

        // Explicitly calling toString() method
        System.out.println(c1.toString()); 

        // Implicitly calling toString() method
        // If we print an object, Java automatically calls its toString() method.
        System.out.println(c1);  // Same as c1.toString()
    }
}


// 1. What is toString()?
// It is a method inherited from the Object class.
// Used to return a string representation of an object.
// Default implementation (Object class) returns:

// 2. Overriding toString()
// We override toString() in the Car class to return meaningful information about the object.
// Instead of Car@7a79be86, we get:

// 3. Calling toString()
// Explicitly: System.out.println(c1.toString());
// Implicitly: System.out.println(c1); (Java automatically calls toString())

// 4. Why Override toString()?
// Makes debugging easier.
// Improves readability.
// Provides meaningful data instead of an object’s memory address.