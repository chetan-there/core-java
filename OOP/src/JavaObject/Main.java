package OOP.src.JavaObject;

public class Main {

public static void main(String [] args){

// object = is an instance of the class may contain attributes and methods
// Example =(phone, desk, computer ,pen, pencil, cup)
// attributes = characteristics of objects
// methods = differance action that object can perform

//classname referancevariable = new object 
Car myCar= new Car(); 
//Creating second object

Car myCar1= new Car();


//Printing the characteristics

System.out.println(myCar.make);
System.err.println(myCar.model);

//Calling the methods
myCar.drive();
myCar.brake();

//Calling the methods with second object
myCar1.drive();



}

}



