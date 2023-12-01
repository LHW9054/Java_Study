package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) throws ParseException {
		// 서로 다른 두 기간을 날짜로 입력받아서
		// 두 기간이 겹치는지 아닌지 판별하는 코드를 작성해봅시다
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print("기간1 시작일 : ");
		Date period1Begin = sdf.parse(sc.nextLine());	// 2023-06-01
	
		System.out.print("기간1 종료일 : ");
		Date period1End = sdf.parse(sc.nextLine());		// 2023-06-25
		
		System.out.print("기간2 시작일 : ");
		Date period2Begin = sdf.parse(sc.nextLine());	// 2023-06-10
		
		System.out.print("기간2 종료일 : ");
		Date period2End = sdf.parse(sc.nextLine());		// 2023-06-30
		
		boolean flag1 = period2Begin.getTime() < period1End.getTime();
		boolean flag2 = period1Begin.getTime() < period2End.getTime();
		
		System.out.println(flag1 ? "겹침" : "겹치지 않음");
		System.out.println(flag2 ? "겹침" : "겹치지 않음");
		
		sc.close();
		
		
	}
}
