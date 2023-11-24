package abstractClass;

// 직접 객체를 생성하지 않고, 상속을 위한 클래스이다.
abstract class Mybutton2{
	
	// 일반 메서드 click() : 내장된 onclick()을 실행한다.
	public void click() throws Exception{
		this.onClick();
	}
	
	// 추상메서드 onclick() : 내용은 정해지지 않았다.
	protected abstract void onClick() throws Exception; 
			
}

// Mybutton을 상속받는 클래스 TestButton
class TestButton2 {
	
	protected void onClick() throws Exception{
		System.out.println("test");
	}
	
}

class SquareButton2{
	
	private int size;
	
	public SquareButton2(int size) {
		this.size = size;
	}
	
	protected void onClick() throws Exception{
		for(int i = 0; i<size;i++) {
			for(int j = 0; j < size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
}



public class Ex03 {
	public static void main(String[] args) throws Exception{
		TestButton2 btn1 = new TestButton2();
		btn1.onClick();
		
		SquareButton2 btn2 = new SquareButton2(5);
//		btn2.click();
		
//		Object[] arr = { btn1, btn2};
//		for(Object ob : arr) {
//			ob.onClick();
//			ob.click();
//		}
		// object 클래스에서 click() 혹은 onclick()이라는 함수가 없어서 호출불가
		// 개별 실행은 가능하지만, 일괄 처리는 불가능하다.
		
		
		
		
	}
}
