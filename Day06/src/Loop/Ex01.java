package Loop;

public class Ex01 {
	// 반복문 : 조건에 따라 종속문장을 반복하여 실행한다.
	public static void main(String[] args) {
		int num = 10;
		
		if(num < 20) {		// 조건이 참이면, 종속문장을 한번만 실행한다.
			num += 1;
			System.out.println("if) num : " + num);
		}
		
		System.out.println();
		
		while(num < 20) {	// 조건이 참이면, 종속문장을 실행하고
			num += 1;
			System.out.println("while) num : " + num);
		}					// 다시 조건절로 돌아간서 조건을 체크한다.
	
		
		// 조건을 잘못 지정하면 무한반복이 발생할수 있다.
		while(num != 0) {
			num += 1;
			System.out.println("infinite loop ) num :" + num);
			
			if (num == 10000) {
				break;	//break는 if를 제외한 {} 블럭을 아래로 탈출한다.
			}
		}
		System.out.println(" 프로그램 종료 !!");
		
	}

}
