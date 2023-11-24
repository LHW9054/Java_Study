package inheritance;

import java.util.Scanner;

public class Ex06_Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Ex06_MessageBox box1 = new Ex06_MessageBox(sc);
		box1.input();
		String s1 = box1.getMessage();
		System.out.println("s1 : " + s1);
		System.out.println();
		
		Ex06_TimeMessageBox box2 = new Ex06_TimeMessageBox(sc);
		box2.input();
		String s2 = box2.getMessage();
		System.out.println("s2 : " + s2);
		System.out.println();
		
		Ex06_MessageBox test = box2;
		test.input();
		String s3 = test.getMessage();
		System.out.println("s3 : " + s3);
		System.out.println();
		
		sc.close();
	}
}
