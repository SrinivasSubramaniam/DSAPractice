package personalPracticeProblems;

public class P59_TwoCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="beabeefeab";
		int[][] pairs=new int[26][26];
		int[][] count=new int[26][26];
		for (int i = 0; i < s.length(); i++) {
			int letterNum=s.charAt(i)-'a';
			int letter = s.charAt(i);
			//Update Row
			for (int col = 0; col < pairs.length; col++) {
				if (pairs[letterNum][col]==letter)
				{
					count[letterNum][col]=-1;
				}
				if (count[letterNum][col]!=-1)
				{
					pairs[letterNum][col]=letter;
					count[letterNum][col]++;
				}
				
				
			}
			
			//Update Column
			for (int row = 0; row < pairs.length; row++) {
				if (pairs[row][letterNum]==letter)
				{
					count[row][letterNum]=-1;
				}
				if (count[row][letterNum]!=-1)
				{
					pairs[row][letterNum]=letter;
					count[row][letterNum]++;
				}
				
				
			}
			
			
			
		}
		int max=0;
		for (int i=0;i<count.length;i++)
		{
			for (int j=0; j<count.length;j++)
			{
				max=Math.max(max, count[i][j]);
			}
		}
		System.out.println(max);

	}

}
