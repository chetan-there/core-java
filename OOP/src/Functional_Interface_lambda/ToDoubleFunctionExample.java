package OOP.src.Functional_Interface_lambda;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
    public static void main(String[] args) {
        /*
        ToDoubleFunction<Integer> halfFunc = new ToDoubleFunction<Integer>() {
            public double applyAsDouble(Integer x) {
                return x / 2.0;
            }
        };
        */

        ToDoubleFunction<Integer> halfFunc = x -> x / 2.0;

        System.out.println("Half: " + halfFunc.applyAsDouble(9));
    }
}
