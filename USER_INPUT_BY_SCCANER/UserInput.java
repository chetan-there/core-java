package USER_INPUT_BY_SCCANER;

import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args)
    {
      //🟩 Scanner : a Scanner is a object that allows to accept the users input in java 
      // Available int java.util package.

      //To read the specific datatypes we use given methods 
      //int = nextInt();
      //double = nextDouble();
      //String = nextLine();
      //boolean = nextBoolean();


     Scanner sc= new Scanner(System.in);//--> syntax

     System.out.print("Enter your name : ");
     String name=sc.nextLine();

     System.out.print("Enter your age : ");
     int age=sc.nextInt();

     System.out.print("Enter your gpa : ");
     double gpa=sc.nextDouble();

     System.out.print("Are you Student : ");
     boolean isStudent=sc.nextBoolean();
     
     System.out.println("Hello "+name+" you are "+age+" years old "+" your gpa is "+gpa);


     if(isStudent){
        System.out.println("you are enrolled in classes");
     }else{
        
        System.out.println("you are not enrolled in classes");
     }

     // COMMON ISSUE - BUFFER 
     // To avoid this problem write again nextLine();

     // Example :

     System.out.print("Enter your roll number :");
     int rollNumber=sc.nextInt(); 
     sc.nextLine();//----> it will get the unwanted caracter means it accept that character.

     System.out.print("Enter your favorite subject :");
     String subject=sc.nextLine();

     System.out.println("your roll number is "+rollNumber);
     
     System.out.println("your roll favorite subject is "+subject);



      sc.close();




    }
    
}
