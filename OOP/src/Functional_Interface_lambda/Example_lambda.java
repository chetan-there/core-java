package OOP.src.Functional_Interface_lambda;

interface Vehicle 
{ 
 void run();  //SAM [Single Abstract Method] 
} 
 
public class Example_lambda { 
 
 public static void main(String[] args)  
 { 
//         // Implementing Vehicle using an anonymous inner class
//         Vehicle car = new Vehicle() {
//             @Override
//             public void run() {
//                 System.out.println("Car is Running");
//             }
//         };
//         car.run();
  Vehicle car = () -> System.out.println("Car is Running"); 
  car.run(); 
 
//         Vehicle bike = new Vehicle() {
//             @Override
//             public void run() {
//                 System.out.println("Bike is Running");
//             }
//         };
//         bike.run();
  Vehicle bike = () -> System.out.println("Bike is Running"); 
  bike.run(); 
   
//         Vehicle bus = new Vehicle() {
//             @Override
//             public void run() {
//                 System.out.println("Bus is Running");
//             }
//         };
//         bus.run();
//     }
// }  
  Vehicle bus = () -> System.out.println("Bus is Running"); 
  bus.run(); 
   
 } 
 
} 