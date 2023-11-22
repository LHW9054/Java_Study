package tv;

// 필드와 메서드
// 필요하다면 생성자를 활용하여
// TV객체의 구성을 클래스로 나타냅니다

// 속성(명사형)은 필드
// 기능(동사형)은 메서드로 나타냅니다

public class TV_GANGSANIM {

	// 필드
	boolean power;	// = false;
	int channel;	// 1 ~ 200
	int volume;		// 0 ~ 100
	int mute;
	
	// 메서드
	void turn() {
		power = !power;
		if(power) {
			show();
		}
	}
	
	// 생성자
	TV_GANGSANIM() {
		channel = 1;
		volume = 10;
	}
	
	void channelUp() {
		if(power) {
			channel++;
			if(channel > 200) {
				channel = 1;
			}
		}
		show();
	}
	void channelDown() {
		if(power) {
			channel--;
			if(channel < 1) {
				channel = 200;
			}
		}
		show();
	}
	void volumeUp() {
		if(power) {
			volume++;
			if(volume > 100) {
				volume = 100;
			}
		}
		show();
	}
	void volumeDown() {
		if(power) {
			volume--;
			if(volume < 0) {
				volume = 0;
			}
		}
		show();
	}

	void mute() {	
		// 현재 볼륨을 임시로 저장해두었다가
		// 한번 더 누르면 원상태로 복구
		// mute와 volume의 값을 서로 교환
		if(power) {
			int tmp = volume;
			volume = mute;
			mute = tmp;
		}
		show();
	}
	
	void show() {
		String c = String.format("ch : %3d", channel);
		String v = String.format("vl : %3d", volume);
		if(mute != 0) {
			v = String.format("vl : ---", volume);
		}
		if(power == false) {
			c = "POWER";
			v = "OFF ";
		}
		System.out.printf("┌───────────────┐\n");
		System.out.printf("│\t\t│\n");
		System.out.printf("│%10s\t│\n", c);
		System.out.printf("│%10s\t│\n", v);
		System.out.printf("│\t\t│\n");
		System.out.printf("└───────────────┘\n");
	}
	
	//	5/31
	// 리모컨에서 숫자로 입력한 채널을 처리하는 함수
	public void setChannel(int channel) {
		if(channel < 0 || 200 < channel) {
			return;	// 즉시 함수를 종료한다.
		}
		this.channel = channel;
		show();
	}
	


}










