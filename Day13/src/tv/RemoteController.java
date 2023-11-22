package tv;

public class RemoteController {
	
//	TV tv;	// TV 객체를 참조할 수 있는 참조변수
	
////내가////////////////////////////////////////////////////
//	private String name = "리모콘";
//	boolean power;
//	int channel;
//	int volume;
//	int mute;
//	
//	public void tv (String name) {
//		this.name = name;
//	}
//	
//	public boolean power() {
//		return power != null;
//	}
//	
//	public channel setchannel() {
//		if(power == true) {
//			channel++;
//			if(channel > 100) {
//				channel = 1;
//			}
//		}
//	}
//	
//	public volume setvolume() {
//		if(power == true) {
//			volume++;
//			if(volume > 20) {
//				mute = volume;
//				
//			}
//		}
//	}
/////////////////////////////////////////////////////////////
	
////강사님////////////////////////////////////////////////////
	
	private TV_GANGSANIM tv;	// TV 객체를 참조할수 있다
	
	public void setTV(TV_GANGSANIM tv) {
		this.tv = tv;
	}
	
	void turn()			{	tv.turn();		}
	void channelUp() 	{	tv.channelUp();	}
	void channelDown() 	{	tv.channelDown();}
	void volumeUp() 	{	tv.volumeUp();	}
	void volumeDown() 	{	tv.volumeDown();	}
	void mute() 		{	tv.mute();		}
	
	void setChannel(int channel) {
		tv.channel = channel;
	}
	
	
/////////////////////////////////////////////////////////////
}
