package week1.day2.assignments;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int length = str.length();
		int c = length - 1;

		boolean res = true;

		for (int i = 0; i < length; i++) {
			if (str.charAt(i) != str.charAt(c - i)) {
				System.out.println(str+ " is not a palindrome.");
				res = false;
				break;
			}
		}

		if (res) {
			System.out.println(str+ " is a palindrome.");
		}

	}

}
