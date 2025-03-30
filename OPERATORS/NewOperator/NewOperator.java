package OPERATORS.NewOperator;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class NewOperator {
    public static void main(String[] args) {
        Person p = new Person("Alice"); // Using new to create object
        System.out.println("Person's name: " + p.name);
    }
}
