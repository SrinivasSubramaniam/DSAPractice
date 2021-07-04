package personalPracticeProblems;

public class P12_RecursionFirstUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a good dog";
		String[] sp = s.split(" ");
		
		for (int i = 0; i < sp.length; i++) {
			String reverse = new StringBuilder(sp[i]).reverse().toString();
			reverse=reverse.substring(0,1).toUpperCase()+reverse.substring(1).toLowerCase();
			System.out.print(reverse+" ");
		}

	}

}
