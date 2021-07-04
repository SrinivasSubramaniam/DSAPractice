package personalPracticeProblems;

public class P09_FactorialWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=n;
		int factorial=1;
		while (i>0)
		{
			factorial=factorial*i;
			i--;
		}
		System.out.println(factorial);

	}

}
