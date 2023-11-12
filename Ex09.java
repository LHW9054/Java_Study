package input;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		//JAVA 1.5부터 등장하기 시작했다.
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력받기
		int num;
		System.out.println("정수 입력 : ");
		num = sc.nextInt();		// 숫자, \r,\n
		sc.nextLine();
		
		// 실수 입력받기
		double db;
		System.out.print("실수 입력 : ");
		db = sc.nextDouble();	// 숫자, \r,\n
		sc.nextLine();
		
		//문자열 입력받기
		String str;
		System.out.print("문자열 입력 : ");
		str = sc.next();		// 입력데이터의 기본처리 자료형은 문자열이다!!!
		str = sc.nextLine(); 	// 줄단위, 엔터키를 입력할때까지의 내용을 가져온다.
		//버퍼가 정리되지 않았다면 정상적으로 처리할수 없다.
		
		System.out.println("num : " + num);
		System.out.println("db : " + db);
		System.out.println("str : " + str);
		
		sc.close();	// 다 사용한 통로는 반드시 닫아주기!!!
	}
}
