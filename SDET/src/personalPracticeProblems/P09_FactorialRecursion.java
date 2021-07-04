package personalPracticeProblems;

public class P09_FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int factorial = factorial(n);
		System.out.println(factorial);

	}

	public static int factorial(int n) {
		if (n==0)
		{
			return 1;
		}else
		{
			return n*factorial(n-1);
		}
		
	}

}
