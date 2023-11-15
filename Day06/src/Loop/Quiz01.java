package Loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//	정수를 하나 입력받아서, 1부터 입력받은 정수까지 한줄에 출력하는 코드를 작성하세요
////////내가한거//////////////////////////////////////////////////////////////////////
//		int num; 
//		int user;
//		
//		System.out.print("정수를 입력 하세요");
//		user =sc.nextInt();
//		
//		for(num = 1; user>=num; num++) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//		sc.close();
//		System.out.println("프로그램 종료");
////////////////////////////////////////////////////////////////////////////////////
		
		
////////강사님//////////////////////////////////////////////////////////////////////

		int num;
		int cnt = 1;
		
		System.out.print("정수입력 : ");
		num =sc.nextInt();
		
		while(cnt<=num) {
			System.out.print(cnt + " ");
			cnt += 1;
		}
		System.out.println();
		
		sc.close();
		System.out.println("프로그램 종료");
		
////////////////////////////////////////////////////////////////////////////////////
		
	}
}
