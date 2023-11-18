package string;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
/////////<사용된 기능(함수)>//////////////////////////////////////////////////////		
		
		// substring : 문자열 빼기
		
		// split : 특정 글자를 기준으로 분리하여 배열로 만들어서 반환
		
		// replace : 특정 글자 혹은 패턴을 다른 내용으로 변경한 새로운 문자열을 반환
		
		// indexOf : 특정 글자나 패턴의 시작 위치를 정수로 반환
		// substring과 연계하여 사용하는 경우가 있다
		
		// toLowerCase, toUpperCase
		// 모든 글자를 대문자 혹은 소문자로 변경한다
		
		// length() : 문자열의 글자수를 정수로 반환한다
		
////////////////////////////////////////////////////////////////////////////		
		
		// substring : 문자열 빼기
		
		//				   012345678
		String fileName = "Home.java";
		
		String s1 = fileName.substring(5);		// 5부터 끝까지 잘라내기
		String s2 = fileName.substring(0, 4);	// 0부터 4까지 잘라내기
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		// split : 특정 글자를 기준으로 분리하여 배열로 만들어서 반환
		
		String url = "www.naver.com";
		String[] arr = url.split("\\.");	// . 은 특수기호라서 기능을 제거하기 위해 \\ 를 붙임
		System.out.println(Arrays.toString(arr));
		
		// replace : 특정 글자 혹은 패턴을 다른 내용으로 변경한 새로운 문자열을 반환
		//			 123456789
		String s3 = "life is too short";
		String s4 = s3.replace("o", "O");
		
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
		// indexOf : 특정 글자나 패턴의 시작 위치를 정수로 반환
		// substring과 연계하여 사용하는 경우가 있다
		
		int index = s3.indexOf("oo");
		System.out.println("index : " + index);
		
		String s5 = s3.substring(index);	// index부터 끝까지
		String s6 = s3.substring(0, index);	// 0부터 index까지
		System.out.println("s5 : " + s5);
		System.out.println("s6 : " + s6);
		System.out.println();
		
		// toLowerCase, toUpperCase
		// 모든 글자를 대문자 혹은 소문자로 변경한다
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println("s7 : " + s7);
		System.out.println("s8 : " + s8);
		System.out.println();
		
		// length() : 문자열의 글자수를 정수로 반환한다
		System.out.println(s3.length());
		
		String s9 = Arrays.toString(arr);	// 배열을 문자열 형태로 변환하여 저장
		System.out.println(s9);
		
		s9 = s9.substring(0, s9.length() - 1);	// 마지막 한 글자 빼고 남김
		s9 = s9.substring(1);					// 첫번째 한 글자 빼고 남김
		System.out.println(s9);
		
		
	}
}
