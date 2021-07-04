package personalPracticeProblems;

import java.util.regex.Pattern;

public class P24_PatternCompile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="([A-Z])(.+)";
		try {
			if (Pattern.compile(s)!=null)
			{
				System.out.println("Valid");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid");
		}

	}

}
