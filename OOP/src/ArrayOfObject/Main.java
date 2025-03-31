// Package declaration (not mandatory but helps in organizing code)
package OOP.src.ArrayOfObject;  

//Array = A container object that holds a fixed number of values of a single type.

public class Main {
    public static void main(String[] args) {
        
        // ========== Basic Array Declaration & Initialization ==========

        // Syntax: datatype arrayName = new datatype[arraySize];

        // int[] numbers = new int[3];      // Array of integers (size 3)
        // char[] characters = new char[4]; // Array of characters (size 4)
        // String[] strings = new String[5];// Array of Strings (size 5)

        // ========== Creating an Array of Objects ==========

        // Syntax: ClassName arrayName = new ClassName[arraySize];
        // Food[] refrigerator = new Food[3];  // This creates an array for storing Food objects (but it is empty initially)

        // Creating objects of Food class
        Food f1 = new Food("pizza");
        Food f2 = new Food("hamburger");
        Food f3 = new Food("hotdog");

        // Assigning objects to an array (Method 1: Direct Assignment)
        Food[] refrigerator = {f1, f2, f3}; // Initializing array with objects

        // Method 2: Assigning objects one by one (Uncomment if needed)
        // refrigerator[0] = f1;
        // refrigerator[1] = f2;
        // refrigerator[2] = f3;

        // Accessing object attributes from the array
        System.out.println(refrigerator[0].name);  // Output: pizza
        System.out.println(refrigerator[1].name);  // Output: hamburger
        System.out.println(refrigerator[2].name);  // Output: hotdog
    }


}

// Container object:
// This signifies that an array is an object in Java, meaning it's a reference type that stores data.
// Holds a fixed number of values:
// This emphasizes that the size of an array is determined when it's created, and that size cannot be altered afterward.
// Of a single type:
// This highlights the "homogeneous" nature of arrays, meaning all elements within an array must be of the same data type (e.g., all integers, all strings, etc.).
// In essence, an array provides a structured way to store and access a collection of elements of the same type, with each element identified by its numerical index.

// 1. What is an Array of Objects?
// An array is used to store multiple values of the same data type.
// An array of objects stores multiple objects of a class.


// 2. Creating and Storing Objects in an Array
// Objects must be created separately before storing in an array.

// Example:

// Food f1 = new Food("pizza");
// Food f2 = new Food("hamburger");
// Food f3 = new Food("hotdog");

// Assigning objects to an array:
// Food[] refrigerator = {f1, f2, f3};

