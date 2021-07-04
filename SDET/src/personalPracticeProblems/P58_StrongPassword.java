package personalPracticeProblems;

public class P58_StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Matches one or more consecutive `a` characters.-+
		/a+/g
		a aa aaa aaaa bab baab

		Matches zero or more consecutive `a` characters.   --- *
		//bag*/
		//a ba baa aaa ba b*/
		String s="aABC#abasdbhja";
		int count=0;
		if (!s.matches(".*[a-z].*"))
		{
			count++;
		}
		if (!s.matches(".*[A-Z].*"))
		{
			count++;
		}
		if (!s.matches(".*[0-9].*"))
		{
			count++;
		}
		if (!s.matches(".*[!@#$%^&*()-+]+.*"))
		{
			count++;
		}
		
		if (count>6-s.length())
		{
			
			System.out.println(count);
		}else
		{
			System.out.println(6-s.length());
		}

	}

}
