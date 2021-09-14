package slidingWindow;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import org.junit.Assert;

public class GroceryShop {
	
	/*You have an old grocery shop that instead of 
	scanning their sold proudcts once sold, they type in the prices, 
	which leaves room for mistyping sold prices. Given 4 lists: soldItems = ['eggs', 'milk', 'apple'], 
	soldPrices = [1.00, 2.50, 2.1], productsAvailable = ['eggs', 'lemons', 'milk', 'apple'], 
			productPrices = [1.01, 0.5, 2.50, 2.1], Find the number of items with mistyped prices*/
	
	@Test
	public void test1(){
		String[] soldItems={"eggs", "milk", "apple"} ;
		Double[] soldPrices={1.00, 2.50, 2.1};
		String[] productsAvaialable={"eggs", "lemons", "milk", "apple"};
		Double[] prodPrices={1.01, 0.5, 2.50, 2.1};
		Assert.assertEquals(1, findMistTypedPrices(soldItems,soldPrices,productsAvaialable,prodPrices));
	}

	private int findMistTypedPrices(String[] soldItems, Double[] soldPrices, String[] productsAvaialable,Double[] prodPrices) {
		int count=0;
		Map<String,Double> prodMap=new HashMap<>();
		for (int i = 0; i < productsAvaialable.length; i++) {
			prodMap.put(productsAvaialable[i],prodPrices[i]);
			
		}
		for(int j=0;j<soldItems.length;j++){
			if (prodMap.containsKey(soldItems[j])){
			if (prodMap.get(soldItems[j]).compareTo(soldPrices[j]) !=0)
				count++;
			}
		}
		return count;	
	}

}
