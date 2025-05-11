// Note :It is also used to compare two Strings based on the content by ignoring the case.Method return type is boolean.

package com.ct.String_Class_Methods;

public class equalsIgnoreCase_Demo {

	public static void main(String[] args) 
	{
		String username = args[0]; 

		if(username.equalsIgnoreCase("Ravi"))
		{
			System.out.println("Welcome Ravi");
		}
		else
		{
			System.out.println("Sorry! wrong username /Password");
		}

	}

}
