package personalPracticeProblems;

public class P12_Recursionlowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a good dog";
		String[] sp = s.split(" ");
		
		for (int i = 0; i < sp.length; i++) {
			String reverse = new StringBuilder(sp[i]).reverse().toString().toLowerCase();
			System.out.print(reverse+" ");
		}

	}

}
