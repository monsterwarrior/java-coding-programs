package org.com.datastructure;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {4,2,1,5,6};
		int i,j,min, temp;
		for(i = 0;i<= a.length-1;i++){
			min = i;
			for(j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			temp = a[i];
			a[i]=a[min];
			a[min]= temp;
		}
		for(int k= 0;k<a.length;k++){
		System.out.println(a[k]);
		}
		System.out.println("");
		System.out.print(a.length);
		System.out.print(a.length-2);
		System.out.print(a.length-3);
		System.out.print(a.length-4);
		//System.out.print(a.length-1);
		
	}

}
