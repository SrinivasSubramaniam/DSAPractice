package personalPracticeProblems;

public class P43_PalindromePanama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
	
		//s.replaceAll("[]", replacement)
		/*String rep = s.replaceAll("[ ,:]", "");
		String changed = new StringBuilder(rep).reverse().toString().toLowerCase();
		System.out.println(changed);*/

	}

}
