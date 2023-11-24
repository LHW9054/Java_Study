package static_final;

class Test2{
	// final : 변경할수 없다. 마지막 값이다.
	// 지역변수 에 사용가능, 처음 설정한 값을 이후 변경할수 없다.
	// 멤버필드에 사용가능,처음 설정한 값을 이후 변경할수 없다.
	// 메서드에 사용가능, 함수의 내용을 변경할수 없다 (오버라이딩 불가)
	// 클래스에 사용가능, 클래스의 구성을 변경할수 없다.(상속불가)
	
	final int n3 = 10;
	final int n4;	// The blank final field n4 may not have been initialized
					// 초기화 되지 않은거 같습니다.
	private final int n5 = 30;
	public static final String ACADEMY_NAME = "KGITBANK";
	final int n6 = Integer.MAX_VALUE;	// class에 하나만 있는 값이고 바꿀수 없다.
	
	
	Test2(int n4){			// final 멤버필드는 생성자를 통한 초기화가 가능하다.
		this.n4 = n4;
	}
	
	public int getN5() {	// final 필드에 대한 getter 생성가능
		return n5;			// setter는 값을 대입하는 함수이므로 생성 불가
	}
}

public class Ex03 {
	public static void main(String[] args) {
		int n1 = 10;
		final int n2 = 20;
		
		System.out.println(n1);
		System.out.println(n2);
		
		n1 += 1;
		//n2 += 1;
		//The final local variable n2 cannot be assigned.
		//It must be blank and not using a compound assignment
		
		System.out.println("학원이름 : " + Test2.ACADEMY_NAME);
		
	}
}
