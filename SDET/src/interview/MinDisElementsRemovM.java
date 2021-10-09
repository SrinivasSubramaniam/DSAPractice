package interview;

import org.junit.*;
import java.util.*;
import java.util.Map.Entry;

import org.junit.Assert;
public class MinDisElementsRemovM {
	@Test
	public void test1(){
		int[] arr={1,1,2,3,2};
		int m=2;
		int n=5;
		Assert.assertEquals(2, findMin(arr,m,n));
		
	}
	@Test
	public void test2(){
		int[] arr={1,1,5,5};
		int m=2;
		int n=4;
		Assert.assertEquals(1, findMin(arr,m,n));
		
	}
	@Test
	public void test3(){
		int[] arr={2, 4, 1, 5, 3, 5, 1, 3};
		int m=2;
		int n=8;
		Assert.assertEquals(3, findMin(arr,m,n));
		
	}

	private int findMin(int[] arr, int m, int n) {		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(set);
		System.out.println(list);
		Collections.sort(list, (a, b) -> (b.getKey().compareTo(a.getKey())));
		
		int size=map.size(),count=0;
		for(int i=0;i<list.size();i++){
			Entry<Integer,Integer> each=list.get(i);
			if (each.getValue()<=m){
				m-=each.getValue();
				count++;
			}else return size-count;
		}
		return size-count;
	}
	

}
