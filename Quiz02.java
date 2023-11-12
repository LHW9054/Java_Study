package input;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 클래스 자료형이 import 되지 않아서 빨간줄이 생겼다면
		// 클래스 가장 오른쪽에 커서를 두고 자동완성(ctrl + space)
//		Scanner sc = new Scanner(System.in);
		
		// 이름(문자열), 나이(정수), 키(실수), 몸무게(실수, kg)로 입력받습니다.
		// 입력받은 값에서 체질량 지수(BMI)를 구합니다.
		// BMI는 근육량, 유전적 원인, 개인적 차이를 반영하지 못하는 단점이 있습니다.
		
		// BMI = 몸무개(kg) / 키(m) * 키(m)
		// ~ 18.5		저체중
		// 18.5 ~ 23	정상
		// 23 ~ 25		과체중
		// 25 ~			비만
		
		// 이름과 나이, BMI지수를 화면에 출력 합니다.
		// 단, BMI지수는 소주점 이하 둘째자리까지 출력 하면 됩니다.
		
////////내가 한거//////////////////////////////////////////////////////////////////
//		String name;
//		int age, high, weight, BMI;
//		
//		System.out.println("이름를 입력해 주세요 : ");
//		name = sc.nextLine();
//		
//		System.out.println("나이를 입력해 주세요 : ");
//		age = sc.nextInt();
//		
//		System.out.println("키를 입력해 주세요 : ");
//		high = sc.nextInt();
//		
//		System.out.println("몸무개를 입력해 주세요 : ");
//		weight = sc.nextInt();
//		
//		System.out.printf("이름: %s \n",name);
//		System.out.printf("나이: %d \n",age);
//		System.out.printf("키: %d \n",high);
//		System.out.printf("몸무개: %d \n",weight);\
//		System.out.println();
////////////////////////////////////////////////////////////////////////////////

		// 2) 값이 할당되지 않은 변수 중에서 입력받아야 하는 값을 입력받는다.
		
		// 3) 입력받은 값을 기반으로 연산을 수행하여 다른 변수의 값을 채워 넣는다.
		
		// 4) 모든 값이 준비되면 출력한다. (필요하다면 서식을 활용한다.)
		
		// 5) 결과 처리이후 마무리 코드를 수행하고 종료한다.
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double weight, high, bmi;
		
		System.out.println("이름입력 : ");
		name = sc.nextLine();
		
		System.out.println("나이입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.println("키입력 : ");
		high = Double.parseDouble(sc.nextLine());
		
		System.out.println("몸무개입력 : ");
		weight = Double.parseDouble(sc.nextLine());
		
		high /= 100;
		bmi = weight / (high*high);
		
		System.out.println();
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("BMI : %.2f\n", bmi);
		
		sc.close();
	}
}