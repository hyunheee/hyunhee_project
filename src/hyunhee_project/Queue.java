package hyunhee_project;

import java.util.LinkedList;

public class Queue<T> {
	LinkedList<T> list = new LinkedList<>();
	
	public void enQueue(T value) {
		list.add(value);
	}
	
	public T deQueue() {
		T data = list.get(0);
		list.removeFirst();
		return data;
	}
}
