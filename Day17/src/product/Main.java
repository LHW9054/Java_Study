// 생성,목록,정렬,추가,삭제 기능
package product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 생성
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		
		//필드클래스변수 
		Product tmp = null;		// Product클래스로 값을 받을 변수 
		Product[] arr = null;	// Product클래스 값의 배열 
		
		int menu;				// switch문에서 case를 정할때 쓰는 정수값을 받아오는 변수 
		String name;			// handler 클래스에 넣을 문자열 변수 
		int row;				// switch문에서 실행이 됬는지 안됬는지 확인할때 쓰는 변수 
		
		// 더미 데이터 추가 코드
//		handler.insert(new Food("월드콘", 2000, "2023-12-08"));
//		handler.insert(new Food("콘칩", 1500, "2024-01-08"));
//		handler.insert(new Food("월드콘", 2000, "2023-12-28"));
//		handler.insert(new IndustrialProduct("KF94 마스크 (검정)", 1500, "Korea"));
//		handler.insert(new IndustrialProduct("KF94 마스크 (흰색)", 1500, "Korea"));
//		handler.insert(new IndustrialProduct("에너자이저 건전지 AA x6", 4800, "China"));
		
		
		while(true) {								// false가 될때 까지 계속 실행 한다.
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());	// 정수로 변환해서 값을 받을 menu변
			
			switch(menu) {
			case 1:	// 전체 목록 (Handler에서 배열을 받아와서 반복문으로 출력)
				arr = handler.selectAll();	// handler클래스에 selectall메서드를 활용해서 arr값에 넣어
				// 요기서 arr변수는 product 클래스 배열이고 handler클래스의 selectall 메서드를 이용하여 PRODUCT의 모든 배열 값을 받은 변
				for(Product p : arr) {		// 항상된 for문을 활용해서 product클래스 의 배열을 반복한다.
				// (for문에서의 변수타입 변수이름 : 배열이름)
					if(p != null) {			// 만약 p의 값이 널값이 아니라	면 
						System.out.println(p);	//배열의 p를 출력한다.
					}
				}
				break;						// 모든 switch문 case뒤에는 break가 있어야 한다.   
				
			case 2:	// 추가	(입력받은 데이터를 객체화해서 Handler에게 전달)
				System.out.println("상품유형을 선택하세요");
				System.out.print("1. 식품 | 2. 공산품 : ");
				menu = Integer.parseInt(sc.nextLine());
				if(menu == 1) 		tmp = makeFood(sc);
				// 만약 menu변수에 값이 1이라면 tmp변수 값은 makefood메서드 값을 넣어라 sc문으로 받아
				else if(menu == 2)	tmp = makeIndustProduct(sc);
				else 				tmp = null;	// null이면 무조건 추가 실패
				row = handler.insert(tmp);
				// 핸들러클래스의 인서트 메서드를 활용한다 인서트 메서드에는 tmp를 넣고
				// 인서트 메서드 마지막에 로우값 1이 반환됐으므로 메인함수의 로우값은 1이 되었다.
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:	// 검색	(입력받은 검색어를 전달하여 조건(포함)에 맞는 배열을 받아오기)
				System.out.print("검색어 (상품이름) 입력 : ");
				name = sc.nextLine();
				arr = handler.search(name);
				for(int i = 0; i < arr.length; i++) {
					Product p = arr[i];
					if(p != null) {
						System.out.println(p);
					}
				}
				break;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			case 4:	// 삭제	(입력받은 이름으로 일치하는 항목을 삭제하기)
				System.out.print("삭제할 상품의 이름 입력 : ");
				name = sc.nextLine();
				
				row = handler.delete(name);
				System.out.println("삭제된 개수 : " + row);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
				
				
				
				
				
				
			case 5:	// 정렬	(상품 이름 순으로 정렬하기)
				System.out.print("정렬 기준 선택 (1 ~ 4) : ");
				menu = Integer.parseInt(sc.nextLine());
				
				arr = handler.sort(menu - 1);
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
						System.out.println(arr[i]);
					}
				}
				break;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			case 0:	// 종료
				sc.close();
				System.out.println("프로그램 종료");
				return;	// main 함수 종료 메인 함수클래스의 리턴
				
			default:
				System.err.println("메뉴를 잘못 선택했습니다");
			}// switch 
			System.out.println();
		}	// while
	}

	private static Product makeIndustProduct(Scanner sc) {
		String name;
		int price;
		String madeIn;
		
		System.out.print("상품 이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.println("제조국가 입력 : ");
		madeIn = sc.nextLine();
		
		IndustrialProduct p = new IndustrialProduct(name, price, madeIn);
		return p;
	}

	private static Product makeFood(Scanner sc) {
		String name;
		int price;
		String expireDate;
		
		System.out.print("상품 이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.println("유통기한 입력 (yyyy-MM-dd) : ");
		expireDate = sc.nextLine();
		
		Food food = new Food(name, price, expireDate);
		return food;
	}
}










