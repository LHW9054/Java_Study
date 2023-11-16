package Function;
public class Ex01 {
	// 함수정의(어떤형식으로 실행할지 결정하고, 함수의 이름과 형태를 지정한다.) def(definition, define)
	// 정의하는 시점에서 실행되는 것은 아니다.
	
	static int add(int n1, int n2) {	// 인자를 매개변수에 받아서
		int answer = n1 + n2;			// 매개변수의 값을 이용하여 코드를 진행
		return answer;					// 마지막에 결과값을 반환한다.
	}									// 반환값은 함수 호출자리로 되돌아가게 되어 있다.
										// 함수의 반환값은 곧 함수 그자체의 자료형이 된다.
	
	public static void main(String[] args) {
		// 함수 : 자주 사용되는 코드를 묶어서 필요할 때 마다 실행할수 있는 형태로 지정한 형식
		// 일정한 입력값에 따라서 코드를 실행하고, 그 결과를 외부로 반환할수 있는 코드의 묶음
		
		int a = 3, b = 2, c = 1, d = -1;
		
								// 함수 실행 순서)
		int r1 = add(a,b);		// 함수의 이름을 불러서(call)
		int r2 = add(b,c);		// 실행하면서, 필요한 값을 전달한다.(인자)
		int r3 = add(a,-5);		// 실행된 이후 결과값을 돌려받는다.(반환)
		int r4 = add(d, 3 * c);	// 반환값은 호출코드를 대체한다.
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		System.out.println("add(10,20) : " + add(10,20));
		
		// y = f(x)
		// 보통, 입력값이 존재한다
		// 일정한 코드를 수행한다.
		// 대부분 출력값(결과값, 반환값)이 존재한다.
		
		// 복잡한 단계로 일어나는 동작을 하나의 개념으로 묶어서 표현할 수 있게 된다.
		
		
	}
}
