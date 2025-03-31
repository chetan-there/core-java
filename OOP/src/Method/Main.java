package OOP.src.Method;

// Method = a block of code that is executed whenever it is called upon or method is a block of code that perform some operation and gives the output 
    
public class Main {
    public static void main(String [] args){

        String name="chetan";
        int age=19;
        // name & age is argument we are going to pass to method 
        hello(name,age);
        
    }
    
    //method name start with lowercase 
    //static method did not need object 

    static void hello(String name,int age){

        //String name,int age is a parameter 
        System.out.println("Hello"+name);
    }
}
