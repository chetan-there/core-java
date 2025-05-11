// Note :It is used to concatenate of two Strings. Method return type is String.
// It can also be done by using + operator.

package com.ct.String_Class_Methods;

public class concat_Demo {

	public static void main(String[] args) 
	{
		String s1 = "Data";
		String s2 = "base";
		String s3 = s1.concat(s2);  
		System.out.println("String after concatenation :"+s3);

        String s4 = "Tata";
		String s5 = "Nagar";
		String s6 = s4+s5;
		System.out.println("String after concatenation :"+s6);

        String s7 = "Naresh";
		System.out.println(s7.concat(" Technology"));	

	}

}
