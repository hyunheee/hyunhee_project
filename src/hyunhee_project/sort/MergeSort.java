package hyunhee_project.sort;

import java.util.Arrays;
import java.util.Collections;

public class MergeSort {
	public static void main(String[] args) {
		int[] intArr = {10,9,5,8,2,7,3,6,4,1,0};	
		System.out.println(Arrays.toString(mergeSort(intArr,0,intArr.length-1)));
	}
	
	public static int[] mergeSort(int[] intArr,int start,int end) {
		
		if(end-start<1) {
			return intArr;
		}
		
		int middle = (start+end)/2;
		
		mergeSort(intArr,start,middle);			
		mergeSort(intArr,middle+1,end);
		
		mergeSortArray(intArr,start,middle,end);
		
		return intArr;
	}
	
	public static int[] mergeSortArray(int[] intArr,int start,int middle,int end) {

		int[] mergeArr = new int[end-start+1];
		int left = start;
		int right = middle+1;	
		int i = 0;
		
		while(left<=middle&&right<=end) {
			if(intArr[left]>intArr[right]) {
				mergeArr[i++]=intArr[right++];
			}else {
				mergeArr[i++]=intArr[left++];
			}
		}
	
		while(left<=middle) {
			mergeArr[i++]=intArr[left++];
		}
		
		while(right<=end) {
			mergeArr[i++]=intArr[right++];
		}
		
		System.arraycopy(mergeArr, 0, intArr, start, mergeArr.length);

		return mergeArr;
	}
}
