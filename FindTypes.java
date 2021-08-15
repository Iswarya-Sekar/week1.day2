package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {


		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		System.out.println("Given string is: " +test);
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
		*/
		
		char[] charArr = test.toCharArray();
		int len = charArr.length-1;
		
		for(int i=0; i<len; i++) {
			if(Character.isLetter(charArr[i])) {
				letter++;
				
			}
			else if(Character.isDigit(charArr[i])) {
				num++;
			}
			else if (Character.isSpaceChar(charArr[i])) {
				space++;
			}
			else {
				specialChar++;
			}
		}

		// Print the count here
		System.out.println("Count of letters: " + letter);
		System.out.println("Count of space: " + space);
		System.out.println("Count of number: " + num);
		System.out.println("Count of special charcter: " + specialChar);


	}

}
