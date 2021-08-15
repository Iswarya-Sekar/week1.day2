package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargestInAnArray {

	public static void main(String[] args) {
		
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
		
		int[] data = {3,2,11,4,6,7};
		int len = data.length;
		
		Arrays.sort(data);
		
		System.out.print("Sorted array: {");
		for(int i=0;i<len;i++) {
			System.out.print(+data[i]+ ",");
			}
		System.out.print("}");
		System.out.println();
		
		int secNum = len-2;
		System.out.println("Second largest number is: " +data[secNum]);

	}

}
