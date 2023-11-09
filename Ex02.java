package wrapperclass;

public class Ex02 {
	public static void main(String[] args) {
		//Wrapper Class와 primitive type 사이의 값 대입
		
		// float과 long은 대표자료형이 아니므로, F혹은 L을 값 뒤에 붙여준다.
		float fl = 1.2f;
		double db = 0;
		
		db = fl;	//primitive type 끼리는 호환되므로, 대입이 가능하다.
					// 왼쪽 변수의 자료형이 더 크기 때문에 값의 손실이 없어서 암묵적 형변환이 발생한다.
		
		System.out.println("f1 : " + fl + "       /db : " + db);
		System.out.println();
		
		Float fl2 = 1.2F;
		Double db2 = 0.0;	// int 0을 바로 담을수 없어서, 실수 형태로 나타내야 한다.
		
//		db2 = fl2;  // Wrapper Class 끼리는 같은 실수라도, 서로 호환되지 않는다.
					// Wrapper Class 는 자신과 같은 타입의 primitive만 호환된다.
		
//		db2 = (Double)fl2; // 강제 형변환을 시도해도, 호환되지 않으므로 처리할수 없다.
		
		// 1) 서로 호환되는 primitive 타입을 이용하여 강제 형변환으로 대입하기.
		// Float -> float -> double -> Double
		db2 = (double)(float)fl2;
		
		// 2) Wrapper 클래스에서 제공하는 기능(함수)을 활용한다.
		db2 = Double.valueOf(fl2);
		
		System.out.println("fl2 : " + fl2 + ", db2 : " + db2 );
		System.out.println();
		
	}
}
