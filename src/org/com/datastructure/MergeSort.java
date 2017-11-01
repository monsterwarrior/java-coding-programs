package org.com.datastructure;



public class MergeSort {
	
	static int[] merging(int[] ar1, int[] ar2)
	{
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

	public static void main(String[] args) {
		int[] a1 = {1,4,7,11};
		int[] a2 = {2,6,9,22};
		
		int[] mergedArryResult = merging(a1,a2);
		System.out.println("\nDisplayed merged array:");
		for(int i = 0;i<mergedArryResult.length;i++)
			System.out.println(mergedArryResult[i]+" ");
	}

}
