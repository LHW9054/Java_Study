package exception;

import java.util.Scanner;

// NumberFormatException

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		String str = null;
		
		try {
			System.out.print("정수1 입력 : ");
			str = sc.nextLine();
			n1 = Integer.parseInt(str);
			
			System.out.print("정수2 입력 : ");
			str = sc.nextLine();
			n2 = Integer.parseInt(str);
			
		} catch(NumberFormatException e) {
			System.out.println("정수 형식에 맞지 않는 값을 입력했습니다 : " + e);
			return;
			
		} catch(Exception e) {
			System.out.println("기타 예외 발생 : " + e);
			// 클래스의 상속구조에 따라 슈퍼클래스가 아래쪽으로 배치되어야 한다
			
		} finally {
			System.out.println("프로그램 종료");
			sc.close();
		}
		
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}
}
