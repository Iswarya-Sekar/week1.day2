package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		//Print array
		System.out.print("Original array: {");
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+ ",");	
		}
		System.out.print("}");
		System.out.println();

		// Sorting array	
		Arrays.sort(arr);
		
		//Print sorted array
		System.out.print("Sorted array: {");
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+ ",");
			}
		System.out.print("}");
		System.out.println();
		
		
		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
		for(int i=0; i<=arr.length;i++) {
			int c=i+1;
			if (c!=arr[i]) {
				System.out.println("Missing element in the array:" +c);
				break;
			}
		}

			

	}

}
