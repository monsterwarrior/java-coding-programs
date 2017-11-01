package org.com.datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		// int[] a= new int[6];
		int[] a = { 4, 2, 6, 1, 5 };
		System.out.println(a.length);
		int i, j, temp;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < 5 - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++)
			System.out.println(a[k]);
	}

}
