package chat;

public class phone {
	
	private String name;
	private String showmessage;
	
	public phone(String name) {
		this.name = name;
	}
	
	// 문자열 메시지를 다른 phone에게 보내기
	void sendmessage(phone target, String message) {
		target.recievemessage(this, message);
	}
	
	public void showmessage() {
		System.out.println("내용 : " + showmessage);
		System.out.println();
	}
	
	// 전달받은 메시지를 화면에 출력하기
	public void recievemessage(phone sender, String showmessage) {
		this.showmessage = showmessage;
		System.out.println("메시지 도착 from " + sender.name);
		showmessage();
		
	}
}
