package personalPracticeProblems;

public class P44_MergeSortedArray {

	public static void main(String[] args) {
		int[] n1={1,2,3};
		int[] n2={2,5,6};
		int[] n3=new int[n1.length+n2.length];
		int i=0;
		int j=0;
		int k=0;
		while (i<n1.length&&j<n2.length)
		{
			if (n1[i]<n2[j])
			{
				n3[k++]=n1[i++];
			}else
			{
				n3[k++]=n2[j++];
			}
		}
		
		while (i<n1.length)
		{
			n3[k++]=n1[i++];
		}
		while (j<n2.length)
		{
			n3[k++]=n2[j++];
		}
		for (int l : n3) {
			System.out.print(l+" ");
			
		}

	}

}
