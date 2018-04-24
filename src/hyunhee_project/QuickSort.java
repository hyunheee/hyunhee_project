package hyunhee_project;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] intArr = {0,0,0,0,10,9,5,8,2,7,3,6,4,1,0,0,0,0};

		System.out.println(Arrays.toString(quickSort(intArr,0,intArr.length-1)));

	}
	
	public static int[] quickSort(int[] intArr,int start,int end) {
	
		if(end-start<=0) {
			return intArr;
		}
		
		int left,right,pivot;
		
		int	pivotIndex = end;
	
		pivot = intArr[pivotIndex];
		left = start;
		right = end-1;
	

		while(true) {	
			while(intArr[left]<pivot&&left<=right) {
				left = left+1;			
			}
			
			while(intArr[right]>pivot&&left<right) {
				right = right-1;
			}

			if(left>=right) {
				break;
			}
			
			int temp = intArr[left];
			intArr[left] = intArr[right];
			intArr[right] = temp;
			
			left = left+1;
			right = right-1;
		
		}	
		
		int temp = intArr[left];
		intArr[left] = intArr[pivotIndex];
		intArr[pivotIndex] = temp;
		
		pivotIndex = left;
	

		quickSort(intArr,start,pivotIndex-1);
		quickSort(intArr,pivotIndex+1,end);
		
		return intArr;
	} 
}
