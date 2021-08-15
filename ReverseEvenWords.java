package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test="I am a software tester";
		System.out.print("Actual string: ");
		System.out.println(test);
		
		String[] t = test.split(" ");

		String val = "";
		for (int i = 0; i < t.length; i++) {

		    if (i % 2 == 1)
		        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
		    else
		        val = val + t[i] + " ";
		}
		val = val.trim();
		System.out.print("String with reversed even words: ");
		System.out.println(val);
	}
	}
