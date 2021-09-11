package onspot;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BotProgram {
	
	/*You have been asked to program a bot for a popular bank that will automate the management of incoming requests. There are three type of requests the bank can receive.

	transer i j sum : request to transfer sum amount of money from the ith account to the jth one (i and j are 1-based index).

	deposit i sum : request to deposit sum amount of money in the ith account (1-based index).

	withdraw i sum : request to withdraw sum amount of money from the ith account (1-based index).

	You should also be able to process invalid requests. There are two types of invalid requests.

	invalid account number in the requests.
	withdrawal /transfer of a larger amount of money than is currently available.
	Example 1 :

	input
	balance  =  [10,100,20,50,30]
	request = ["withdraw 2 10", "transfer 5 1 20",  "deposit 5 20",  "transfer 3 4 15"]

	output 
	[30,90,5,65,30]*/
	
	@Test
	public void test1(){
		int[] balance={10,100,20,50,30};
		String[] request={"withdraw 2 10", "transfer 5 1 20",  "deposit 5 20",  "transfer 3 4 15"};
		Assert.assertArrayEquals(new int[] {30,90,5,65,30}, programBot(balance,request));
	}

	private int[] programBot(int[] balance, String[] request) {
		
		for (int i = 0; i < request.length; i++) {
			String[] split = request[i].split(" ");
			if (split[0].equals("withdraw")){
				int fromAcc = Integer.parseInt(split[1]);
				int amount = Integer.parseInt(split[2]);
				if (fromAcc>0 && fromAcc-1<balance.length){
					if (amount<=balance[fromAcc-1]) balance[fromAcc-1]-=amount;
				}
			}else if (split[0].equals("deposit")){
				int toAcc = Integer.parseInt(split[1]);
				int amount = Integer.parseInt(split[2]);
				if (toAcc>0 && toAcc-1<balance.length){
					balance[toAcc-1]+=amount;
				}
			}else{
					int fromAcc = Integer.parseInt(split[1]);
					int toAcc = Integer.parseInt(split[2]);
					int amount=Integer.parseInt(split[3]);
					
					if (fromAcc>0 && fromAcc-1<balance.length && toAcc>0 && toAcc-1<balance.length){
						if (amount<=balance[fromAcc-1]){
							balance[fromAcc-1]-=amount;
							balance[toAcc-1]+=amount;
							
						}
					}
			}
			
		}
		System.out.println(Arrays.toString(balance));
		
		
		
		
		
		
		
		
		
		
		return balance;
	}
	

}
