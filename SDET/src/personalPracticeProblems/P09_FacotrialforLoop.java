package personalPracticeProblems;

public class P09_FacotrialforLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int factorial=1;
		
		for (int i = n; i >=1; i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);

	}

}
