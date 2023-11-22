package accessmodifier;
class Test1{
		private int n1 = 10;
		/*package*/ int n2 = 20;
		protected int n3 = 30;
		public int n4 = 40;
	
		void show() {
			// private 이더라도 내부에서는 자유롭게 접근할수 있다.
			System.out.println("n1 : " + n1);
			System.out.println("n2 : " + n2);
			System.out.println("n3 : " + n3);
			System.out.println("n4 : " + n4);
			System.out.println();
		}
		public class Ex01 {
			/*
			 *  접근 제한자 	: 클래스 내부 구성 요소에 대한 접근을 통제하는 요소
			 *  
			 *  private		: 클래스 내부에서만 해당 요소에 대한 접근을 허용한다.
			 *  package 	: 같은 패키지 내부의 클래스 끼리는 접근을 허용한다.
			 *  protected 	: 같은 패키지 내부 + 다른 패키지라도 상속관계로 묶여있다면 접근을 허용한다.
			 *  public		: 모든 클래스로부터의 접근을 허용한다.
			 */
		}
	
	
		public static void main(String[] args) {
			
			Test1 ob = new Test1();
			
			ob.n1 = 15; // private이므로 접근(대입연산)불가
			ob.n2 = 25;
			ob.n3 = 35;	// ob.setN3(35);
			ob.n4 += 5;
			
			// The field Test1.1 is not visible
			// Test1 클래스의 n1필드는 보이지 않습니다.
	//		System.out.println("ob.n1 : " + ob.n1);
			System.out.println("ob.n2 : " + ob.n2);
			System.out.println("ob.n3 : " + ob.n3);	//ob.setN3(35);
			System.out.println("ob.n4 : " + ob.n4);
			System.out.println();
			
			ob.show();
			
			// 필드의 접근제한자를 private으로 설정한 이후
			// 외부로부터의 접근을 허용하고 싶다면 public으로 관련 함수를 작성하면 된다.
			// 접근을 허용하고 싶지 않다면, 함수를 작성하지 않으면된다.
			
			// 보통, 필드는 private, 메서드는 public으로 설정하는 것이 일반적이다.
			// 단, 객체 생성을 막기 위해서 생성자에 private을 지정하는 경우가 있고(싱글톤)
			// static final 필드에 대해서는 public으로 지정한다.
			
			// 생성자에 private을 지정하여 생성자를 호출할 수 없는 클래스
	//		Runtime rt = new Runtime();
			Runtime rt = Runtime.getRuntime();
			
			// 필드에 public을 지정한 staric final 필드
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
	}

}	