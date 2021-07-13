package personalPracticeProblems;

public class P12_ReverseAtlernateCharacetUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Welcome to Automation";
		
		String[] s = word.split(" ");
		for (int i = s.length-1; i >=0; i--) {
					String split = s[i];
					int n=0;
			for (int j = s[i].length()-1; j >=0; j--) {
				if (n%2==0)
				{
					System.out.print(Character.toLowerCase(split.charAt(j)));
				}
				if (n%2!=0)
				{
					System.out.print(Character.toUpperCase(split.charAt(j)));
				}
				n++;
			}
			System.out.print(" ");
		}
		

	}

}
