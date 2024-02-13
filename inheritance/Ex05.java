package inheritance;

class Calc {				//슈퍼클래스, 부모클래스, 상위 클래스
	protected int add(int n1, int n2) {
		return n1 + n2;
	}
}

class Calc2 extends Calc{	// 서버클래스, 자식클래스, 하위 클래스
	
	@Override
//	Cannot reduce the visibility of the inherited method from Calc
//	1) 상속받은 메서드의 접근제한 범위를 더 줄일수 없다.(넓히기는 가능)
//	public은 가능
	
//	2) 상속받은 메서드의 반환형과 일치해야 한다.
//	3) 상속받은 메서드의 이름과 매개변수 유형 및 개수가 정확하게 일치해야 한다.
//	4) 슈퍼클래스로 참조해도 메서드로 호출하면 서브클래스에서 정의 한대로 실행된다.
	
	public int add(int n1, int n2){
		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
		return n1 + n2;
	}
}




public class Ex05 {
	public static void main(String[] args) {
		
		// 슈퍼클래스 객체
		Calc ob1 = new Calc();
		
		// 서브클래스 객체
		Calc ob2 = new Calc2();
		
		int n1 = ob1.add(10, 20);
		int n2 = ob2.add(12, 23);
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		// 서브클래스의 객체는 슈퍼클래스 타입이다.
		// 학생은 사람이다.
		// 고양이는 동물이다.
		// 강아지는 동물이다.
		// Calc2는 Calc이다.
		
		Calc test = ob2;		// test의 자료형은 Calc (슈퍼클래스)
		test.add(100, 200);		// add의 실행내용은 Calc2 (서브클래스)를 따라간다.
		
		
		
	}
}
