// Note : It is an overloaded method. CharSequence is an interface. String, StringBuffer and StringBuilder class, all are implementing from 
// CharSequence to provide loose coupling.

// It is used to replace a particular character OR a string value from the 
// given String. Method return type is String.

package com.ct.String_Class_Methods;

public class replace_Demo {

	public static void main(String[] args) 
	{
		String x = "Manager";
		String y = x.replace("Man", "Dam");
		System.out.println(y);

		String a = "oxoxoxoxox";
		System.out.println("Original String :"+a);
		System.out.println("String after replacement :"+a.replace('x','X'));

	}

}