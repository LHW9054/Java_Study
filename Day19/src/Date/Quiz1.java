package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz1 {
	public static void main(String[] args) throws ParseException {
		// 매월 2주, 4주 일요일은 대형마트 휴무일입니다
		// 2023년 대형마트 휴무일은 총 몇일인지 계산하여 출력하세요
		
		// 각 휴무 날짜를 반복문을 이용하여 출력해보세요
		// 서식은 자유롭게 작성하되, 연월일과 요일은 반드시 포함되어야 합니다
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		Date d1 = sdf1.parse("2023-01-01");
		Date d2 = sdf1.parse("2023-12-31");
		
		int month = 1;			// 1월부터
		int sundayCount = 1;
		int sum = 0;
		
		for(long i = d1.getTime(); i <= d2.getTime(); i += 1000 * 60 * 60 * 24) {
			String s = sdf2.format(new Date(i));
			
			if(s.contains("일요일")) {
				if(month != Integer.parseInt(s.substring(6, 8))) {	// 새로운 값과 저장한 값을 비교한다
					System.out.println();
					sundayCount = 1;
				}
				if(sundayCount == 2 || sundayCount == 4) {	// 2번째 혹은 4번째일때 출력 및 합계 증가
					System.out.printf("%s (%d)\n", s, sundayCount);
					sum++;
				}
				sundayCount++;
				month = Integer.parseInt(s.substring(6, 8));	// 출력한 월을 저장한다
			}
		}
		System.out.printf("\n2023년 대형 마트 휴무일은 총 %d일입니다\n", sum);
		
	}
}







