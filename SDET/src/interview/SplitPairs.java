package interview;
import org.junit.*;
public class SplitPairs {
	@Test
	public void test1(){
		int[] nums={2,7,4,6,3,1};
		Assert.assertTrue(oddNumber(nums));
	}

	public boolean oddNumber(int[] arr) {
		int n = arr.length;
		if (n % 2 == 1)
			return false;
		// Initialize count of odd & even
		int odd_count = 0, even_count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				even_count++;
			else
				odd_count++;
		}
		// 3 -3
		if (even_count - odd_count == 0) {
			return true;
		}
		return false;
	}

}
