package control;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사탕 1개에 500원 입니다.
		// 50개 이상 구매하면 전체의 8%를 할인하고
		// 100개 이상 구매하면 전체의 12%를 할인합니다.
		
		// 구매수량을 입력하여 결제할 금액을 계산하여 출력하세요
		// (단, 각각의 할인율은 중복해서 적용할수 없습니다.)
		
		// System.out.printf("결제금액  : %,d원\n" , 12000); (1000단위 콤마 가능)
		
////////내가한거////////////////////////////////////////////////////////////////////////////
//		int candy;
//		int price;
//		int sum = 0;
//		
//		
//		System.out.print("사탕 개수 : ");
//		candy = sc.nextInt();
//		
//		price = candy * 500;
//		
//		int percent8 = (price/100) * 8;
//		int percent12 = (price/100) * 12;
//		
//		if(candy >= 50) {
//			sum = price - percent8;
//		}else {
//			sum = price;
//		}
//		
//		if(candy >= 100) {
//			sum = price - percent12;
//		}
//		System.out.printf("가격은 %,d원 입니다.", sum);
/////////////////////////////////////////////////////////////////////////////////////////
		
////////강사님꺼///////////////////////////////////////////////////////////////////////////
		
		//여러조건이 있을 경우 우선순위를 생각하면서 코드를 작성해야 한다.
		
		int count;
		int price;
		double salepercent;
		
		System.out.println("구매 개수 입력 : ");
		count = sc.nextInt();
		
		if(count > 100) {
			salepercent = 0.12;
		}else if(count >=50) {
			salepercent = 0.08;
		}else {
			salepercent = 0;
		}
		
		price = count * 500;
		price -= price * salepercent;
		System.out.printf("결제금액 : %,d\n",price);
		
		
/////////////////////////////////////////////////////////////////////////////////////////
		sc.close();
	}

}
