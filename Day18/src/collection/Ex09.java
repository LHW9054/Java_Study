package collection;

import java.util.ArrayList;

class MyQueue {
	ArrayList<String> list = new ArrayList<>();
	
	public void enqueue(String value) {
		list.add(value);
	}
	
	public String dequeue() {
//		if(list.size() == 0) {
		if(list.isEmpty()) {
			return null;
		}
		return list.remove(0);
	}
}

public class Ex09 {
	// Queue : First In First Out, 먼저 들어간 데이터가 먼저 나오는 구조
	// 순서대로 데이터를 처리하기 위해 사용하는 형식
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue("짜장");
		queue.enqueue("짬뽕");
		System.out.println(queue.list);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
