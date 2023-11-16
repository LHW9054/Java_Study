package Function;

public class Ex05 {
	public static void main(String[] args) {
		// 메인함수에서 실행되는 코드를 함수로 만들어 보기
		// 1) 정수를 거꾸로 배치하여 반환하는 함수
		
		int tmp = 0;
		
		System.out.println("tmp : " + tmp);	//결과
		
		System.out.println("reverse : " + reverse(13579));
}
	
	static int reverse(int n1) {	// 요인이 되는 값은 인자, 매개 변수로 선언
		int num = 12345;
		int tmp = 0;				// 코드 작성 내용은 사실상 메인함수와 동일하다.
		while(num != 0) {			// 여기선 복붙으로 처리했음
			tmp *= 10;
			tmp += num % 10;
			num /= 10;
		}
		return tmp;				// 함수가 끝날때 결과값을 return 하면 된다.
	}
	
}
