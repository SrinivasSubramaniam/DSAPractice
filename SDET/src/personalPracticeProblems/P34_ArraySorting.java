package personalPracticeProblems;

public class P34_ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n={5,3,1,7,4,9};
		int temp=0;
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i+1; j < n.length; j++) {
				if(n[i]>n[j])
				{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
				
			}
		}
		for (int i : n) {
			System.out.print(i+" ");
		}

	}

}
