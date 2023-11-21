package oop;

//클래스의 구성요소
class test1{
	
	// 멤버 필드 : 변수, 객체가 소멸하기 전까지 유지되는 변수, 객체마다 서로 다른값을 저장할수 있다.
	int n1 = 10;	// 초기값 지정 가능
	int n2;			// 초기값을 지정하지 않으면, 자료형에 맞게 0에 해당하는 값으로 초기화 된다.
	
	// 멤버 메서드 : 함수, 클래스에 의해 생성된 객체는 메서드를 호출할 수 있다.
	//			   메서드 내부에서는 멤버 필드를 참조할수 있다.
	void showadd() {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}
	
	void showmultiple(int m) {	// 매개변수는 함수 지역 안에서만 유효한 지역 변수이다.
		System.out.printf("%d + %d = %d\n",n2,m,n2*m);
	}
	
	
	// 생성자 : 객체를 생성할 때 초기값을 지정하거나, 초기작동을 지정하는 특수한 함수
	// 생성자는 클래스의 이름과 동일한 이름을 사용하는 함수이다.
	// 생성자는 반환형을 작성하지 않는다.
	
	test1() {
		System.out.println("객체를 생성하면 생성자가 호출된다.");
	}
	
	
	// 접근제한자 : 내부 멤버 요소(필드, 메서드, 생성자)에 대한 외부로부터의 접근을 제한하는 요소
	
}
public class Ex03 {
	public static void main(String[] args) {
		test1 ob1 = new test1();	// 생성자를 호출하여 객체를 생성하고
								// 객체를 참조변수가 가리키도록 처리한다.
		
		test1 ob2 = new test1();	// 하나의 클래스로 서로 다른 객체를 생성할수 있따.
		
		ob1.showadd();
		ob2.showmultiple(2);
		
	}
}
