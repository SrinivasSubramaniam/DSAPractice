package personalPracticeProblems;

public class P21_StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String reverseString = new StringBuilder(s).reverse().toString();
		if (s.equals(reverseString))
		{
			System.out.println("Palindrome");
		}

	}

}
