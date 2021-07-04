package personalPracticeProblems;

public class P10_PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam";
		String s2="";
		for (int i = s1.length()-1; i >=0; i--) {
			
			s2+=s1.charAt(i);
		}
		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}

	}

}
