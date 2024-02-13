package inheritance;

class Pos{
	int x;
	int y;
	
	Pos(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void show() {
		System.out.println("x : " + x + ", y : "+y);
	} 
}
class Pos3D extends Pos{
//	int x;	// Pos가 가지고 있는 멤버필드이므로 작성할 필요가 없다.
//	int y;
	int z;
	
	Pos3D(int x, int y, int z) {
		super(x,y);		// Pos 생성자에게 전달하면 알아서 넣어준다.
//		this.x = x;	
//		this.y = y;	
		this.z = z;	
	}
	@Override			// 상속받은 함수의 형태 그대로 내용만 덮어쓴다.
	void show() {		// 함수도 물려받았지만 새로 정의하면 내용을 바꿔서 실행할수 있다.
		System.out.printf("x : %d, y : %d, z :%d\n",x ,y ,z);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Pos ob1 = new Pos(2, 3);
		ob1.show();
		
		Pos3D ob2 = new Pos3D(4, 7, 1);
		ob2.show();
		
		// 상속 : 이미 만들어진 클래스의 필드와 메서드를 그대로 물려 받고
		// 필요한 필드/메서드를 추가하거나, 기본 메서드의 내용을 변경하여
		// 새로운 용도의 클래스를 작성하는 방법
		
		// 이미 만들어진 클래스의 상세한 내용을 몰라도
		// 클래스의 이름만 알면 플요한 기능을 모두 가져올수 있따.
		
		// 자료형의 재활용
		
	}
}
