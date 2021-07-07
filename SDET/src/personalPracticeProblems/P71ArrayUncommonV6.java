package personalPracticeProblems;

import java.io.*;
import java.util.Arrays;

public class P71ArrayUncommonV6 {
     
    static void printUncommon(int arr1[],
                     int arr2[], int n1, int n2)
    {
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
        int i = 0, j = 0,pos=0;
        //int[] arr3=new int[arr1.length];
        //int[] arr3=new int[arr1.length];
        while (i < n1 && j < n2) {
 
            // If not common, print smaller
            if (arr1[i] == arr2[j]) {
                arr1[pos++]=arr1[i];
                i++;
                j++;
            }
 
            // Skip common element
            else {
                i++;
                //j++;
            }
        }
 
        // printing remaining elements
        while (i < n1) {
            
            i++;
        }
        while (j < n2) {
           
            j++;
        }
        System.out.println(pos);
        System.out.println(Arrays.toString(arr1));
    }
 
    // Driver code
    public static void main(String[] args)
    {
		int[] arr1={8};
		int[] arr2={1,2,3,4,5};
 
        int n1 = arr1.length;
        int n2 = arr2.length;
 
        printUncommon(arr1, arr2, n1, n2);
    }
}
