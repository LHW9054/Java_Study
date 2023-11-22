package book;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, author, publishDate, keyword;
		double score;
		int price;
		int menu;
		int row;
		Book tmp;
		Book[] arr;
		Handler handler = new Handler();
		
		handler.add(new Book("세이노의 가르침", "세이노", "2023-03-02", 9.4, 7200));
		handler.add(new Book("설민석의 한국사 대모험 25", "설민석", "2023-05-29", 10.0, 11700));
		handler.add(new Book("역행자 확장판", "자청", "2023-05-29", 9.4, 17550));
		
		while(true) {
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				arr = handler.selectList();
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						arr[i].show();
					}
				}
				break;
				
			case 2:
				System.out.print("도서 이름 입력 : ");
				name = sc.nextLine();
				System.out.print("저자 이름 입력 : ");
				author = sc.nextLine();
				System.out.print("출판 일자 입력 : ");
				publishDate = sc.nextLine();
				System.out.print("가격 입력 : ");
				price = Integer.parseInt(sc.nextLine());
				System.out.print("평점 입력 : ");
				score = Double.parseDouble(sc.nextLine());
				tmp = new Book(name, author, publishDate, score, price);
				row = handler.add(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:
				System.out.print("검색어 입력 : ");
				keyword = sc.nextLine();
				arr = handler.searchList(keyword);
				
										// 향상된 for문
				for(Book book : arr) {	// index를 사용하지 않고, arr의 모든 요소에 순차적으로 접근
					book.show();
				}
				
//				for(int i = 0; i < arr.length; i++) {
//					Book book = arr[i];
//					book.show();
//				}
				
				break;
				
			case 4:
				System.out.print("삭제할 도서의 이름 입력 : ");
				name = sc.nextLine();
				
				row = handler.delete(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 0:
				sc.close();
				System.out.println("프로그램 종료");
				return;
			}
			System.out.println();
		}
		
		
	}
}
