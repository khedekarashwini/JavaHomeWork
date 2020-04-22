package com.arrraydemo;

public class ArrayDeclarationWays {

	public static void main(String[] args) {
		/*int no[]={12,34,45};
		for(int i=0;i<no.length;i++)
		{
			System.out.println("Array index is"+i+"No is"+no[i]);
		}*/
		
		int num[]=new int[5];
		  num[0]=2;
		  num[1]=9;
		  num[2]=90;
		  num[3]=34;
		  num[4]=12;
		  
		  for(int i=0;i<num.length;i++)
		  {
			  System.out.println(num[i]);
		  }
		
	}

}
