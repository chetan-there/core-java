package USER_INPUT_BY_SCCANER;

import java.util.Scanner;
// Example : Area of rectangle 
public class Cal {
  public static void main(String [] args){
    double width=0;
    double length=0;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter width and height");
    width=sc.nextDouble();
    length=sc.nextDouble();

    System.out.println("Area of rectangle : "+width*length);
  }  
}
