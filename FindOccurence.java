package week1.day2.assignments;

public class FindOccurence {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		// declare and initialize a variable count to store the number of occurrences

		// convert the string into char array

		// get the length of the array

		// traverse from 0 till the array length

		// Check the char array has the particular char in it

		// if is has increment the count

		// print the count out of the loop

		String str = "welcome to chennai";
		char[] charArr = str.toCharArray();
		
		int count=0;
		int len = charArr.length - 1;
		
		for (int i=0; i<len; i++) {
			if(charArr[i]=='e') {
				count++;
			}
		}
		
		System.out.println("Number of occurences of 'e' in the string: " +count);
		

	}

}
