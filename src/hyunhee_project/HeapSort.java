package hyunhee_project;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int[] intArr = {9,10,5,8,2,7,3,6,4,1,2,1,2,1};
	//	int[] intArr = {0,1,0,2,5,0,9,5,7,8,5};
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
		
		while (parentIndex < size) {
			int childLeftIndex = (parentIndex * 2) + 1;
			int childRightIndex = (parentIndex * 2) + 2;
			int childIndex = 0;
			boolean isChildSelected = false;
			
			if (childLeftIndex < size) {
				if (arr[childLeftIndex] > arr[parentIndex]) {
					childIndex = childLeftIndex;
					isChildSelected = true;
				}
				
				if (childRightIndex < size) {
					if (arr[childRightIndex] > arr[parentIndex]) {
						if (arr[childLeftIndex] < arr[childRightIndex]) {
							childIndex = childRightIndex;
							isChildSelected = true;
						} 
					}				
				}
			}
			
			if (isChildSelected) {
				// swap
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				
				parentIndex = childIndex;
			} else {
				break;
			}
		}
		
		System.out.println("heapify size("+size+"):"+Arrays.toString(arr));
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
