package onspot;

import org.junit.Test;

public class ConvetToExcel168 {
	
	@Test
	public void test1(){
		int col=28;
		System.out.println(findString(col));
	}

	private String findString(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;//27
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
	}

}
