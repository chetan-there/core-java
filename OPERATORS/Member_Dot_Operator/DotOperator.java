package OPERATORS.Member_Dot_Operator;

class Car {
    String brand = "Tesla";
}

public class DotOperator {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Car Brand: " + myCar.brand); // Accessing member variable
    }
}
