package org.com.datastructure.sortingTechniqe;

public class Sorting_MergeSorting {
	static int[] ar = { 54, 13, 24, 19, 11, 3, 71, 8 };

	public static void main(String[] args) {
		System.out.print("Display array before sorting: ");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");

		int[] ar2 = new int[ar.length];
		mergeSort(ar2, 0, ar.length - 1);

		System.out.print("\nDisplay array after merge sort: ");
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + " ");

	}

	static void mergeSort(int[] workSpace, int lowerbound, int upperBound) {
		if (lowerbound == upperBound) {
			return;
		} else {

			int midPoint = (lowerbound + upperBound) / 2;
			mergeSort(workSpace, lowerbound, midPoint);// Sorting low half
			mergeSort(workSpace, midPoint + 1, upperBound);// Sorting second half
			merging(workSpace, lowerbound, midPoint + 1, upperBound);// merge Them
		}
	}

	static void merging(int[] ar2, int low, int high, int upperBound) {
		int midPoint = high - 1;
		int lowerBound = low;
		int n = upperBound - lowerBound + 1;
		int i = 0;

		while (low <= midPoint && high <= upperBound)
			if (ar[low] < ar[high])
				ar2[i++] = ar[low++];
			else
				ar2[i++] = ar[high++];
		while (low <= midPoint)
			ar2[i++] = ar[low++];
		for (i = 0; i < n; i++)
			ar[lowerBound + i] = ar2[i];
	}

}
