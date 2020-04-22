package com.copyArray;

import java.util.Arrays;

public class UsingForLoop {

	public static void main(String[] args) {
		 char [] original = {'A','B','C','D'};
	        char [] copied = new char[4];

	        
	        for (int i = 0; i < original.length; i++) {
	        	copied[i] = original[i];
	        }
	      
	         
	        System.out.println(Arrays.toString(copied));
	}

}
