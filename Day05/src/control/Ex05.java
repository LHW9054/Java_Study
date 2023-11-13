package control;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수입력 : (0 ~ 100) : ");
		score = sc.nextInt();
		
		if(score < 0 || 100 < score) {
			System.err.println("점수가 범위를 벗어났습니다.");
			sc.close();
			return;					// return : end of function
		}
		
		System.out.println("점수 : " + score);
		sc.close();
	}

}
