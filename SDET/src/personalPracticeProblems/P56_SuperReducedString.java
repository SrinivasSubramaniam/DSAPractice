package personalPracticeProblems;

public class P56_SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabccddd";
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i)==s.charAt(i-1))
			{
			s=s.substring(0, i-1)+s.substring(i+1);
			i=0;
			}
			System.out.println(s);
		}
		
		

	}

}
