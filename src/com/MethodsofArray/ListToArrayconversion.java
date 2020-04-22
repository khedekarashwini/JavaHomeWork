package com.MethodsofArray;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayconversion {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(100);
		l1.add(300);
		l1.add(700);
		l1.add(400);
		l1.add(800);
		
		System.out.println("List is"+l1);
		
		
	l1.toArray();
	System.out.println("Array of list is....");
	for(Integer no:l1)
	{
		System.out.println(no);
	}

	}

}
