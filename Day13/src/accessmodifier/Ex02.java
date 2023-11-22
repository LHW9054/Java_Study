package accessmodifier;

class Test2{		
	String name;
	int age;
}

class Test3{							// 접근제한자를 적용한 클래스
	private String name;
	private int age;	
	
	public void setName(String name) {	// 외부에서 넘어온 값을 저장하는 매개변수
		this.name = name;				// 매개변수의 값을 멤버필드에 저장한다.
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;					// private이더라도 내부에서는 접근이 자유롭다.
	}
	public int getAge() {
		return age;						// 필드에 담긴 값을 복사하여 저장한다.
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		ob.name = "이지은";
		ob.age = 31;
		System.out.printf("%s의 나이는 %d입니다.\n", ob.name, ob.age);
		
		Test3 ob2 = new Test3();
//		ob.name = "홍진호";
		ob2.setName("홍진호");
//		ob2.age = 42;
		ob2.setAge(42);
		
//		System.out.printf("%s의 나이는 %d살 입니다.\n", ob2.name, ob2.age);
		System.out.printf("%s의 나이는 %d살 입니다.\n", ob2.getName(), ob2.getAge());
	}
}
