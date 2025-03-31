package OOP.src.OverloadedConstuctors;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String toppings;

    // Constructor 1: All ingredients specified
    Pizza(String bread,String sauce,String cheese,String toppings){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese; 
        this.toppings=toppings;
    }

    // Constructor 2: Without toppings
    Pizza(String bread,String sauce,String cheese){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese; 
    }
    
    // Constructor 3: Only bread and sauce
    Pizza(String bread,String sauce){
        this.bread=bread;
        this.sauce=sauce;
    }

    // Constructor 4: Only bread
    Pizza(String bread){
        this.bread=bread;
    }


}
