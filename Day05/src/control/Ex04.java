package control;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수입력 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " : 2의 배수");
		}
		if(num % 3 == 0) {
			System.out.println(num + " : 3의 배수");			
		}
		sc.close();
		
	}

}
