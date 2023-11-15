package Loop;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	// 횟수가 일정하지 않거나, 횟수를 가늠하기 어려운 반복
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();		
		
		int num = ran.nextInt(6) + 1;
		int answer;
		int cnt = 0;
		
		System.out.println("1에서 6사이 랜덤값을 맞춰보세요");
		answer = sc.nextInt();
		
		while(answer != num) {	// while : ~ 하는동안2
			System.out.println("틀렸습니다. 다시시도 : ");
			answer = sc.nextInt();
			cnt++;
		}
		
		System.out.println(cnt + "번 만에 정답을 맞췄습니다.");
		sc.close();
	}

}
