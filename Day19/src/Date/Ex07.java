package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07 {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E W주차");
		
		String begin = "2023-06-01";
		String end = "2023-06-30";
		
		Date d1 = sdf.parse(begin);
		Date d2 = sdf.parse(end);
		
		for(long i = d1.getTime(); i<=d2.getTime(); i+=1000*60*60*24) {
			Date t = new Date(i);		// Date생성자에 long값을 전달하여 객체를 생성할수 있다.
			String s = sdf2.format(t);
			System.out.println(s);
			
			if(s.contains("토")) {
				System.out.println();
			}
		}
		
		
		
		
	}
}
