package variable;

public class Ex02 {

	public static void main(String[] args) {
		
		// 변수의 자료형에 따라서 담을수 있는 데이터가 다르다
		
		boolean v1 = true;	//1바이트 논리값을 저장할수 있는 변수
		byte by = 100;		//1바이트 정수를 저장할수 있는 변수
		int num = 200;		//4바이트 정수를 저장할수 있는 변수
		double db = 300;	//8바이트 실수를 저장할수 있는 변수
		
		System.out.println("v1 : " + v1);
		System.out.println("by : " + by);
		System.out.println("num  : " + num);
		System.out.println("db : " + db);
		
//		v1 = byte;	//정수를 저장하는 변수에 논리값을 저장할수 없다.
//		by = num;	//1바이트 정수형 변수에 4바이트 정수값을 저장할수 없다.(범위초과)
//		num = db;	//4바이트 정수형 변수에 8바이트 실수값을 저장할수 없다.(소수점 이하 잘림)
		
		db = num; // 8바이트 실수형 변수에는 4바이트 정수를 저장할수 있다.
		num = by; // 4바이트 정수형 변수에는 1바이트 정수를 저장할수 있다.
//		by = v1;  // 1바이트 정수형 변수에는 1바이트 논리값을 저장할수 없다. (타입이 다르다)
		
		System.out.println();
		System.out.println("v1 : " + v1);
		System.out.println("by : " + by);
		System.out.println("num  : " + num);
		System.out.println("db : " + db);
	}

}
