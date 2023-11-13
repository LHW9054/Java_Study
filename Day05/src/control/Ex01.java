package control;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 제어문
		// control statement
		// 코드의 흐름을 분기하거나, 일정 구간을 반복하여 코드의 흐름을 제어하는 구문
		
		// 1) 분기문 : 조건에 따라서 서로 다른 코드를 실행할수 있다.
		// 2) 반복문 : 조건에 따라서 일정 구간의 코드를 반복수행 할수 있다.
		// 3) 기타제어문 : 반복을 중단하거나, 함수를 중단할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		System.out.println("1) 고민시작");
		
		System.out.println("2) 과제를 내손으로 끝마친다?");
		
		System.out.println("선택] 1: yes 2 : no >>> ");
		
		select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("3-1) 오늘을 불태운다.");
		}
		
		if(select == 2) {
			System.out.println("3-2) 내일 베끼고 지금은 잔다.");
		}
		
		System.out.println("4) 고민해결 !! ");
		
		sc.close();
		// {...} 는 특정 클래스, 함수, 제어문 등의 범위를 나타내는 요소이다.
		
		// 조건절		: 조건을 포함하는 부분, 절은 문장의 일부이므로, 문장이 끝난게 아니다.
		//				조건절에는 특수한 겨우를 제외하고 ;을 붙이지 않는다.
		
		// 종속문장 	: 조건이 true이면 실행할 내용을 작성하는 영역
		//			: 	종속문장은 한 줄일 수도 있고, 여러줄일 수도 있다.
		//				종속문장이 한 줄이라면 {} 를 생략할수 있으나, 권장하지 않는다.
		
		
	}
}
