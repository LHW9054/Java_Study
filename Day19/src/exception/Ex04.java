package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

class ScoreOutofBoundsException extends Exception{
	// Exception 클래스를 상속받은 새로운 클래스
	// 예외가 가져야할 모든 항목들을 상속받아서 가지고 있게 된다.
	
	private static final long serialVersionUID = 1L;
	int value;
	
	public ScoreOutofBoundsException(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "점수가 범위를 벗어났습니다 -> " + value;
	}
	
	@Override
	public String getMessage() {
		return this.getClass().toGenericString();
	}
	
}


public class Ex04 {
	public static void main(String[] args) {
		
		// 예외 클래스 만들기
		
		Scanner sc = new Scanner(System.in);
		
		String result;
		int score;
		
		try {
			System.out.print("정수 입력 (0~100) : ");
			score = sc.nextInt();
			
			if(score <0 || 100 <score) {
				ScoreOutofBoundsException e = new ScoreOutofBoundsException(score);
				throw e;
						
			}
			
			
		}catch(InputMismatchException e) {
			System.out.println("잘못된 형식의 값을 입력했습니다. : " + e);;
			score = 0;
		}catch(ScoreOutofBoundsException e){
			
			try {Thread.sleep(200);} catch(Exception e2) {}
			
			System.err.println(e.getMessage());
			System.err.println(e);
			score = 0;
			
		} finally {
			sc.close();
		}
		
		result = score >= 60 ? "합격" : "불합격";
		
		System.out.printf("점수 : %d, 결과 : %s\n", score, result);
		
	}
}
