package dataStructures;

import java.util.Arrays;

import org.junit.Test;

public class Program3_RemoveElement {

		@Test
		public void testData1()
		{
			int[] oldArray={1,3,3,5,6,3};
			int target=3;
			System.out.println(Arrays.toString(removeElement(oldArray,target)));
			
		}
		
		@Test
		public void testData2()
		{
			int[] oldArray={1,5,6,7};
			int target=3;
			System.out.println(Arrays.toString(removeElement(oldArray,target)));
			
		}
		
		@Test
		public void testData3()
		{
			int[] oldArray={3,3,3,3};
			int target=3;
			System.out.println(Arrays.toString(removeElement(oldArray,target)));
			
		}
		
		
		private int[] removeElement(int[] oldArray,int target)
		{
			int pos=0;
		for (int i = 0; i < oldArray.length; i++) {
			if (oldArray[i]!=target)
			{				
				oldArray[pos++]=oldArray[i];	
			}
			
		}
		if (pos==oldArray.length ) return new int[] {-1,-1};
		if(pos==0) return new int[] {};
		int[] newArray=new int[pos];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=oldArray[i];
		}
		
		return newArray;
	}
}


