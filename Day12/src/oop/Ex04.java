package oop;

class test2{
	int n1;
	
	void up(int n3) {
		int n2 = 0;
		
		n1 +=1;
		n2 +=1;
		n3 +=1;
		System.out.println("n1 : " + n1);	// 멤버필드 : 객체 소멸전까지 유지됨
		System.out.println("n2 : " + n2);	// 지역변수 : 함수 실행시 생성되고 종료되면 소멸함
		System.out.println("n3 : " + n3);	// 매개변수 : 함수 실행시 값이 지정되고 종료되면 소멸함
		System.out.println();
	}
}

public class Ex04 {
	public static void main(String[] args) {
		test2 ob = new test2();
		ob.up(10);
		ob.up(20);
		ob.up(25);
		
		System.out.println("ob.n1 : " + ob.n1);
		// .연산자는 객체 내부 멤버 요소에 접근하는 연산자 이다.(필드, 메서드)
		// ~의 (소유격 조사) 에 해당하는 기호이다.
		// 01.name : 01객체 내부의 필드 name
		// 02.name : 02객체 내부의 필드 name
		
	}
}
