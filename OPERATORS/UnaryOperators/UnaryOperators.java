package OPERATORS.UnaryOperators;


    public class UnaryOperators {
        public static void main(String[] args) {
            int a = 10;
    
            System.out.println("Unary Plus: " + (+a));  // +10
            System.out.println("Unary Minus: " + (-a)); // -10
    
            // Pre-increment: Increases value first, then uses it
            System.out.println("Pre-Increment: " + (++a)); // 11
    
            // Post-increment: Uses value first, then increases it
            System.out.println("Post-Increment: " + (a++)); // 11 (then a becomes 12)
            System.out.println("After Post-Increment: " + a); // 12
    
            // Pre-decrement
            System.out.println("Pre-Decrement: " + (--a)); // 11
    
            // Post-decrement
            System.out.println("Post-Decrement: " + (a--)); // 11 (then a becomes 10)
            System.out.println("After Post-Decrement: " + a); // 10
        }
    }
    
