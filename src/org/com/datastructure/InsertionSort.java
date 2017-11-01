package org.com.datastructure;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {4,6,8,2,4,1,0};
		
		int i,j,temp;
		for(i=0;i<arr.length;i++){
			temp = arr[i];
			j=i;
			while(j>0 && arr[j-1]>=temp){
				arr[j]=arr[j-1];
				--j;
			}
			arr[j]=temp;
		}
		for(int k = 0;k<arr.length;k++)
		System.out.println(arr[k]);
	}

} 
