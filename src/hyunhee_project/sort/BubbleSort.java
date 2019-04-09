package hyunhee_project.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] intArr = {10,9,5,8,2,7,3,6,4,1,0};
		System.out.println(Arrays.toString(bubbleSort(intArr)));
	}
	
	
	public static int[] bubbleSort(int[] intArr) {
		final int SORT_LENGTH = intArr.length;
		int[] bubbleSort = intArr;
		boolean isChecked;
		
		for(int i=0;i<SORT_LENGTH;i++) {
			isChecked = true;
			for(int j=1;j<SORT_LENGTH-i;j++) {		
				if(bubbleSort[j-1]>=bubbleSort[j]) {
					int temp = bubbleSort[j-1];
					bubbleSort[j-1] = bubbleSort[j];
					bubbleSort[j] = temp; 
					
					isChecked=false;
				}
			}
			if(isChecked) {
				break;
			}
		}
		
		return bubbleSort;
	}
}
