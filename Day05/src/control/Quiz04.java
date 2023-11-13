package control;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 서로 다른 세정수를 입력받아서 가장 큰 수를 출력하세요
		// 만약 같으면 아무수나 출력해도 됩니다.
		
////////내가한거//////////////////////////////////////////////////////////////////////////
//		
//		int n1, n2, n3, max;
//		
//		System.out.println("n1 : ");
//		n1 = sc.nextInt();
//		
//		System.out.println("n2 : ");
//		n2 = sc.nextInt();
//		
//		System.out.println("n3 : ");
//		n3 = sc.nextInt();
//		
//		System.out.println("n1 : " + n1 + "n2 : " + n2 + "n3 : " + n3);
//		
//		if(n1 > n2) {
//			max = n1;
//		}else if(n1 > n3) {
//			max = n2;
//		}else {
//			max = n3;
//		}		
//		System.out.println(max);
/////////////////////////////////////////////////////////////////////////////////////////
		
////////강사님꺼///////////////////////////////////////////////////////////////////////////
//		
//		int n1,n2,n3,max;
//		
//		System.out.println("세 정수를 띄어쓰기로 구분하여 입력 : ");
//		n1 = sc.nextInt();
//		n2 = sc.nextInt();
//		n3 = sc.nextInt();
//		
//		System.out.printf("%d, %d, %d\n",n1,n2,n3);
//		
//		max = n1;			// n1 이 가장 크다고 가정한다.
//		
//		if(max < n2) {		// 만약, n2가 더 크면
//			max = n2;		// n2의 값을 최대값으로 지정한다.
//		}
//		if(max < n3) {		// 만약, n3가 더 크면(이전 if의 실행여부와 상관없이 무조건 체크한다.)
//			max = n3;		// n3의 값을 최대값으로 지정한다.
//		}
//		System.out.println("최대값 : " + max);
/////////////////////////////////////////////////////////////////////////////////////////
		sc.close();
		
		
		
	}

}
