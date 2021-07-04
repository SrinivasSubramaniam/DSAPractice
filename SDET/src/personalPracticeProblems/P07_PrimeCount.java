package personalPracticeProblems;

public class P07_PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=28;
		for (int i=1;i<=n;i++)
		{
			boolean flag=true;
			for (int j = 2; j <= i/2; j++) {
				if (i%j==0)
				{
					flag=false;
					break;
				}
				
			}
			if (flag==true)
			{
				System.out.print(i+ " ");
			}
		}

	}

}
