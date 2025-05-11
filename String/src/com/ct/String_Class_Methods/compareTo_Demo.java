// Note : String class implements from Comparable<T> functional interface. It provides a single abstract method compareTo(T x). The return type of this method in int.
// String class has overridden this compareTo(String str) methd to compare two Strings by using UNICODE value.
// Comparing two Strings character by character by using UNICODE value is 
// known as Lexicographical comparison or dictionary comparison or alphabetical comparison(String case). 

// The return type of this method is int. It takes String as a parameter.

// If s1 and s2 are two valid Strings 

// if s1==s2  -> 0

// if s1>s2  -> +ve

// if s1<s2   -> -ve

package com.ct.String_Class_Methods;

public class compareTo_Demo {

    public static void main(String[] args) {
        String s1 = "Sachin"; // PQRS S > R
        String s2 = "Sachin";
        String s3 = "Ratan";

        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo(s3)); // 1
        System.out.println(s3.compareTo(s1)); // -1

        String s4 = "Apple";
        String s5 = "apple";
        System.out.println(s4.compareTo(s5)); // -32 [65 to 97]
        System.out.println(s5.compareTo(s4)); // 32 [97 to 65]

        String s6 = "Ravi";
        String s7 = "Rajiv";
        System.out.println(s6.compareTo(s7)); // 12

    }

}