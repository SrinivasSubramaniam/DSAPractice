package personalPracticeProblems;

public class P25_ValidUserNameRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Samantha_219";
		if (s.matches("[A-Za-z][A-Za-z0-9_]{7,29}"))
		{
			System.out.println("Valid");
		}else
		{
			System.out.println("Invalid");
		}

	}

}
