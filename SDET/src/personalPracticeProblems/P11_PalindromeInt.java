package personalPracticeProblems;

public class P11_PalindromeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		int n=121;
		int org=n;
		int length=0;
		int sum=0;
		/*while (org>0)
		{
			org=org/10;
			length++;
		}
		for (int i = 0; i < length; i++) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
			
		}*/
		while (n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		
		
		System.out.println(sum);
		if (sum==number)
		{
			System.out.println("Palindrome");
		}

	}

}
