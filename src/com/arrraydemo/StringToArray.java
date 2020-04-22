package com.arrraydemo;

public class StringToArray {

	public static void main(String[] args) {
		String str="Ashwini Khedekar";
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			System.out.println(ch[i]);
		}

	}

}
