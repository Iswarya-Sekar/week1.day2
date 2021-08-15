package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss"; 
				
		int len1 = text1.length();
		int len2 = text2.length();
		
		if(len1==len2) {

			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			boolean res = Arrays.equals(arr1, arr2);
			
			if(res) {
				System.out.print(text1+ " and " +text2+ " are anagram words");
			}
			
			else 
				System.out.print(text1+ " and " +text2+ " are not anagram words");		
		}
		

	}

}
