package onspot;

import java.util.HashMap;

import org.junit.Test;

public class StringMatch {
	@Test
	public void test1(){
		String [] dict={"abb", "abc", "xyz", "xyy"};
		String pattern="foo";
		findMatchedWords(dict, pattern);
		
	}
	
	static String encodeString(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        String res = "";
        int i = 0;
        char ch;
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (!map.containsKey(ch)) map.put(ch, i++);
            res += map.get(ch);
        }
 
        return res;
    }
    static void findMatchedWordsMap(
        String[] dict, String pattern)
    {
        int len = pattern.length();
        String hash = encodeString(pattern);
        for (String word : dict) {
            if (word.length() == len
                && encodeString(word).equals(hash))
                System.out.print(word + " ");
        }
    }
    
    static boolean check(String pattern, String word)
    {
   
      if (pattern.length() != word.length())
        return false;
   
      int[] ch = new int[128];
      int Len = word.length();
   
      for(int i = 0; i < Len; i++)
      {
        if (ch[pattern.charAt(i)] == 0)
        {
          ch[pattern.charAt(i)] = word.charAt(i);
        }
        else if (ch[pattern.charAt(i)] != word.charAt(i))
        {
          return false;
        }
      }
      return true;
    }
   
    static void findMatchedWords(String[] dict, String pattern)
    {
      String result = " ";
      for(String word : dict)
      {
        if (check(pattern, word))
        {
        	System.out.print(word+" ");
          //result = word + " " /*+ result*/;
        }
      }
     // System.out.print(result);
    }

}
