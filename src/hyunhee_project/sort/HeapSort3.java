package hyunhee_project.sort;

import java.util.Arrays;

public class HeapSort3 {
	public static void main(String[] args) {
	//	int[] intArr = {9,10,5,8,2,7,3,6,4,1,2,1,2,1};
	 //	int[] intArr = {0,1,0,2,5,0,9,5,7,8,5};
		int[] intArr = {5,4,3,2,6,3,1,3,5,5,5,1};
		//	initHeap(intArr);
	//	initHeap(intArr);
		heapsort(intArr);
		System.out.println(Arrays.toString(intArr));
	}
	
	private static void heapsort(int[] arr) {
		int max;
		initHeap(arr);
		
		System.out.println("initHeap:"+Arrays.toString(arr));

		for(int i=arr.length-1; i > 0 ;i--) {
			max = arr[0];
			arr[0] = arr[i];
			arr[i] = max;
			
			heapify(arr,i);
		}
	}
	
	private static void heapify(int[] arr, int size) {

		int parentIndex = 0;
		int tmp;
		int childIndex=0;
		int childLeftIndex;
		int childRightIndex;
		
		while(parentIndex<size) {
			childLeftIndex = (parentIndex*2)+1;
			childRightIndex = (parentIndex*2)+2;

			if(childLeftIndex<size&&childRightIndex<size) {
				childIndex = arr[childLeftIndex]>=arr[childRightIndex]?childLeftIndex:childRightIndex;
			}else if(childLeftIndex<size) {
				childIndex = childLeftIndex;
			}else {
				return;
			}

			if(arr[parentIndex]<arr[childIndex]) {
				//swap
				tmp = arr[parentIndex];
				arr[parentIndex]=arr[childIndex];
				arr[childIndex] = tmp;
				parentIndex=childIndex;
			}else {
				return;
			}
		}
	}
	
	private static void initHeap(int[] arr) {
		final int size = arr.length;
		int temp;
		
		for (int i = 1; i < size; ++i) {
			int child = i;
			int parent = getParent(child);
			
			while (arr[child]>arr[parent]&&parent != child) {
			// swap
				temp = arr[child];
				arr[child] = arr[parent];
				arr[parent] = temp;
	
				child = parent;
				parent = getParent(child);
			}
		}
		
	}
	
	private static int getParent(int currentIndex) {
		if (currentIndex == 0) {
			return 0;
		}
				
		// 현재 인덱스의 부모를 찾기 위해..
		// 내가 짝수인 경우 : (n - 2) / 2
		// 내가 홀수인 경우 : (n - 1) / 2
		
		int parent;
		
		if ((currentIndex & 1) == 0) {	// bitwise and 로 %2 대체 처리
			parent = currentIndex - 2;
		} else {
			parent = currentIndex - 1;
		}
		 
		parent = parent / 2;
		
		return parent;
	}
}

