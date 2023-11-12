package Operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		//Ex04의 Scanner 형식을 참조하여 다음조건을 만족하는 코드를 작성하세요
		//정수를 하나 입력받아서, 홀수 짝수를 문자열로 출력하는 코드를 작성하세요
		// 단, 0은 짝수로  취급합니다.
		Scanner sc = new Scanner(System.in);
		
		//내가 한거
		int n1;
		
		System.out.println("정수를 입력 하세요 : ");
		n1 = sc.nextInt();
		System.out.println(n1 % 2 == 0 ? "짝수" : "홀수");
		
		sc.close();
		
		//강사님이 한거
//		int num;
//		System.out.println("정수 하나 입력 : ");
//		num = Integer.parseInt(sc.nextLine());
//		
//		String result = num % 2 == 0 ? "짝수" : "홀수";
//		System.out.println(num + " : " + result);
//		
//		sc.close();
		
	}
}
