
package resizableArray;

import java.util.ArrayList;

class MyList {
	private int[] arr = new int[0];
	private int[] tmp;
	private int length = 0;
	
	public int size() {
		return length;
	}

	public boolean add(int element) {	// 추가 함수
		boolean flag = true;
		int i = 0;
		length += 1;			// 새로운 값을 추가하기 위해서 길이를 1 증가시키고
		tmp = new int[length];	// 조정된 길이로 새로운 배열을 생성한다
		for(i = 0; i < arr.length; i++) {	// 기존 배열의 모든 값을 새 배열에 복사하여 저장한다
			tmp[i] = arr[i];
		}
		tmp[i] = element;		// 마지막에 전달받은 인자를 새로운 배열에 추가한다
		arr = tmp;				// arr가 새로운 배열을 참조하도록 한다
		return flag;
	}
	public boolean remove(int index) {
		boolean flag = false;	// 지정한 index의 값을 찾아서 제거하면 true로 바꿔야 한다
		if(index < 0 || length <= index) {	// 범위를 벗어나면
			return flag;					// 함수를 종료한다
		}
		length -= 1;
		tmp = new int[length];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
//			System.out.printf("%d, %d\n", i, j);
			if(i != index) {
				tmp[j] = arr[i];
				j++;
			}
		}
		arr = tmp;
		return flag;
	}
	
	public String toString() {
		String s = "[";
		for(int i = 0; i < arr.length; i++) {
			s += arr[i];
			s += i != arr.length - 1 ? ", " : "]";
		}
		return s;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		MyList list = new MyList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		System.out.println("list.size() : " + list.size());
		System.out.println("list : " + list);
		
		list.remove(1);		// 1번째 index의 값을 제거하고 배열의 길이를 1감소시킨다
		System.out.println("list.size() : " + list.size());
		System.out.println("list : " + list);
		System.out.println();
		
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(20);
		System.out.println("list2.size() : " + list2.size());
		System.out.println("list2 : " + list2);
		
		list2.remove(1);	// 1번째 index의 값을 제거하고 배열의 길이를 1감소시킨다
		System.out.println("list2.size() : " + list2.size());
		System.out.println("list2 : " + list2);
		
	}
}
