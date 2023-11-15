package Loop;
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 은행에 돈을 입금한다.
		 * 첫날에는 10원, 둘째날에는 20원, 셋째날에는 40원
		 * 이런식으로 전날의 두배의 준비하여 30일 동안 입금한다.
		 * 입금이 끝나면 은행에 예근된 총 금액은 얼마인지 계산하여 출력하세요
		 * 출력할때 printf()의 서식을 활용하여 천단위 구분 콤마를 찍어 주세요
		 */
////////내가한거///////////////////////////////////////////////////////////
//		int money = 0;
//		int eza = 10;
//		int day =1;
//		long sum = 0;
//		
//		System.out.print("입금할 금액 : ");
//		money = 500;
//		
//		for(day=1; day>=30; day++) {
//			eza *= 2;
//			day++;
//		}
//		
//		sum = money + eza;
//		System.out.printf("총 금액 : %,d 입니다.", sum);
/////////////////////////////////////////////////////////////////////////

		
		
////////강사님////////////////////////////////////////////////////////////
		int day = 1;		// 날짜
		long bank = 0;		// 은행 계좌 금액
		long money = 10;	// 입금 금액
		
		while(day <= 30) {
			bank+=money;
		  //System.out.printf("%2d일 금액 : %,d원\n", day, bank);
			money *= 2;
			day++;
		}
		
		System.out.printf("%2d일 금액 : %,d원\n", day, bank);
/////////////////////////////////////////////////////////////////////////
		sc.close();
	}
}
