package personalPracticeProblems;

public class P64_SeparateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="99100101";
		Long firstx;
		for (int i = 1; i <= s.length()/2; i++) {
			Long x=Long.parseLong(s.substring(0,i));
			firstx=x;
			String test=x.toString();
			while (test.length()<s.length())
			{
			test=test + (++x);
			}
			if (test.equals(s))
			{
				System.out.println("Yes Separate Numbers");
				break;
			}
		}
	}

}
