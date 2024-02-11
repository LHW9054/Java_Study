package nestedLoop;

public class Ex01 {
	public static void main(String[] args) {
		
		int num = 1;
		
		for(int i = 0; i < 3; i++) {		// 줄 수 (세로)
			for(int j = 0; j < 4; j++) {	// 칸 수 (가로)
				System.out.printf("%2d ", num++);
			}
			System.out.println();
		}
		System.out.println();
		
		// 상단의 이중 for문과 똑같은 결과를 단일 for문으로 출력해보기
		num = 1;
		
		for(int i = 0; i < 12; i++) {
			if(i != 0 && i % 4 == 0) {
				System.out.println();
			}
			System.out.printf("%2d ", num++);
		}
	}
}
