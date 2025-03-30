package OPERATORS.AssignmentOperator;

public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;

        a += 5; // Equivalent to a = a + 5;
        System.out.println("a += 5 : " + a); // 15

        a -= 3; // Equivalent to a = a - 3;
        System.out.println("a -= 3 : " + a); // 12

        a *= 2; // Equivalent to a = a * 2;
        System.out.println("a *= 2 : " + a); // 24

        a /= 4; // Equivalent to a = a / 4;
        System.out.println("a /= 4 : " + a); // 6

        a %= 2; // Equivalent to a = a % 2;
        System.out.println("a %= 2 : " + a); // 0
    }
}
