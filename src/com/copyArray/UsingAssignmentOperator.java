package com.copyArray;

public class UsingAssignmentOperator {

	public static void main(String[] args) {
		int no[]={1,2,3,54};
		
		int copyNo[]=no;
		
		for (int i : copyNo) 
		{
			System.out.println(i+",");
		}

	}

}
