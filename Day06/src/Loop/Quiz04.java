package Loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		// 랜덤을 활용한 업다운 게임을 작성하세요
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
////////내가한거//////////////////////////////////////////////////////////
//		int user;
//		int count = 1;
//		int i = 1;
//		int num;
//		
//		num = (int)(Math.random()*50);			//	 /100000000;
//		System.out.println(num);
//		
//		System.out.println("숫자를 입력해 주세요 : ");
//		user = sc.nextInt();
//		
//		while(true) {
//			if(user > num) {
//				System.out.println("UP");
//				count+=1;
//			}else {
//				System.out.println("DOWN");
//				count+=1;
//			}
//		}
//		
//		System.out.printf("정답! %d 도전", count);
//		
//		sc.close();	
///////////////////////////////////////////////////////////////////////
			
////////강사님//////////////////////////////////////////////////////////
		
		int answer = ran.nextInt(10) + 1;
		int user;
		int count = 0;
		
		while(true) {
			System.out.println("정수 입력 (1 ~ 10) : ");
			user = sc.nextInt();
			count++;
			
			if(user > answer) {
				System.out.println("DOWN");
			}else if(user < answer) {
				System.out.println("UP");
			}
			else {
				break;
			}
		}
		System.out.printf("정답입니다. %d만에 정답을 맞췄습니다.\n", count);
		sc.close();	
///////////////////////////////////////////////////////////////////////
				
		
	}
}
