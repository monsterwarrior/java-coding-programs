package org.com.datastructure;

public class QuickSort {
	static int[] ar = {2, 1, 9, 5, 3, 8, 4};

	public static void main(String[] args) {
		System.out.println("Disply array before sorting :");
		
		for(int i =0;i<ar.length;i++)
			System.out.println(ar[i] +" ");
		
		quickSort(0, ar.length-1);
		
		System.out.print("\nDisplay array after sorting: "  );
		
        for (int i = 0; i < ar.length; i++)
               System.out.print(ar[i] +" ");
		
	}
	
	public static void quickSort(int left , int right){
		if(right - left <= 0)//size <= 1,
			return;//means array already sorted
		else{
			int pivot = ar[right];
			int partition = partitionArray(pivot, left, right);
			quickSort(left, partition-1);
			quickSort(partition+1, right);
		}
	}
	public static int partitionArray(int pivot, int left, int right){
		int leftIndiacator =left -1;
		int rightIndicater = right;
		while(true){
			//find bigger element
			while(ar[++leftIndiacator]<pivot)
			//execute while loop till elements are smaller than pivot
				while(rightIndicater>0 && ar[--rightIndicater]>pivot)
					
					if(leftIndiacator >= rightIndicater)
						break;
					else
						swapElement(leftIndiacator, rightIndicater);
			}
//		swapElement(leftIndiacator, right);
//		return leftIndiacator;
	
	}
	
	public static void swapElement(int pos1, int pos2) {
		int temp = ar[pos1];
		ar[pos1] = ar[pos2];
		ar[pos2] = temp;	
	}

}
