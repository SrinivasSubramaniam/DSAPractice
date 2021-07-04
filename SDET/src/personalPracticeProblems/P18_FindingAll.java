package personalPracticeProblems;

public class P18_FindingAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 1st Automation Interview $$ ";
		int letter=0;
		char[] c = test.toCharArray();
		
		for (char ch : c) {
			if (Character.isDigit(ch))
			{
				letter++;
			}
			else
				if(Character.isSpaceChar(ch))
			{
				letter++;
			}
			else 
				if(Character.isLetter(ch)) 
			{
				letter++;				
			}else
			{
				letter++;
			}
			{
				
			}
			
		}
		

	}

}
