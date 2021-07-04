package personalPracticeProblems;

public class P41_MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={0,1,0,3,4,0};
		int pos=0;
		for (int i = 0; i < n.length; i++) {
			if (n[i]!=0)
			{
				n[pos]=n[i];
				pos++;
			}
		}
		while(pos<n.length)
		{
			n[pos]=0;
			pos++;
		}
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}

	}

}
