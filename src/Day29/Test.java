package Day29;

public class Test {
	public static void main(String[] args) {
		
		//오버라이드 
		int a = 2147483647;
		System.out.println("a의 값은 = " + (a + 1));
		
		//타입간의 변환방법
		int b;
		char c;
		String string = "3";
		
		System.out.println(string.charAt(0));
		
		System.out.println('A' + 'B');
		
//		문자열과 덧셈연산을 하면 그 결과는 항상 문자열이 된다
//		하지만 문자열 + 문자열의 값은 int형이 된다 왜냐하면
//		int형 보다 작은 타입은 int형으로 변환된후에 덧셈연산이 되기 때문이
		
		System.out.println((-3-5));
		
	}
}
