package hyunhee_project;

import java.util.Arrays;
import java.util.Random;

import hyunhee_project.sort.BubbleSort;
import hyunhee_project.sort.InsertionSort;
import hyunhee_project.sort.MergeSort;
import hyunhee_project.sort.QuickSort;

public class SortTimeChecking {
	static BubbleSort bubble = new BubbleSort();
	static InsertionSort insert = new InsertionSort();
	static SelectionSort select = new SelectionSort();
	static QuickSort quick = new QuickSort();
	static MergeSort merge = new MergeSort();
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] intArr = new int[100000];
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = random.nextInt(100000)+1; 
		}
	
		timeCheck(intArr);
		
	}
	
	public static void timeCheck(int[] intArr) {
		int intLength = intArr.length;
		long start;
		long end;
		
		int[] test1 =Arrays.copyOf(intArr, intLength);
		int[] test2 =Arrays.copyOf(intArr, intLength);
		int[] test3 =Arrays.copyOf(intArr, intLength);
		int[] test4 =Arrays.copyOf(intArr, intLength);
		int[] test5 =Arrays.copyOf(intArr, intLength);
		
		start = System.currentTimeMillis();
		select.selectionSort(test3);
		end = System.currentTimeMillis();
		System.out.println( "selectSort 실행 시간 : " + (end-start)/1000.0);

		
		start = System.currentTimeMillis();
		quick.quickSort(test1,0,intLength-1);
		end = System.currentTimeMillis();
		System.out.println( "quickSort 실행 시간 : " + (end-start)/1000.0);
	
		start = System.currentTimeMillis();
		insert.insertionSort(test2);
		end = System.currentTimeMillis();
		System.out.println( "insertSort 실행 시간 : " + (end-start)/1000.0);
		
	
		start = System.currentTimeMillis();
		bubble.bubbleSort(test4);
		end = System.currentTimeMillis();
		System.out.println( "bubbleSort 실행 시간 : " + (end-start)/1000.0);
		
		start = System.currentTimeMillis();
		merge.mergeSort(test5,0,intLength-1);
		end = System.currentTimeMillis();
		System.out.println( "mergeSort 실행 시간 : " + (end-start)/1000.0);

		System.out.println(Arrays.equals(test1, test2)&&Arrays.equals(test3, test4)&&Arrays.equals(test4, test5));

	}
}
