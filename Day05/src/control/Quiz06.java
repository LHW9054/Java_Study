package control;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
////////내가한거///////////////////////////////////////////////////////////////////////////

		/*
		 * 놀이기구 이용시간에 따른 요금을 계산하여 출력하세요
		 * 
		 * 기본요금은 3천원이며 10분당 500원의 요금이 추가로 발생합니다.
		 * 기본요금이 적용되는 구간은 0 ~ 30분 입니다
		 * 
		 * 	시간			금액
		 * 	0 ~ 30		3,000원
		 * 31 ~ 40		3,500원
		 * 41 ~ 50		4,000원
		 * 51 ~ 60		4,500원
		 * ...
		 * 이후 시간대에도 동일한 규칙으로 적용 되어야 합니다.
		*/
		
//		int time;
//		int price = 3000;
//		int plusprice = 500;
//		int totalprice = 0;
//		int a;
//		
//		System.out.println("이용시간 : ");
//		time = sc.nextInt();
//		
//		
//		if(time <= 30) {
//			totalprice = price;
//		}else {
//			int a = time / 10;
//			totalprice = price + (plusprice*a);
//		}
//		
//		System.out.println("총금액은 : " + totalprice);
		
				
/////////////////////////////////////////////////////////////////////////////////////////
		
////////강사님꺼///////////////////////////////////////////////////////////////////////////
		
		// 시간에 따른 요금을 구하는 코드
		// int cost = getcost(int time) {...}
		//		y	=	f(x)
		
		int time; // 시간
		int cost; // 요금
		
		System.out.print("이용 시간 입력 : ");
		time = sc.nextInt();
		
		if(0 <= time && time <= 30) {	//기본 시간 이하로 이용했다면
			cost = 3000;				//기본 요금 3천원 적용
		}else {
			if(time % 10 == 0) {
				cost = 3000 + (500 * (((time - 30) / 10) + 0));
			}else {
				cost = 3000 + (500 * (((time - 30) / 10) + 1));
			}
		}
		
		System.out.printf("요금 : %,d원\n", cost);
		
		

//////////////////////////////////////////////////////////////////////////////
		sc.close();
	}
}
