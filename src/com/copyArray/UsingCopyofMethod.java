package com.copyArray;

import java.util.Arrays;

public class UsingCopyofMethod {

	public static void main(String[] args) {
		int arra1[]={1,2,3,4,5,6,7};
		
		System.out.println("array1 is......");
		
		for (int i = 0; i < arra1.length; i++)
		{
		    System.out.println(arra1[i]);	
		}
		
		
		int[] arra2=Arrays.copyOf(arra1, 8);
		
		System.out.println("array2 is......");
		   
		arra2[7]=100;
		  
		  for (int i = 0; i < arra2.length; i++)
			{
			    System.out.println(arra2[i]);	
			}
		
	}

}
