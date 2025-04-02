package OOP.src.Upcasting;

class Main {
    public static void main(String[] args) {
        Car myCar = new SportsCar(); // Upcasting (implicit)
        myCar.drive(); // Allowed because drive() is in Car
        
        // myCar.turboBoost(); // NOT allowed (Only Car's methods can be accessed)
    }
}
