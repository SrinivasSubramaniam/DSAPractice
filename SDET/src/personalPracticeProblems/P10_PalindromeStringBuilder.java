package personalPracticeProblems;



public class P10_PalindromeStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		
		String reverseString = reverseString(s);
		
		if (s.equals(reverseString))
			System.out.println("Palindrome");

	}

	public static String reverseString(String s) {
		// TODO Auto-generated method stub
		if (s.isEmpty())
		{
			return s;
		}else
		{
			return reverseString(s.substring(1))+Character.toLowerCase(s.charAt(0));
		}
		
	}

}
