package tv;

public class Main_GANGSANIM {
	public static void main(String[] args) {
		
		
		// 객체 생성
		TV_GANGSANIM tv = new TV_GANGSANIM();
		
		// 생성된 TV 객체의 기능 테스트

		System.out.println("1) 전원을 켜고 볼륨 및 채널 테스트");
		tv.turn();
		
		for(int i = 0; i < 250; i++) {
			tv.channelUp();
		}
		
		for(int i = 0; i < 105; i++) {
			tv.volumeUp();
		}
		
		System.out.println("2) 음소거 테스트");
		for(int i = 0; i < 42; i++) {
			tv.volumeDown();
		}
		tv.mute();
		tv.mute();
		
		System.out.println("3) 전원을 off했을 경우 작동하지 않아야 한다");
		tv.turn();
		for(int i = 0; i < 3; i++) {
			tv.channelDown();
		}
		tv.turn();
	}
}