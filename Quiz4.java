package input;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일을 8자리 정수로 입력 받아서
		// 올해연도를 이용하여 나이를 계산하여 출력하기
		// 출생 : YYYY-MM-DD
		// 나이 : X살
		
		int currentYear = 2023;	//리터럴
		int birthYear;			//입력
		int month;				//입력
		int date;				//입력
		int age;				//계산
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출생년도를 8자리로 입력 :");
		birthYear = sc.nextInt();
		
		date = birthYear % 100;
		birthYear /= 100;
		month = birthYear % 100;
		birthYear /= 100;
		
//		System.out.println("생일이 몇월 인가요  :");
//		month = sc.nextInt();
//		
//		System.out.println("생일이 몇일 인가요 :");
//		date = sc.nextInt();
		
		age = currentYear - birthYear + 1;
		
		System.out.printf("출생 : %4d-%02d-%02d\n", birthYear, month, date);
		System.out.printf("나이 : %d\n", age);
		
		
		sc.close();
		
	}
}
