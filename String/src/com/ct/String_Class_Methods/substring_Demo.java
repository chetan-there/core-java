// Note : The main purpose of this method to extract the part of the specified string based on the index position.
// In this method the startIndex starts from 0 whereas endIndex starts from 1.
// Both index will be inclusive for printing the value
// If end index will be less than start index then we will get an exception i.e StringIndexOutOfBoundsException  
// substring(5,
// If start index and end index both are equal, nothing will print
// Nither start index nor end index will accept (-ve) value otherwise StringIndexOutOfBoundsException.


package com.ct.String_Class_Methods;

public class substring_Demo {

	public static void main(String[] args) 
	{
		String s1 = "Hyderabad";
		
		System.out.println(s1.substring(2)); //derabad
		System.out.println(s1.substring(3,6));//era
		System.out.println(s1.substring(4,4)); //Will not print anything
		System.out.println(s1.substring(6,2)); //StringIndexOutOfBoundsException
		System.out.println(s1.substring(-2,6)); //StringIndexOutOfBoundsException
	}

}