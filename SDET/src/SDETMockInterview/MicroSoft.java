package SDETMockInterview;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class MicroSoft {
	
	@Test
	public void test1(){
		String str="pray jump spy. jump spy, jump. spy ally now ally.";
		String outPut="pray, jump spy. jump spy, jump. spy, ally now, ally.";
		Assert.assertEquals(outPut, reArrangeString(str));
	}

	private String reArrangeString(String str) {
		String[] split = str.split(" ");
		
		List<String> list = Arrays.asList(split);
		//System.out.println("before is "+list);
		for (int i=0;i<list.size();i++) {
			String each = list.get(i);
			if(each.charAt(each.length()-1)==','){
					for (int j=0;j<list.size()-1;j++){
						if (list.get(j).equals(each.substring(0, each.length()-1)))
								list.set(j, each.substring(0, each.length()-1)+",");
					}
				
			if (i+1<list.size()){
				String afterComma=list.get(i+1);
					 for (int j=1;j<list.size();j++){
						 			String str2 = list.get(j);
							if (str2.substring(0, str2.length()-1).equals(afterComma)){
								String before = list.get(j-1);
								if (Character.isLetter(before.charAt(before.length()-1)))
									list.set(j-1, list.get(j-1)+",");
							}
						}
			}
			}
		}
		StringBuffer sbr=new StringBuffer();
		for (String string : list) {
			sbr.append(string).append(" ");
		}
		
		//System.out.println("after is "+list);
		System.out.println(sbr.toString());
		return sbr.toString();
	}

}
