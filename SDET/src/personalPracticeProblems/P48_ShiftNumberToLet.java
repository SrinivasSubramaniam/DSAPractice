package personalPracticeProblems;

public class P48_ShiftNumberToLet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n={1,2,3,4,5};
		int k=n.length-4;
		int prev=0;
		int temp=0;
		for (int i=0;i<k;i++)
		{
			prev=n[n.length-1];
			for (int j = 0; j < n.length; j++) {
				temp=n[j];
				n[j]=prev;
				prev=temp;
			}
			
		}
		for (int i : n) {
			System.out.println(i);
		}
		
		}

	}

