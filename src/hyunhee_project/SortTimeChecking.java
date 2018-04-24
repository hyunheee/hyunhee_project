package hyunhee_project;

import java.util.Arrays;
import java.util.Random;

public class SortTimeChecking {

	static BubbleSort bubble = new BubbleSort();
	static InsertionSort insert = new InsertionSort();
	static SelectionSort select = new SelectionSort();
	static QuickSort quick = new QuickSort();
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] intArr = new int[10000];
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = random.nextInt(10000)+1; 
		}
	
		timeCheck(intArr);
		
	}
	
	public static void timeCheck(int[] intArr) {
		int[] test1 = intArr;
		int[] test2 = intArr;
		int[] test3 = intArr;
		int[] test4 = intArr;
		
		long start;
		long end;
		
		start = System.currentTimeMillis();
		quick.quickSort(test1,0,test1.length-1);
		end = System.currentTimeMillis();
		System.out.println( "quickSort 실행 시간 : " + (end-start));
	
		start = System.currentTimeMillis();
		insert.insertionSort(test2);
		end = System.currentTimeMillis();
		System.out.println( "insertSort 실행 시간 : " + (end-start));
		
		start = System.currentTimeMillis();
		select.selectionSort(test3);
		end = System.currentTimeMillis();
		System.out.println( "selectSort 실행 시간 : " + (end-start));

		start = System.currentTimeMillis();
		bubble.bubbleSort(test4);
		end = System.currentTimeMillis();
		System.out.println( "bubbleSort 실행 시간 : " + (end-start));
		

		



	
		

	}
}
