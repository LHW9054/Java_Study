package reference;

class Ball{}	// 아무내용도 없는 클래스

class kid{
	// 필드
	private Ball ball = null;
	private String name = null;
	
	// 생성자
	public kid(String name) {
		this.name = name;
	}
	
	// 메서드
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	public  Ball getBall() {
		return ball;
	}
	public String getName() {
		return name;
	}
	
	public void throwBall(kid other) {		// A(도기) 객체의 메서드 내부에서
		other.setBall(ball);				// B(지훈이) 객체의 메서드를 호출할수 있다.
		ball = null;
		System.out.printf("%s가 %s에게 공을 던졌다\n", this.name, other.name);
	}
	
	public boolean hasBall() {
		return ball != null;
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		
		kid ob1 = new kid("도기");
		kid ob2 = new kid("천지훈");
		Ball ball = new Ball();
		
		ob1.setBall(ball);
		
		ob1.setBall(ball);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가 : " + ob1.hasBall());
		System.out.println(ob2.getName() + "가 공을 가지고 있는가 : " + ob2.hasBall());
		System.out.println();
		
		ob1.throwBall(ob2);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가 : " + ob1.hasBall());
		System.out.println(ob2.getName() + "가 공을 가지고 있는가 : " + ob2.hasBall());
		System.out.println();
		
		ob2.throwBall(ob1);
		System.out.println(ob1.getName() + "가 공을 가지고 있는가 : " + ob1.hasBall());
		System.out.println(ob2.getName() + "가 공을 가지고 있는가 : " + ob2.hasBall());
		System.out.println();
		
		
	}
}
