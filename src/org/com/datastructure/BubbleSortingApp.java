package org.com.datastructure;

class Bubble {
	private int[] arr;
	int index;

	public void bubbleSize(int maxSize) {
		arr = new int[maxSize];
		index = 0;
	}

	public void insert(int value) {
		arr[index++] = value;
	}

	/* sort the elements */
	public void bubbleSort() {
		int outer, innner;
		for (outer = index - 1; outer > 0; outer--) // outer loop (in backward direction)
			for (innner = 0; innner < outer; innner++)// inner loop (in forward direction)
				if (arr[innner] > arr[innner + 1]) // out of order?
					swap(innner, innner + 1); // swap them

	}

	public void swap(int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos1] = temp;
	}

	public void display() {
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
		}
	}

}

public class BubbleSortingApp {
	public static void main(String[] args) {
		int maxSize = 10;
		Bubble bSort = new Bubble();
		bSort.bubbleSize(maxSize);
		bSort.insert(14);
		bSort.insert(1);
		bSort.insert(5);
		bSort.insert(2);
		bSort.insert(8);
		bSort.insert(6);
		bSort.insert(15);
		bSort.insert(9);
		bSort.insert(0);
		System.out.print("Display Array elements before sorting: ");
		bSort.display();
		bSort.bubbleSort();
		System.out.print("Display Array elements after sorting: ");

		bSort.display();

	}
}
