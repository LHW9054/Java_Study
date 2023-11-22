package student;

import java.util.Scanner;

// 사용자의 입력을 받아서 목록/추가/삭제/검색 기능을 수행한다.

public class Main {
	public static void main(String[] args) {
/////내가//////////////////////////////////////////////////////////////
//		Student st = new Student("이지은", 100, 99, 87);
//		st.show();
//////////////////////////////////////////////////////////////////////
		
///////강사님/////////////////////////////////////////////////////////////
//		Student st = new Student("이지은", 100, 99, 87);
//		st.show();
////////////////////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();			// 키보드 입력
													// 데이터 관리 및 기능 수행
		int menu;									// 사용자가 입력한 메뉴번호
		Student tmp = null;							// 관리에 필요한 학생 임시 변수
		String keyword;								// 검색
		String name;			// 생성시 필요한 이름
		int kor, eng, mat;		// 생성시 필요한 과목점수
		Student[] arr = null;	// 검색 및 전체 목록을 받을 배열 변수
		int row;				// 추가 및 삭제의 결과를 받기 위한 변수
		
		
		while(true) {
			System.out.println("1. 전체목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.println("선택>>>");
			menu = Integer.parseInt(sc.nextLine());
//			menu = sc.nextInt();
			
			
			switch(menu) {
			case 1: // 전체목록
				arr = handler.getArray();
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						arr[i].show();
					}
				}
				break;	// break switch
				
			case 2:		// 추가
				System.out.println("이름 입력 : ");
				name = sc.nextLine();
				
				System.out.print("국어 점수 입력 : ");
				kor = Integer.parseInt(sc.nextLine());
				
				System.out.print("영어 점수 입력 : ");
				eng = Integer.parseInt(sc.nextLine());
				
				System.out.print("수학 점수 입력 : ");
				mat = Integer.parseInt(sc.nextLine());
				
				tmp = new Student(name, kor, eng, mat);
				row = handler.add(tmp);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:	// 검색
				System.out.print("이름으로 검색 : ");
				keyword = sc.nextLine();
				
				arr = handler.search(keyword);
				for(int i = 0; i < arr.length; i++) {
					arr[i].show();
				}
				break;
				
			case 4:
				System.out.println("이름으로 삭제 : ");
				name = sc.nextLine();
				
				row = handler.delete(name);
				System.out.println(row != 0 ? "삭제성공!" : "삭제실패!");
				break;
				
			case 0:
				System.out.println("프로그램 종료");
				sc.close();
				return;
			}	//end of switch
			System.out.println();
		}	// end of while
	}	// end of main
}	// end of class
