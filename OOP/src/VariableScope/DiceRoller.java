package OOP.src.VariableScope;

import java.util.Random;

public class DiceRoller {
    Random r1;   // Global (instance) variable
    int number;  // Global (instance) variable

    // Constructor
    DiceRoller() {
        r1 = new Random(); // Initializing the Random object
        roll(); // Calling the roll() method
    }

    // Method to roll a dice
    void roll() {
        number = r1.nextInt(6) + 1; // Generates a random number between 1 and 6
        System.out.println(number); // Prints the random number
    }
}


// Explanation:
// Global (Instance) Variables:
// Random r1; and int number; are declared outside any method but inside the class, making them instance variables (global scope).
// Constructor (DiceRoller()):
// The constructor initializes the Random object (r1 = new Random();).
// It calls the roll() method to generate a random number.
// Method (roll()):
// Uses r1.nextInt(6) + 1; to generate a random integer between 1 and 6.
// Assigns the value to the global variable number.
// Prints the generated number.
