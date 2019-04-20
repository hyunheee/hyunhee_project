package hyunhee_project.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] intArr = {10,9,5,8,2,7,3,6,4,1,0};
		System.out.println(Arrays.toString(selectionSort(intArr)));
	}
	
	public static int[] selectionSort(int[] intArr) {
		int[] selectArr = intArr;
		int temp = 0;
		int min;
		
		for(int i=0;i<selectArr.length-1;i++) {
			min = i;
			for(int j=i+1;j<selectArr.length;j++) { 
				if(selectArr[min]>selectArr[j]) {
					min = j;	
				}
			}  
			
			temp = selectArr[i];
			selectArr[i] = selectArr[min];
			selectArr[min] = temp;                                                                                   
		}
		
		return selectArr;
	}
}