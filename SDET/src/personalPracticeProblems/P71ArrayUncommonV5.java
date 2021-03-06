package personalPracticeProblems;

import java.io.*;

public class P71ArrayUncommonV5 {
     
    static void printUncommon(int arr1[],
                     int arr2[], int n1, int n2)
    {
    	int[] k=new int[n1];
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
 
            // If not common, print smaller
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
          
 
            // Skip common element
            else {
                i++;
                j++;
            }
        }
 
        // printing remaining elements
        while (i < n1) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n2) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
		int[] arr1={1,2,2,3,3};
		int[] arr2={2,2,3,3};
 
        int n1 = arr1.length;
        int n2 = arr2.length;
 
        printUncommon(arr1, arr2, n1, n2);
    }
}
