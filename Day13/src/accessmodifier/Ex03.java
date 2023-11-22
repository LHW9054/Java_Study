package accessmodifier;

// getter/setter
// getter : 필드의 값을 반환하여 외부에서 참조할 수 있도록 처리하는 메서드
// setter : 외부에서 매개변수에 값을 전달받아서 내부 멤버 필드에 값을 대입하는 메서드
// getter와 setter는 필드이름과 조합하여 이름을 지정한다.
// get + 필드이름(이때, 필드이름의 첫글자는 대문자로 변경한다.)
// set + 필드이름(이때, 필드이름의 첫글자는 대문자로 변경한다.)

// 필드의 자료형이 boolean이라면 get대신 is를 사용한다.
// is 혹은 can, has 등으로 변형된 경우도 있다.

class Test4{
	private int num;
	private String str;
	private boolean over;
	
	// private 필드 작성이후 클래스 내부에서 오른쪽 클릭
	// source - generate getters and setters
	// 원하는 필드를 선택, 접근제한자는 public, 이후 generate 버튼 클릭
	
	public int getNum() {			// 현재 멤버필드의 값을
		return num;					// 외부로 '반환' 하는 메서드
	}
	public void setNum(int num) {	// 매개변수에 값을 전달받아서
		this.num = num;				// 멤버필드에 '대입' 하는 메서드
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public boolean isOver() {
		return over;
	}
	public void setOver(boolean over) {
		this.over = over;
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Test4 ob = new Test4();
//		ob.str = "HELLO";
		ob.setStr("Hello");
		
//		ob.num = 1234;
		ob.setNum(1234);
		
//		ob.over = false;
		ob.setOver(false);
		
		System.out.println("ob. str : " + ob.getStr());
		System.out.println("ob. num : " + ob.getNum());
		System.out.println("ob. ober : " + ob.isOver());
	}
}
