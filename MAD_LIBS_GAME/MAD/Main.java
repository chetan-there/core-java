package MAD_LIBS_GAME.MAD;

import java.util.Scanner;

//MAD_LIBS_GAME is a game where we have a story and user is going to fill the words with different words

public class Main {
    public static void main(String [] args){
        
        Scanner sc= new Scanner(System.in);

        String adjective;
        String noun;
        String adjective1;
        String verb1;
        String adjective2;

        System.out.println("Complete this stroy.");

        System.out.print("Today I went to a __________ zoo.");
        
        System.out.println("in an exhibit, I saw a _______.");
        
        System.out.println("______was _______ and ______!");
        
        System.out.println("I was ________ !");
        
        System.out.println("===================================");

        System.out.print("Enter a adjective(descrption) :");
        adjective=sc.nextLine();
        System.out.print("Enter a noun (animal or person) :");
        noun=sc.nextLine();
        System.out.print("Enter a  adjective (descrption) :");
        adjective1=sc.nextLine();
        System.out.print("Enter a verb with -ing (action) :");
        verb1=sc.nextLine();
        System.out.print("Enter an adjective (description) :");
        adjective2=sc.nextLine();

        

        System.out.println("--------------------------------------");

        System.out.println("Today I went to a "+adjective+" zoo.");
        
        System.out.println("in an exhibit, I saw a "+noun+".");
        
        System.out.println(noun+" was "+adjective1+" and "+verb1+"!");
        
        System.out.println("I was "+adjective2+"!");

        sc.close();


    }
}
