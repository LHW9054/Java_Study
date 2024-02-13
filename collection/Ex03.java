package collection;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		// 컬렉션의 제네릭 타입
		
		// 컬렉션에 들어가는 객체는 기본적으로 Object로 취급된다.
		// Object로 되어있으면 모든 객체를 추가할수 있다는 장점이 있으나(Ex02.java)
		// 특정 프로그램에서는 보통 특정 타입의 객체만 다루게 외고
		// Object로 업캐스팅 되어 있으면 특정 메서드를 호출하기 위해 다운캐스팅을 수행해햐 한다.
		// 불필요한 다운캐스팅을 하지 않기 위해서 리스트에 들어가는 객체의 표준 타입을 지정할수 있다.
		// 자바 1.5이후로는 제네릭 타입을 지정하는 것이 기본 권장 사항이다.
		
		ArrayList<String> list = new ArrayList<String>();
		
		// The method add(int, String) in the type ArrayList<String> 
		// is not applicable for the arguments (int)
//		list.add(10);
		
		list.add("10");	// 제네릭 타입으로 지정된 형식의 객체만 추가할수 있다.
		list.add("20");
		list.add("I T B A N K");
		list.add("20");
		
		System.out.println(list);
		
		list.forEach(s -> System.out.println(s.replace(" ", "")));
		System.out.println(list);
		
		for(int i = 0; i <list.size(); i++) {
			System.out.printf("list.get(%d) : %s\n",i,list.get(i));
		}
		
		System.out.println();
		
		for(String s: list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		
		
	}
}
