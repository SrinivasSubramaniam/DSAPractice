package dynamicProblem;

import org.junit.*;
public class MinPathSum64 {
	@Test
	public void test1(){
		int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
		Assert.assertEquals(7, minPathSum(grid));
	}
	@Test
	public void test2(){
		int[][] grid={{1,2,3},{4,5,6}};
		Assert.assertEquals(7, minPathSum(grid));
	}
	/*Psuedo code
	 * DP problem- Tabulation
	 * Create an array of same size
	 * iterate each element
	 * if row and col is 0 do nothing
	 * if row is 0 and col is not 0 add current value and previous col of current row to current index
	 * if row is not 0 and col is 0 add current value and previous row of current col to current index
	 * else take the min of top and left and add it to the current value 
	 * return the last index value
	 * 
	 * Time complexity - O (n)
	 * Space complexity - O(n)
	 * 
	 * Time taken-
	 * Psuedo code-20 Mins
	 * Coding-15 Mins
	 * Debug-2 Mins
	 */
	
	 public int minPathSum(int[][] grid) {
	        int row=grid.length;
	        int col=grid[0].length;
	        int[][] dp=new int[row][col];
	        //dp[0][0]=grid[0][0];
	        for (int i=0; i<row;i++){
	            for(int j=0;j<col;j++){
	                if ( i==0 && j==0) dp[i][j]=grid[0][0];
	                else if (i==0 && j!=0) dp[i] [j]= dp[i][j-1]+grid[i][j];
	                else if (i!=0 && j==0) dp[i] [j]=dp[i-1][j] + grid[i][j];
	                else {
	                    dp[i][j]=grid[i][j]+ Math.min(dp[i][j-1],dp[i-1][j]);
	                }
	            }
	        }
	        return dp[row-1][col-1];
	        
	    }

}
