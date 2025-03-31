package OOP.src.OverloadedConstuctors;

// import java.lang.reflect.Constructor;

public class Main {

// Constructor overloading occurs when a class has multiple constructors with the same name but different parameters. 
// Java differentiates them based on the number, type, or order of parameters.

    public static void main(String [] args0){

    //Overloaded Constructors = multiple constructors within a class with the same name,
    //                          but have different parameters
    //                          name + parameters = signature 

    Pizza p1 =new Pizza("thicc crust","tomato","mozzerella","pepperoni");

    System.out.println("Here are the ingredients of your pizza :");
    System.out.println(p1.bread);
    System.out.println(p1.sauce);
    System.out.println(p1.cheese);
    System.out.println(p1.toppings);
}

}


// Rules for Constructor Overloading :

// Constructors must have the same name as the class.
// They must have different parameter lists (different number, type, or order of parameters).
// Return type is not allowed in constructors (constructors do not have a return type).
// Java determines which constructor to call based on arguments passed.


// Why Use Constructor Overloading?
// ✔ Increases flexibility (Different ways to initialize objects).
// ✔ Reduces code duplication (Reuse common initialization logic).
// ✔ Makes code more readable and maintainable.