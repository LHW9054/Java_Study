package static_final;

class Guest{
	String name;	// non-static 필드
	static int count;		// static 필드(서로 다른 객체라도 값을 공유하게 된다.)
	
	Guest(String name){		// 생성자
		this.name=name;
		count += 1;			// 객체를 생성할때 마다, count의 값을 1 증가시킨다.
	}
	
	void show() {
		System.out.println(name + "입장!");
		System.out.println("현재까지 입장한 손님의 인원수 : " + count);
	}
	
	
}

public class Ex02 {
	
	
	public static void main(String[] args) {
		Guest ob1 = new Guest("이지은");
		ob1.show();
		
		Guest ob2 = new Guest("홍진호");
		ob2.show();
		
		System.out.println("현재까지의 손님 수 : " + Guest.count);
		
		System.out.println(Integer.parseInt("1234") + 1);
		
		
		
	}
}
