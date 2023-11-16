package Array;

public class Ex09 {
	public static void main(String[] args) {
		// 배열은 reference type이고, 그냥 출력하면 내부 데이터가 출력되지 않는다.
		int[] t1 = {};
		System.out.println("t1 : " + t1);
		
		// 배열은 값을 지정하여 생성하거나, 길이를 지정하여 생성할수 있다.
		int[] t2 = { 10, 30, 20, 40, 50};
		int[] t3 = new int[5];	// 길이 5짜리 빈 배열
		int[] t4 = new int[] { 2, 7, 8, 4, 6};
//		int[] t5 = new int[5] { 2, 7, 8, 4, 6};	//둘중 하나만 지정해야 한다.
		// 배열을 생성할때 값을 지정하거나 혹은(!) 길이를 지정해야 하고 둘다 하면 안된다.
		
//		String s1 = "Hello";
//		String s2 = new String("Hello");
		
		// 길이를 지정하여 생성하면, 값은 자료형에 따라 0에 맞는 값으로 초기화 된다.
		for(int i = 0; i < t2.length; i++) {
			System.out.print(t2[i] + " ");
		}
		System.out.println();
		
		for(int num : t3) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		// 자바의 참조변수 특성 때문에 다른 배열을 가르킬수 있다.
		// 배열의 길이는 변할수 없으나, 변수가 다른 배열을 가르키면서 길이가 바뀐것처럼 보일수 있다.
		
		int[] t6 = {1,2,3};
//		t6[3] = 4;	// 실행하면 예외 발생, 배열의 길이를 증가시킬수 없다.
		
		System.out.print(t6 + " : ");
		for(int num : t6)System.out.print(num + " ");
		System.out.println();
		
		t6 = new int[]{ 1, 2, 3, 4};
		System.out.print(t6 + " : ");
		for(int num : t6)System.out.print(num + " ");
		System.out.println();
		
		// <0값>
		// boolean : false
		// int : 0
		// double : 0.0
		// String : null
		
	}

}
