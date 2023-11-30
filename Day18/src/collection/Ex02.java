package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
//		Cannot instantiate the type List(Interface)
//		List list = new List();
		
		ArrayList list = new ArrayList();
		System.out.println("list : " + list);
		System.out.println("리스트의 크기 : " + list.size());
		System.out.println();
		
		list.add(10);		// 리스트에 객체를 추가하는 메서드
		list.add(20);		// 리스트의 맨 마지막에 요소를 추가한다
		list.add("ITBANK");	// 리스트에 값을 추가할 때마다 길이가 증가한다
		list.add(20);		// 리스트에서는 값의 중복이 허용된다
		
		// 컬렉션은 toString() 이 오버라이딩 되어 있어서 바로 출력할 수 있다
		System.out.println("list : " + list);
		System.out.println("리스트의 크기 : " + list.size());	// arr.length
		System.out.println();
		
		// 리스트에서 index를 이용하여 특정 요소를 불러오기
		// 리스트에서 삭제되는것은 아니다
		System.out.println("list.get(0) : " + list.get(0));	// arr[i]
		System.out.println("list.get(1) : " + list.get(1));
		System.out.println("list.get(2) : " + list.get(2));
		System.out.println("list.get(3) : " + list.get(3));
		System.out.println();
		
		list.remove(1);		// remove(int index) : index번째 객체를 삭제한다
							// 빈칸을 그대로 두지않고 당겨서 채우고 size가 감소한다
		System.out.println("list : " + list);
		System.out.println("리스트의 크기 : " + list.size());
		System.out.println();
		
		list.remove("ITBANK");	// 일치하는 객체를 전달하여 제거할 수 있다
		
		System.out.println("list : " + list);
		System.out.println("리스트의 크기 : " + list.size());
		System.out.println();
		
		// 반복되는 작업을 처리하는 별도의 메서드가 있다
		list.forEach(o -> o += "1");
		list.forEach(o -> System.out.println(o));
		
		// Object 클래스에는 replace() 함수가 정의되어 있지 않아서 호출할 수 없다
		// list.forEach(s -> System.out.println(s.replace(" ", "")));
		
		
		
		
	}
}
