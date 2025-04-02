package OOP.src.Downcasting;

// class Main {
//     public static void main(String[] args) {
//         Car myCar = new SportsCar(); // Upcasting (Implicit)
//         myCar.drive(); // Allowed (Superclass method)
        
//         // Downcasting (Explicit)
//         SportsCar mySportsCar = (SportsCar) myCar;
//         mySportsCar.turboBoost(); // Now allowed after downcasting
//     }
// }


class Main {
    public static void main(String[] args) {
        Car myCar = new SportsCar(); // Upcasting
        
        if (myCar instanceof SportsCar) { // Check before downcasting
            SportsCar mySportsCar = (SportsCar) myCar;
            mySportsCar.turboBoost(); // Safe downcasting
        } else {
            System.out.println("Downcasting is not possible!");
        }
    }
}
