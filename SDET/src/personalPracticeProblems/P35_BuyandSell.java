package personalPracticeProblems;

public class P35_BuyandSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={7,1,5,3,6,4};
		int max=0;
		for (int i = 0; i < n.length-1; i++) {
			if (n[i+1]>n[i])
			{
				max+=n[i+1]-n[i];
			}
		}
		System.out.println(max);

	}

}
