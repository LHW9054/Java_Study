package control;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		System.out.println("입력 : ");
		select = sc.nextInt();
		
		if(select ==1)				System.out.println("One");
		else if(select ==2)			System.out.println("Two");
		else if(select ==3)			System.out.println("Three");
		else						System.out.println("Others");
		
		switch(select) {
			case 1:		System.out.println("하나");	break;
			case 2:		System.out.println("둘");	break;
			case 3:		System.out.println("셋");	break;
			default : 	System.out.println("다른거");	break;
		}
		
	}
}
