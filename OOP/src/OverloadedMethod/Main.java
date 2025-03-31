package OOP.src.OverloadedMethod;

public class Main {
    public static void main(String [] args){

        //Conditions for Method Overloading:

        //Happens within the same class.
        //Methods must have the same name but different parameter lists.
        //Number of Parameters is Different
        //Data Type of Parameters is Different
        //Order of Parameters is Different
        //Java automatically determines which method to call based on arguments.

        // overloaded methods = methods that share the same name but different parameters
        // method signature = method name + parametres (with same datatypes)
        //


        double x=add(2.4,2.5);
        System.out.println(x);

    }

    static int add(int a,int b){
        System.out.println("overloaded method #1");
        return a+b;
    }

    static int add(int b,int a,int c){
        System.out.println("overloaded method #2");
        return a+b+c;
    }

    static int add(int b,int a,int c,int d){
        System.out.println("overloaded method #3");
        return a+b+c+d;
    }

    static double add(double a,double b){
        System.out.println("overloaded method #4");
        return a+b;
    }

    static double add(double b,double a,double c){
        System.out.println("overloaded method #5");
        return a+b+c;
    }

    static double add(double b,double a,double c,double d){
        System.out.println("overloaded method #6");
        return a+b+c+d;
    }

}
