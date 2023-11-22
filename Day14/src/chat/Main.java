package chat;

public class Main {
	public static void main(String[] args) {
		phone p1 = new phone("김도기");
		phone p2 = new phone("천지훈");
		
		p1.sendmessage(p1, "안녕하세요");
		p2.sendmessage(p2, "누구시요?");
		
	}

}
