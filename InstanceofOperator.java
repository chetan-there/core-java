package OPERATORS.InstanceofOperator;

class Animal {}

class Dog extends Animal {}

public class InstanceofOperator {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println("Is d an instance of Dog? " + (d instanceof Dog)); // true
        System.out.println("Is d an instance of Animal? " + (d instanceof Animal)); // true
    }
}
