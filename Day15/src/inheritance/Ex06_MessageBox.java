package inheritance;

import java.util.Scanner;

public class Ex06_MessageBox {	// 입력기를 전달하여 객체를 생성한다
								// input() 으로 입력받아서 문자열을 저장한다
								// getMessage() 로 입력된 문자열을 반환받는다
	private Scanner sc;
	private String message;
	
	public Ex06_MessageBox(Scanner sc) {
		this.sc = sc;
		System.out.println("MessageBox 생성자 호출 !!");
	}
	
	void input() {
		System.out.print("메시지 입력 : ");
		message = sc.nextLine();
	}
	Scanner getScanner() {
		return sc;
	}
	void setMessage(String message) {
		this.message = message;
	}
	String getMessage() {
		return message;
	}
}
