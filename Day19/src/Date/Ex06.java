package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex06 {
	public static void main(String[] args) throws ParseException {
		//1970년 1월 1일 0시 0분 0초를 기준으로 얼마나 시간이 지났는지 저장한다.
		
		Date d1 = new Date();	// 객체생성 시점의 현재 날짜
		long t1 = d1.getTime();	// Date에 저장된 정수값을 Long 으로 반환한다..
								// Millisecond : 1/1000초
		System.out.println("t1 : "+ t1);
		
		t1 = t1 / 1000; //초
		
		long sec = t1 % 60;
		t1 = t1/60;
		
		long minute = t1%60;
		t1 /= 60;
		
		long hour = t1 % 24;
		t1 /= 24;
		
		long day = t1 % 24;
		t1 /= 24;
		
		System.out.printf("%2d : %2d : %2d\n", hour, minute, sec);
		
		System.out.println(t1);
		
		long year = t1 / 365;
		System.out.println(year + 1970);
		
		// Date타입의 값을 서식에 맞춰서 문자열로 변경해주는 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss");
		String now = sdf.format(d1);		// Date를 String으로
		System.out.println("now : " + now);
		
		String s2 = "1993-05-16 오전 00:00:00";
		Date d2 = sdf.parse(s2);			// String을 Date로
		
		System.out.println("d2 : " + d2);
		
		
		
		
		
	}
}
