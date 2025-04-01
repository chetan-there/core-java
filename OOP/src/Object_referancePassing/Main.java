package OOP.src.Object_referancePassing;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();  // Creating an object of Garage

        Car car = new Car("Bmw M4");   // Creating an object of Car with name "Bmw M4"

        garage.park(car);  // Passing the car object to the method park()
    }
}
