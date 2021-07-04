package personalPracticeProblems;



public class P10_PalindromeStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		
		String reverseString = new StringBuilder(s).reverse().toString().toLowerCase();
		if (s.equals(reverseString))
			System.out.println("Palindrome");

	}

	

}
