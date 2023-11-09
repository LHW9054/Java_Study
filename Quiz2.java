////내가한거
//package operator;
//
//import java.util.Scanner;
//
//public class Quiz2 {
//	public static void main(String[] args) {
//		
//		long cardNumber;
//		Scanner sc = new Scanner(System.in);
//		String answer;
//		
//		System.out.println("카드번호 16자리를 입력 : ");
//		cardNumber = Long.parseLong(sc.nextLine());
//		
//		System.out.println("cardNumber : " + cardNumber);
//		// 위 숫자를 4자리씩 분리하여 사이에 "-"를 더하여다시 출력하세요
//
//		long a = cardNumber % 10000;
//		long b = cardNumber / 10000;
////		System.out.println(a);
//		
//		long c = b % 10000;
//		long d = b / 10000;
////		System.out.println(c);
//		
//		long e = d % 10000;
//		long f = d / 10000;
////		System.out.println(e);
//		
//		long g = f % 10000;
//		long h = f / 10000;
////		System.out.println(g);
//		
//		answer = g +"-"+e+"-"+c+"-"+a; 
//		
//		System.out.println("answer : " + answer);
//		
//		sc.close();
//	}
//}

////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////

// 강사님
package operator;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		long cardNumber;
		Scanner sc = new Scanner(System.in);
		String answer;
		
		System.out.println("카드번호 16자리를 입력 : ");
		cardNumber = Long.parseLong(sc.nextLine());
		
		System.out.println("cardNumber : " + cardNumber);
		// 위 숫자를 4자리씩 분리하여 사이에 "-"를 더하여다시 출력하세요
		
		long n1, n2, n3, n4;
		n4 = cardNumber % 10000;
		cardNumber = cardNumber / 10000;
		n3 = cardNumber % 10000;
		cardNumber = cardNumber / 10000;
		n2 = cardNumber % 10000;
		n1 = cardNumber / 10000;
		answer = n1 +"-"+n2+"-"+n3+"-"+n4;
		
		System.out.println("answer : " + answer);
		sc.close();
	}
}
