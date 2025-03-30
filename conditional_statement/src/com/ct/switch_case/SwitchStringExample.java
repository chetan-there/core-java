package com.ct.switch_case;

public class SwitchStringExample {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch(fruit) {
            case "Mango":
                System.out.println("Mango is sweet");
                break;
            case "Apple":
                System.out.println("Apple keeps the doctor away");
                break;
            case "Banana":
                System.out.println("Banana is rich in potassium");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
