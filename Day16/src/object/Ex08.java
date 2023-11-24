package object;

import java.util.Scanner;

class Test {}

class Test2 extends Object {
	// extends 를 지정하지 않으면, 자동으로 Object 클래스를 상속받는다

	// 상속받은 메서드를 오버라이딩하기 위해 선택하는 메뉴 호출하기
	// source - override/implement methods

	// 자신과 대상의 일치여부를 비교하여 boolean으로 반환
	@Override
	public boolean equals(Object obj) {	
		return super.equals(obj);
	}

	// 객체를 출력하기 위해 문자열로 변환하여 반환
	@Override
	public String toString() {
		return "Test2";
	}
}

public class Ex08 {
	public static void main(String[] args) {
		
		// Object : 자바의 모든 클래스의 최상위 슈퍼 클래스
		Test ob1 = new Test();
		System.out.println(ob1.getClass().getSimpleName());
		
		Test2 ob2 = new Test2();
		System.out.println(ob2.getClass().getSimpleName());
		
		System.out.println("ob1 : " + ob1);
		System.out.println("ob2 : " + ob2);
		System.out.println("ob1 : " + ob1.toString());
		System.out.println("ob2 : " + ob2.toString());
		
		// 형태(타입)에 상관없이 어떤 객체를 저장하기 위해서 Object클래스를 사용하기도 한다
		Integer num = new Integer(100);
		String str = new String("Hello\nWorld");
		Scanner sc = new Scanner(str);
		Runnable run = () -> System.out.println("RUN");
		double[] a = { 1.2, 5.3 };
		
		Object[] arr = { num, str, sc, run, a };
		// 장점 : 자료형에 상관없이 어떤 객체든 저장할 수 있다
		// 단점 : 다른곳에서 꺼내서 사용하려면 다운캐스팅을 해야 정상적으로 사용할 수 있다
		
		System.out.println("sc == arr[2] : " + (sc == arr[2]));
		System.out.println(sc.nextLine());
//		System.out.println(arr[2].nextLine()); // 다운캐스팅이 없으면 메서드를 호출할 수 없다
		System.out.println(((Scanner)arr[2]).nextLine());
		
		// Object의 메서드를 오버라이딩 하는 내용 -> Ex09
		
	}
}











