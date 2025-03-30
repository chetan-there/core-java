class variable{
    public static void main (String [] args ){
        
        //🟩 variables = a reusable container for a value
        //            a variable behaves as if it was value it contains 

        //🟥 Primitive = simple value stored directly in memory (stack)
        //🟦 Referance = memory address(stack) that points to the (heap)

        //🟥primitive vs 🟦 Referannce
        //-----------     --------------
        //int                 string---> a series of alphanumberic means it can contains number  & aphabets & symbols
        //double              array
        //char                object
        //boolean

        //2 steps to creating a variable 
        //-----------------------------
        //1.declaration
        //2.assignment 

        int age; //--> this is decleration 
        age=30;  //--> this is initilization
        System.out.println(age);

        double price=22.20;
        System.out.println(price);

        char grades='A';
        System.out.println(grades);

        boolean forSale=true;       
        System.out.println(forSale);

        //use of boolean
        if (forSale) {
            System.out.println("for sale ");
        }
        else System.out.println("this is not for sale");

        String name="chetan-there";
        String email="fake@gmial.com";

        System.out.println("hello "+name);  // this is known as concatination 

        System.out.println("your email is "+email);

        String car="Mustang";
        String color="red";
        int model=2025;
        double carprice=19999.99; 

        System.out.println("Your choice is a "+color+" "+model+" "+car);
        System.out.println("The price of Mustand in currency $ "+carprice);



        





    }
}