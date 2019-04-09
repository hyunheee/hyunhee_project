package hyunhee_project;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int arr[] = {37,14,17,41,36};
		
		repeat(arr);
		repeat(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static int[] repeat(int[] arr) {
		int temp=0;
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i-1]>arr[i]) {
				temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}
			
		}
		return arr;
	}
}
