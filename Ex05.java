package operator;

import java.util.Random;

public class Ex05 {
	// 산술연산
	public static void main(String[] args) {
		// 커서 줄을 아래로 복사하기 : ctrl + alt + ↑/↓
		// 현재 커서 줄을 위치 이동하기 : alt + ↑/↓
		int n1 = 10;
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 - n2 = " + (n1 - n2));
		System.out.println("n1 * n2 = " + (n1 * n2));
		System.out.println("n1 / n2 = " + (n1 / n2));
		System.out.println("n1 / n2 = " + (n1 / (double)n2));
		System.out.println("n1 % n2 = " + (n1 % n2));
		System.out.println();
		
		// 1) + 연산자는 이항 연산이며, 양쪽중 하나라도 String이 있다면 이어붙이기를 수행한다.
		
		// 2) 산술 연산은 양쪽 자료형에 따라 결과의 자료형이 달라진다.
		//    정수와 정수의 연산은 정수로 나타나고
		//    한쪽이라도 실수가 포함되면 결과는 실수로 나타난다.
		int sub1 = 100, sub2 = 99, sub3 = 87;
		int sum = sub1 + sub2 + sub3;
		double avg1 = sum/3;
		double avg2 = sum/3.0;
		double avg3 = sum/(double)3;
		System.out.println("avg1 : " + avg1);
		System.out.println("avg2 : " + avg2);
		System.out.println("avg3 : " + avg3);
		System.out.println();
		
		// 3) 나머지 연산은 다음 경우에 활용할수 있다.
		int n3 = 11;
		int n4 = 12;
		//  - 배수와 약수를 처리한다.
		System.out.println("n3 / 3 : " + n3 % 3); //n3을 3으로 나눈 나머지
		System.out.println("n4 / 3 : " + n4 % 3); //n4를 3으로 나눈 나머지
		System.out.println();
		
		//  - 정수의 자릿수를 분리하여 구분한다.
		int birth = 930516;
		int year, month, date;
		
/*16*/  date = birth % 100;		//100으로 나눈 나머지를 저장(0의 개수만큼 뒷자리를 떼어낸다.)
/*9305*/birth = birth / 100;	//100으로 나눈 몫을 다시 저장(나머지를 버린다.)
/*5*/   month = birth % 100;
/*93*/  year = birth / 100;
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.println();
		
		
		//  - 난수의 범위를 제한할 수 있다.
		Random ran = new Random();
		int randomValue = ran.nextInt();
		
		if(randomValue < 0) {
			randomValue = -randomValue; // 단항 부호 반전 연산
		}
		int dice = randomValue % 6 + 1;

		System.out.println(randomValue);
		System.out.println(dice);
		
	}
}
