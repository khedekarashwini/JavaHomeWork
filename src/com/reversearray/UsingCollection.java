package com.reversearray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollection {

	public static void main(String[] args) {
		String str[]={"ashu","rekha","teja","pooja"};
		
		System.out.println("Without reversing array");
		for(String aray:str)
		{
			System.out.println(aray);
		}
		
		
		
		Collections.reverse(Arrays.asList(str));
		
		 System.out.println("Reverse Array : " +Arrays.toString(str));  
		
		

	}

}
