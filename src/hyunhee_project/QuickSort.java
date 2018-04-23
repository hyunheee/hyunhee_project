package hyunhee_project;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] intArr = {10,9,5,8,2,7,3,6,4,1};
	//	int[] intArr = {3,4,2,5};
	//	int[] intArr = {1,4,5,6,2,3,3,10,11,10,1};
		System.out.println(Arrays.toString(quickSort(intArr,0,intArr.length-1)));
		
	}
	
	public static int[] quickSort(int[] intArr,int start,int end) {
	
		if(end-start<0) {
			return intArr;
		}
		
		int left,right,pivot;
		int[] quickSort = intArr;
		int	pivotIndex = end;
	
		pivot = quickSort[pivotIndex];
		left = start;
		right = end-1;
	
		if(end<1) {
			right = end;
		}

		while(left<right) {	
			while(quickSort[left]<=pivot&&left<=right) {
				left = left+1;			
			}
			
			while(quickSort[right]>=pivot&&left<right) {
				right = right-1;
			}
			
			int i;
			
			if(left>=right) {
				i=pivotIndex;
				pivotIndex = left;
			
			}else {
				i=right;
			}
			
			int temp = quickSort[left];
			quickSort[left] = quickSort[i];
			quickSort[i] = temp;
		
		}	

		quickSort(quickSort,start,pivotIndex-1);
		quickSort(quickSort,pivotIndex+1,end);
		
		return quickSort;
	} 
}
