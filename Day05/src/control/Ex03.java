package control;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		// if ~else if ~ else : 여러 선택지중 하나를 선택햐야 할 경우
		
		System.out.println("정수입력 : ");
		num = sc.nextInt();
		
		if(num>0) {
			System.out.println("1) 양의 정수");
		}
		else if(num < 0) {
			System.out.println("2) 음의정수");
		}
		else {
			System.out.println("3) ZERO");
		}
		
	
		sc.close();
	}
}
