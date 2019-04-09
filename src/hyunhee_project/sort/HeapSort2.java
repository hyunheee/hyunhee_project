package hyunhee_project.sort;

import java.util.Arrays;

public class HeapSort2 {
	public static void main(String[] args) {
		//int[] intArr = {9,10,5,8,2,7,3,6,4,1,0};
		int[] intArr = {0,1,0,2,5,0,9,5,7,8,5};
		initHeap(intArr);
		//heapsort(intArr);
		System.out.println(Arrays.toString(intArr));
	}
	
	private static void heapsort(int[] arr) {
		int max;
		initHeap(arr);
		
	//	max = arr[0];
		
		for(int i=arr.length-1;i>0;i--) {
			max = arr[0];
			arr[0] = arr[i];
			arr[i] = max;
			System.out.println(arr[i]+"?"+i);
			System.out.println(Arrays.toString(arr));
			heapify(arr,0,i);
		}
	}
	
	private static void heapify(int[] arr,int i,int j) {
		
		int temp;
		int parent = i;
		int child;
		int childLeft = getChild(parent,true);
		int childRight = getChild(parent,false);
		
		child = arr[childLeft]>arr[childRight]?childLeft:childRight;
		//System.out.println(arr[childLeft]+"?"+arr[childRight]+"bbb"+child);
		System.out.println(j+"값은???");
		while(arr[parent]<arr[child]&&child<j) {
			System.out.println(parent+"?anjdi?"+child);
			// swap
			temp = arr[parent];
			arr[parent] = arr[child];
			arr[child] = temp;
		//	System.out.println(arr[parent]+"!!!"+arr[child]);
			parent = child;
			
			heapify(arr,parent,j);
		}
		//System.out.println(Arrays.toString(arr));
	}
	
	private static void initHeap(int[] arr) {
		final int size = arr.length;
		int temp;
		
		for (int i = 1; i < size; ++i) {
			int child = i;
			int parent = getParent(child);
			
			while (parent != child) {
				if (arr[i] > arr[parent]) {
					// swap
					temp = arr[i];
					arr[i] = arr[parent];
					arr[parent] = temp;
				}
				
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
	
	private static int getChild(int currentIndex,boolean left) {
		int childLeft;
		int childRight;
		
		if(currentIndex>=5) { 
			
			return currentIndex;
		}
		
		childLeft = (currentIndex*2)+1;
		childRight = (currentIndex*2)+2;
		
		if(left) {
			return childLeft;
		}else {
			return childRight;
		}
	}
}
