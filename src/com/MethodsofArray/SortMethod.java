package com.MethodsofArray;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {
		int no[]={45,23,90,12,10,4};
		
		Arrays.sort(no);
		
		System.out.println("Sorted array is....");
		
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
	}

}
