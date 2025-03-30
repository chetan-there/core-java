package OPERATORS.TernaryOperators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int min = (a < b) ? a : b;

        //shorthand of if else

        System.out.println("Minimum value is : " + min); // 10
    }
}
