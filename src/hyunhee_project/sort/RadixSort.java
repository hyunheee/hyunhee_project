package hyunhee_project.sort;

import java.util.Arrays;

import hyunhee_project.Queue;

public class RadixSort {
	public static void main(String[] args) {
		int[] intArr = {100,9,5,8,2,7,3,6,4,1,0};
		System.out.println(Arrays.toString(radixSort(intArr)));
	}
	
	public static int[] radixSort(int[] intArr) {	
		int max=intArr[0];
		Queue<Integer> queue = new Queue<>();
		
		for(int i=0;i<intArr.length;i++) {
			if(max<intArr[i]) {
				max = intArr[i];
			}
		}
		
		int logMax = (int)Math.log10(max);
		
		int t = 10;
		for(int j=0;j<intArr.length;j++) {
			for(int z=0;z<logMax;z++) {
				String str = String.valueOf(intArr[j]);
				
				System.out.println(str.charAt(z));
			}
			
			
		
		}
		
		return intArr;
	}
}
