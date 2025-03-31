package OOP.src.Method;

public class ReturnExa {
    public static void main(String[] args){

        int x=3;
        int y=4;

        // int z=sum(x,y);
        
        System.out.println(sum(x, y));
    }

    static int sum(int x,int y){

        //int is a return type

        int z=x+y;
        return z;

        // return x+y;

    }

}


// In Java, the **return type** of a method specifies what type of value the method will return after execution. It is declared before the method name in the method signature.

// ### **Types of Return Types in Java:**
// 1. **Primitive Data Types** – Methods can return primitive types like `int`, `double`, `char`, `boolean`, etc.  
//    ```java
//    public int add(int a, int b) {
//        return a + b; // returns an int value
//    }
//    ```
   
// 2. **Non-Primitive Data Types (Objects & Arrays)** – Methods can return objects, arrays, or collections.  
//    ```java
//    public String getName() {
//        return "John"; // returns a String object
//    }
//    ```
   
// 3. **Void (No Return Type)** – If a method does not return any value, it has a `void` return type.  
//    ```java
//    public void displayMessage() {
//        System.out.println("Hello!"); // No return statement needed
//    }
//    ```
   
// 4. **Returning an Array** – A method can return an array.  
//    ```java
//    public int[] getNumbers() {
//        return new int[]{1, 2, 3, 4, 5}; // returns an integer array
//    }
//    ```
   
// 5. **Returning a Class Object** – A method can return an instance of a class.  
//    ```java
//    class Person {
//        String name;
//        Person(String name) {
//            this.name = name;
//        }
//    }
//    public Person getPerson() {
//        return new Person("Alice"); // returns a Person object
//    }
//    ```
   
// 6. **Returning a Collection (List, Set, Map, etc.)** – Methods can return Java collections.  
//    ```java
//    public List<String> getNames() {
//        return Arrays.asList("Alice", "Bob", "Charlie"); // returns a List
//    }
//    ```

// ### **Key Points**
// - A method must return a value matching the declared return type.
// - `void` methods do not return anything.
// - If a method has a non-void return type, it must have a `return` statement.
