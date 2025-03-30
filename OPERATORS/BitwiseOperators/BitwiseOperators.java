package OPERATORS.BitwiseOperators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        System.out.println("a ^ b : " + (a ^ b)); // 6 (0110)
        System.out.println("~a : " + (~a)); // -6 (2's complement)
    }
}

