package constructor;

class Circle{	// 원의 넓이 : 반지름 * 반지름 * 3.14
////내가한거//////////////////////////////////////
//	int Size;
//	float won;
//	
//	public int getSum(float won) {
//		return won;
//	}
//	
//	void float won(int Size) {
//		won = (Size^2)*3.14;
//	}
///////////////////////////////////////////////
	
////강사님//////////////////////////////////////

	private double radius;
	private double pi = 3.14;
	private double size;
	
	Circle() {						// 생성자가 여러개 있더라도 (오버로딩)
		this(1.0);					// 클래스의 목적은 대부분 비슷하기 때문에
	}								// 각 생성자마다 코드를 따로 쓰기보다는
	Circle(int radius){				// 하나의 생성자에 코드를 작성하고
		this((double)radius);		// 다른 생성자들은 특정 생성자를 호출하는 방식으로
									// 작성하는것이 좋다
	}
	Circle(double radius){
		this.radius = radius;
		size = radius*radius*pi;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getSize() {
		return size;
	}
	
///////////////////////////////////////////////
	
	
}

public class Quiz01 {
	public static void main(String[] args) {
		// 컨트롤 클릭 : 함수의 정의로 이동
		// 알트 + ← : 이전 위치로 이동
		
		Circle c1 = new Circle();		// 값을 전달하지 않으면 기본값은 1
		Circle c2 = new Circle(3);		// 반지름을 정수로 전달
		Circle c3 = new Circle(2.4);	// 반지름을 실수로 전달
		
		System.out.printf("c1.getSize() : %.2f\n" + c1.getSize());
		System.out.printf("c2.getSize() : %.2f\n" + c2.getSize());
		System.out.printf("c3.getSize() : %.2f\n" + c3.getSize());
		
	}
}
