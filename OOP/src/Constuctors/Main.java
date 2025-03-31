package OOP.src.Constuctors;

//Constructor = special method that is called when an object is instantiated (Created)

        //A constructor in Java is a special method used to initialize objects. It has the same name as the class and is automatically called when an object is created.
        //Constructors are allowed to assign different attributes to each object that we instantiated objects .

        //         Rules for Constructors in Java
        
        // Constructor name must be the same as the class name.
        // No return type (not even void).
        // Automatically called when an object is created.
        // Can be overloaded (multiple constructors in the same class).
        // If no constructor is defined, Java provides a default constructor.
        // Java will decide which constructor to call based on parameters.

        // Types of Constructors in Java

        // Default Constructor (No parameters)==Automatically called when an object is created.

        //Parameterized Constructor (With parameters)==Used to initialize values when an object is created.
        

public class Main {

    public static void main(String [] args){

        
        Human h1= new Human("steve",29,70);
        Human h2= new Human("Rick",65,60);

        System.out.println(h2.name);
        h1.drink();
        h2.eat();

    }

}
