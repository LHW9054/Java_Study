package tv;

public class Main {
public static void main(String[] args) {
	
	RemoteController remocon = new RemoteController();
	TV_GANGSANIM tv = new TV_GANGSANIM();
	
	
	// 리모컨의 메서드를 호출하면, TV의 기능이 작동하도록 코드를 작성하여
	// 아래에서 테스트 하세요
	
	remocon.setTV(tv);
	remocon.turn();
	
	remocon.channelUp();
	remocon.channelUp();
	remocon.channelDown();
	remocon.volumeUp();
	remocon.volumeUp();
	remocon.volumeDown();
	remocon.mute();
	remocon.mute();
	remocon.setChannel(45);
	remocon.setChannel(245);
////<5/31숙제>//////////////////////////////////////	
	/*
	 * 구조는 kid.class와 비슷함
	 * 
	 * 문자 메세지가 되는 클래스 만들기
	 * A가 보낸 문자를 (문자열) 을 B로 출력할수 있고
	 * B가 보낸 문자를 A가 출력할수 있다
	 * Scanner 사용해도 됨
	 * Literal 을 사용해도 괜찮음
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * this 3가지 활용법
	 * 1.) 메서드 필드 멤머 메서드에 접근 할려고
	 * 2.) this() => 생성자	내 클래스 내부에서 또다른 생성자를 사용할때
	 * 3.) this => 객체 자신 {python => self}
	 * 
	 */
//////////////////////////////////////////////////	
	
	
	
	
	
	
	}
}
