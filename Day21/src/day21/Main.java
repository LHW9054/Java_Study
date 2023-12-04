package day21;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Handler handler = new Handler();
		handler.load();	// 특정 파일이름의 데이터를 리스트에 불러오기
		
		List<PhoneBookInfo> list = null;
		
		String name, pnum;
		int menu = -1, age, row;
		
		while(menu != 0) {
			System.out.println("1. 전체 목록 출력");
			System.out.println("2. 데이터 추가");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				list = handler.select();
				list.forEach(ob -> System.out.println(ob));
				break;
				
			case 2:
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				
				System.out.print("나이 입력 : ");
				age = Integer.parseInt(sc.nextLine());
				
				System.out.print("전화번호 입력 : ");
				pnum = sc.nextLine();
				
				row = handler.insert(new PhoneBookInfo(name, age, pnum));
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
			}
			
			System.out.println();
		}
		
		handler.save();
		sc.close();
	}
}
