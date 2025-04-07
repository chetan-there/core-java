package OOP.src.Functional_Interface_lambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        /*
        BinaryOperator<Integer> multiply = new BinaryOperator<Integer>() {
            public Integer apply(Integer a, Integer b) {
                return a * b;
            }
        };
        */

        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        System.out.println("Product: " + multiply.apply(4, 5));
    }
}
