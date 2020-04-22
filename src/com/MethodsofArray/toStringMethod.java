package com.MethodsofArray;

import java.util.Arrays;

public class toStringMethod {

	public static void main(String[] args) {
		int no[]={12,34,56,10};
		
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		
		
		System.out.println("printing array using to string method");
		
	    System.out.println(Arrays.toString(no));
		

	}

}
