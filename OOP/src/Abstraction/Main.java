package OOP.src.Abstraction;

public class Main {

    public static void main(String[] args) {
   

    //abstract = Used to define abstract classes and methods.
    //           Abstraction is the process of hiding implementation details
    //           and showing only the essential features or details 
    //           abstract classes can't be instantiated directly
    //           can contain 'abstract' methods (which must be implimented)
    //           can contain 'conncrete' methods (which are inherited)

    Circle circle=new Circle(3);
    Traingle traingle =new Traingle(4,5);
    Rectangle rectangle=new Rectangle(6,7);

    circle.display();
    traingle.display();
    rectangle.display();


    System.out.println(circle.area());
    
    System.out.println(traingle.area());
    
    System.out.println(rectangle.area());

    

    }
}

// Abstraction [Hiding the complexcity] 
// Showing the essential details without showing the background details is called Abstraction. 
// In order to acheive abstraction we can use the following two concepts of Java : 
// 1) Abstract class and abstract Method (It provides 0 - 100% abstraction so Partial Abstraction) 
// 2) Interface (100% abstraction)

// Abstract class and abstract methods : ------------------------------------------- 
// A class that does not provide complete implementation (partial implementation) is defined as an 
// abstract class. 
// An abstract method is a common method which is used to provide easiness to the programmer 
// because the programmer faces complexcity to remember the method name. 
// An abstract method observation is very simple because every abstract method contains abstract 
// keyword, abstract method does not contain any method body and at the end there must be a 
// terminator i.e ; (semicolon) 
// In java, whenever action is common but implementations are different then we should use abstract 
// method, Generally we declare abstract method in the super class and its implementation must be 
// provided in the sub classes. 
// if a class contains at least one method as an abstract method then we should compulsory declare 
// that class as an abstract class. 
// Once a class is declared as an abstract class we can't create an object for that class. 
// *All the abstract methods declared in the super class must be overridden in the sub classes 
// otherwise the sub class will become as an abstract class hence object can't be created for the sub 
// class as well. 
// In an abstract class we can write all abstract method or all concrete method or combination of both 
// the method.  
// It is used to acheive partial abstraction that means by using abstract classes we can acheive partial 
// abstraction(0-100%). 
// *An abstract class may or may not have abstract method but an abstract method must have 
// abstract class. 
 
// Note :- We can't declare an abstract method as final, private and static (illegal combination of 
// modifiers) 
 
// We can't declare an abstract class as a final. ------------------------------------------------------------- 
