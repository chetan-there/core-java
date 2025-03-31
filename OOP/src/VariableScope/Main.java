package OOP.src.VariableScope;

public class Main {


public static void main(String [] args){

    //local = decleared inside a method 
    //        visible to only the method 

    //global or classlevel = decleard outside of the method ,but within the a class 
    //                       visiable to all parts of the class 

    // Creating an object of DiceRoller class
    DiceRoller d1=new DiceRoller();

    
}
}

// Package Declaration: package OOP.src.VariableScope; defines the package where the classes are stored.
// Main Method: The main method is the entry point of the program.
// Object Creation: DiceRoller d1 = new DiceRoller(); creates an instance of the DiceRoller class, which automatically calls the constructor.


//     Variable Scope Explanation
// 1. Local Variables
// Definition: Variables declared inside a method or constructor. They only exist within that method.

// Example from the Code:

// void roll() {
//     int temp = 5;  // Local variable (only exists inside roll() method)
//     number = r1.nextInt(6) + 1;
//     System.out.println(number);
// }
// temp is a local variable because it is declared inside roll(). It cannot be accessed outside this method.



// Global (Instance) Variables
// Definition: Declared inside the class but outside any method. Available throughout the class.

// Example from the Code:

// Random r1;  // Global variable
// int number;  // Global variable
// These variables are initialized inside the constructor.

// They retain values across different method calls.