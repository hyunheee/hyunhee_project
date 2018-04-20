package hyunhee_project;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] intArr = {10,9,5,8,2,7,3,6,4,1,0};
		System.out.println(Arrays.toString(insertionSort(intArr)));
	}
	
	public static int[] insertionSort(int[] intArr) {
		final int SORT_LENGTH = intArr.length;
		int[] insertionSort = intArr;
		
		for(int i=1;i<SORT_LENGTH;i++) {
			int key = insertionSort[i];
			for(int j=i-1;j>=0&&key<insertionSort[j];j--) {	
				insertionSort[j+1]=insertionSort[j];
				insertionSort[j] = key;
			}
		}
		return insertionSort;
	}
}
