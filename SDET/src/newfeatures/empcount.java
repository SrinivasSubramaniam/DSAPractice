package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class empcount {
	
	@Test
	public void test1(){
		Map<String,Integer> map=new HashMap<>();
		map.put("Hari", 20);
		map.put("Kamal", 31);
		map.put("Srini", 31);
		map.put("Dinesh", 31);
		map.put("Kumar", 31);
		findCount(map);
		
	}

	private void findCount(Map<String, Integer> map) {
		Collection<Integer> values = map.values();
		
		map.entrySet().stream().filter(name->name.getValue()>30)
		.forEach(name->System.out.println(name.getKey()));
		/*List<String> list=Arrays.asList("CSK","DC","RCB");
		
		System.out.println(list.stream().filter(ele->ele.length()>2).count());*/
		
	}

}
