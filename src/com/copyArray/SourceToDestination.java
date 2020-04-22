package com.copyArray;

import java.util.Arrays;

public class SourceToDestination {

	public static void main(String[] args) {
		int[] source = { 1, 2, 3, 4, 5, 6, 7 };
		int[] destination = {45,60,20,100,90,80};

		System.arraycopy(source, 3, destination, 2, 3);

		System.out.println(Arrays.toString(destination));
	}

}
