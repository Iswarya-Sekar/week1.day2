package week1.day2.assignments;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		

		/* 
		 * Pseudo code:
		 * Step1: get the length of the array
		 * Step2: declare an int variable named count
		 * Step3: iterate from 0 to the array length-1 (outer loop starts here)
		 * Step4: assign 0 to count
		 * Step5: iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		 * Step6: compare both the loop variables & check they're equal
		 * Step7: increase the count if both the arrays are equal
		 * Step8:Out of the inner loop, check and print the first array variable if count is more than 0
		 */
		
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(arr);
		System.out.print("Sorted array: {");
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+ ",");
			}
		System.out.print("}");
		System.out.println();
		
		int c=arr.length;
		
		int count;
		
		System.out.println();
		System.out.println("Duplicates in this above array are: ");
		
		for(int i=0; i<c-1; i++) {
			count=0;
			
			for(int j=i+1; j<c; j++) {
				if(arr[i]==arr[j]) {
					count+=1;
					
				}
				
				if(count>0) {
					System.out.println(+arr[i]);
					break;
				}
			}
		} 
		

	}

}
