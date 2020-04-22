package com.MethodsofArray;

import java.util.Arrays;

public class EqualsMethod {

	public static void main(String[] args) {
		int array1[]={1,2,3,4,5};
		
		int array2[]={1,2,3,4,5,10};
		
		if(Arrays.equals(array1, array2))
		{
			System.out.println("Both array are equal");
		}
		else
		{
			System.out.println("Both array are not equals");
		}

	}

}
