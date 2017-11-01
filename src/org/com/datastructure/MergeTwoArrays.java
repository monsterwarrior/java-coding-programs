package org.com.datastructure;

public class MergeTwoArrays {
	 
    public static void main(String[] args) {     
           int[] ar1 = { 1, 3, 7, 11 };
           int[] ar2 = { 2, 5, 8, 22 };
 
           System.out.print("Display ar1 : "  );
           for (int i = 0; i < ar1.length; i++)
                  System.out.print(ar1[i] +" ");
 
           System.out.print("\nDisplay ar2 : "  );
           for (int i = 0; i < ar2.length; i++)
                  System.out.print(ar2[i] +" ");
           
           int mergedArray[]=merging(ar1, ar2);  //merging both arrays.
           System.out.print("\nDisplay merged array: "  );
           for (int i = 0; i < mergedArray.length; i++)
                  System.out.print(mergedArray[i] +" ");          
    }
    
    /*
     * Method merges two sorted arrays.
     */
    static int[] merging(int[] ar1, int ar2[]) {
           
           int mergedArray[]=new int[ar1.length+ar2.length];
           int ar1Index=0, ar2Index=0, mergedArrayIndex=0;
           
           while (ar1Index < ar1.length  && ar2Index < ar2.length)
                  if (ar1[ar1Index] < ar2[ar2Index])
                        mergedArray[mergedArrayIndex++] = ar1[ar1Index++];
                  else
                        mergedArray[mergedArrayIndex++] = ar2[ar2Index++];
           
           while (ar1Index < ar1.length )
                  mergedArray[mergedArrayIndex++] = ar1[ar1Index++];
           
           while (ar2Index < ar2.length)
                  mergedArray[mergedArrayIndex++] = ar2[ar2Index++];
           
           return mergedArray;
           
    }
}
