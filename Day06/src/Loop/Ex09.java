package Loop;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 사용자에게 0을 입력받을  때까지 정수를 반복하여 입력받고 그 합계를 출력하기
		Scanner sc = new Scanner(System.in);
		
		int input;
		int total = 0;
		
		do {
			System.out.println("정수입력 : ");
			input = sc.nextInt();
			total += input;
		}while(input!=0);	//이후 조건을 체크하여 반복여부를 결정한다.
		
		System.out.println("합계 : " + total);
		sc.close();
	}
}
