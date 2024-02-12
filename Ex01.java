package static_final;

// static은 클래스에 소속되는 필드및 메서드
// 클래스가 객체보다 먼저 메모리에 로드된다.
// 클래스가 로드되는 시점에서 static 요소는 생성이 되어있다.
// 클래스만 로드된 시점에서 아직 객체는 생성되지 않았다.
// 따라서 static요소는 non-static요소를 정상적으로 참조할 수 있는 보장할수 없다.

class Test1{
	int n1 = 10;
	static int n2 = 20;
	//Cannot make a static reference to the non-static field n1
	/*▲static*/ void showN1() {
		System.out.println(n1);
	}
	
	static void showN2() {
		System.out.println(n2);
	}
	
}

public class Ex01 {
	public static void main(String[] args) {
		// static : 객체마다 서로 다른값이 아니라, 클래스에 '고정'된 값
		
//		System.out.println("Test.n1 : " + Test1.n1);
		System.out.println("Test.n2 : " + Test1.n2);
		
		Test1 ob = new Test1();
		System.out.println("ob.n1 : " + ob.n1);
		System.out.println("ob.n2 : " + ob.n2);
		//The static field Test1.n2 should be accessed in a static way
		//서로 다른 객체들이 공유하는 값이 된다.
		
		
	}
}
