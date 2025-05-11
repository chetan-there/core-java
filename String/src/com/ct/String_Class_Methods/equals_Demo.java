// Note: It is an overridden method, Overridden from Object class. 
// It is used to compare two Strings based on the content.Method return type is boolean.
 

package com.ct.String_Class_Methods;

public class equals_Demo {

	public static void main(String[] args) 
	{
		String username = args[0]; 

		if(username.equals("Ravi"))
		{
			System.out.println("Welcome Ravi");
		}
		else
		{
			System.out.println("Sorry! wrong username /Password");
		}

	}

}
