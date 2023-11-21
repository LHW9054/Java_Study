// 내가 한거
package tv;

// 필드와 메서드
// 필요하다면 생성자를 활용하여
// TV객체의 구성을 클래스로 나타냅니다.

// 속성(명사형)은 필드
// 기능(동사형)은 메서드로 나타냅니다.

public class TV_MY {
	
	int channel = 0;
	int volume = 0;
	
	// 필드
	boolean power;	// = false;
	boolean user;
//////////////////////////////////////////////////////////////////////////////
//////메서드///////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
	void turn() {
		power = !power;	//켜져 있다.(true)
		
		if(power && user) {
			System.out.println("TV가 켜졌습니다.");
			power = true;
		}else if(power && user) {
			System.out.println("TV가 꺼졌습니다..");
			power = false;
		}
	}
//////////////////////////////////////////////////////////////////////////////
	
	// 채널
	void channel() {
		if(power = true) {
			System.out.printf("현재 채널은 %d 입니다.", channel);
				if(channel >=999) {
					channel = 1;
				}else {
					System.out.println("TV가 켜져 있지 않습니다.");
			}
		}
	}
	
	// 음량
	void volume() {
		if(power = true) {
			System.out.printf("현재 볼륨은 %d 입니다", volume);
			if(volume > 20) {
				System.out.println("최대볼륨 입니다.");
			}
		}else {
			System.out.println("TV가 켜져 있지 않습니다.");
		}
		
		
	}
	

}
