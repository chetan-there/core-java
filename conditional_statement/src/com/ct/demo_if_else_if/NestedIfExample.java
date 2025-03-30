public class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18) { // First condition
            if (hasID) { // Second condition
                System.out.println("You can enter the club.");
            } else {
                System.out.println("You need an ID to enter.");
            }
        } else {
            System.out.println("You are too young to enter.");
        }
    }
}
