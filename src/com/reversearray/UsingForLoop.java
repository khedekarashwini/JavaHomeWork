package com.reversearray;

import java.util.Arrays;

public class UsingForLoop {

	public static void main(String[] args) {
		int[] no = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("array before reverse: " + Arrays.toString(no) );
 
        for(int i=0; i<no.length/2; i++){
            int temp = no[i];
            no[i] = no[no.length -i -1];
            no[no.length -i -1] = temp;
        }
 
        System.out.println("array after reverse: " + Arrays.toString(no) );
	}

}
