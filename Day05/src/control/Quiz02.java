package control;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*지하철 1구간당 평균 이동기간이 4분이라고 가정한다.
		 * 이동한 구간수를 입력받아서, 걸린 시간을 출력하세요
		 * 단, 시간이 60분 이상이면 시간과 분을 구분하여 출력하고
		 * 시간이 60분 미만이면 분만 출력하세요
		 */
	
////////내가한거///////////////////////////////////////////////////////////////////////////
//		int station;
//		int hour, min;
//		
//		System.out.println("이동한 구간 : ");
//		station = sc.nextInt();
//		
//		min = station * 4;
//	    hour = station / 60;
//		
//		if(min <= 60) {
//			System.out.printf("이동구간 : %d구간\n이동시간 : %dmin", station, min);			
//		}else{
//			System.out.printf("이동구간 : %d구간\n이동시간 : %d시간%d분", station, hour,min);			
//		}
//////////////////////////////////////////////////////////////////////////////////////////
		
		
		
////////강사님////////////////////////////////////////////////////////////////////////////
//		
//		int perstation = 4;
//		int station;
//		int time;
//		int hour, minute;
//		
//		System.out.println("이동한 구간 수 입력 : ");
//		station = sc.nextInt();
//		
//		time = station * perstation;
//		
//		if(time >= 60) {
//			hour = time / 60;
//			minute = time % 60;
//			System.out.printf("걸린시간 : %d시간 %d분", hour, minute);
//		}else {
//			System.out.printf("걸린시간 : %d분",time);
//		}
//		
//		
//		
/////////////////////////////////////////////////////////////////////////////////////////
		sc.close();
	}

}
