package string;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		
		// 자바의 문자열은 단순 값만 저장하지 않고, 부가적인 기능(함수)이 포함되어 있다
////////<사용된 기능(함수)>//////////////////////////////////////////////////////		
		
		// indexOf
		// 문자열을 배열로 가정했을 경우, 지정한 index에 있는 글자 하나를 char형으로 반환
		
		// s.compareTo(String anotherString)
		// 문자열을 다른 문자열과 비교하여 대소관계를 정수로 반환한다
		
		// compareTo를 활용한 정렬 코드
		
		// A.concat(B)
		// A뒤에 B내용을 더한 새로운 문자열을 반환한다
		
		// A.startsWith(B) : A문자열이 B내용으로 시작하면 true
		// A.endsWith(B) : A문자열이 B내용으로 끝나면 true
		// A.contains(B) : A문자열이 B내용을 포함하면 true
		// A.equals(B)	: A문자열이 B내용과 일치하면 true
		
//////////////////////////////////////////////////////////////////////////////		
		
		int n1 = "Hello".indexOf('e');
		int n2 = "Hello".indexOf('o');
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		// 일반 문자열에서 호출하여 실행할 수 있는 함수의 종류
		// 문자열 클래스 (String)에서 호출하여 실행할 수 있는 함수의 종류
		
		String s1 = "Hello, world !!";
		// char charAt(int index) 
		// 문자열을 배열로 가정했을 경우, 지정한 index에 있는 글자 하나를 char형으로 반환
		
		char ch1 = s1.charAt(0);
		char ch2 = s1.charAt(1);
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println();
		
		// s.compareTo(String anotherString)
		// 문자열을 다른 문자열과 비교하여 대소관계를 정수로 반환한다
		
		// String s1 = "Hello, world !!";
		// [72, 101, 108, 108, 111]
		char[] arr1 = { 72, 101, 108, 108, 111 };
		char[] arr2 = { 104, 101, 108, 108, 111 };
		char[] arr3 = { 72, 69, 76, 76, 79 };
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		int c1 = s1.compareTo("hello, world !!");
		int c2 = s1.compareTo("HELLO");
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println();
		
		String s2 = "banana";
		String s3 = "apple";
		
		if(s2.compareTo(s3) > 0) {
			String tmp = s2;
			s2 = s3;
			s3 = tmp;
		}
		
		System.out.printf("s2 : %s, s3 : %s\n", s2, s3);
		
		// compareTo를 활용한 정렬 코드
		String[] arr4 = { "banana", "candy", "apple" };

		System.out.println(Arrays.toString(arr4));
		Arrays.sort(arr4, null);	// sort를 하기 위해서는 두 수의 대소관계 비교가 필요하다
									// 문자열끼리 비교할때는 compareTo 함수를 이용하면 된다
		System.out.println(Arrays.toString(arr4));
		System.out.println();
		
		// A.concat(B)
		// A뒤에 B내용을 더한 새로운 문자열을 반환한다
		
		String s4 = "to".concat("get").concat("her");
		String s5 = "to" + "get" + "her";
		System.out.println("s4 : " + s4);
		System.out.println("s5 : " + s5);
		
		// A.startsWith(B) : A문자열이 B내용으로 시작하면 true
		// A.endsWith(B) : A문자열이 B내용으로 끝나면 true
		// A.contains(B) : A문자열이 B내용을 포함하면 true
		// A.equals(B)	: A문자열이 B내용과 일치하면 true
		
		boolean b1 = "Hello".startsWith("He");	// 전화번호는 010- 으로 시작해야 한다
		boolean b2 = "Hello".endsWith("lo");	// 파일이름이 .jpg 인지 확인한다
		boolean b3 = "Hello".contains("Hell");	// 이름에 '호' 를 포함하는 모든 결과 조회
		boolean b4 = "Hello".equals("hello");	// 이름이 일치하는 상품 검색
		boolean b5 = "Hello".equalsIgnoreCase("hello");	// 명령어 대소문자 구분없이 실행
		
		System.out.println("Hello.startsWith(He) : " + b1);
		System.out.println("Hello.endsWith(lo) : " + b2);
		System.out.println("Hello.contains(Hell) : " + b3);
		System.out.println("Hello.equals(hello) : " + b4);
		System.out.println("Hello.equalsIgnoreCase(hello) : " + b5);
		
		
	}
}
