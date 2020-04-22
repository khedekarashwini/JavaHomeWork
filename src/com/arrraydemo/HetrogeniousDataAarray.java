package com.arrraydemo;

public class HetrogeniousDataAarray {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		  obj[0]='A';
		  obj[1]=100;
		  obj[2]="AShwini";
		  obj[3]=3.4;
		  obj[4]=-90;
		  
		  for(int i=0;i<obj.length;i++)
		  {
			  System.out.println(obj[i]);
		  }

	}

}
