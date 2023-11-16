package Loop;

public class Ex03 {
	public static void main(String[] args) {
		
////////내가한거////////////////////////////////////////////////////////////
//		// 1) 1부터 100사이의 홀수의 합과 짝수의 합을 for문으로 계산하여 출력하세요
//		int num1=0;
//		int num2=0;
//		int i;
//		
//		for(i = 1; i <= 100; i++) {
//			if(i%2 ==0) {
//				num1 += i;
//			}else {
//				num2 += i;
//			}
//		}
//		System.out.println("1부터 100사이의 홀수의 합과 짝수의 합");
//		System.out.println("짝수의 합 : " + num1);
//		System.out.println("홀수의 합 : " + num2);
		
//		// 2) A부터 Z가지 띄어쓰기로 구분하여 한줄에 출력하세요
//		System.out.println("A부터 Z가지 띄어쓰기로 구분하여 한줄에 출력");
//		
//		
//		// 3) 빈 문자열에 * 기호를 5번 추가하여 출력하세요
/////////////////////////////////////////////////////////////////////////
		
		
		
////////강사님////////////////////////////////////////////////////////////
		
//		// 1) 1부터 100사이의 홀수의 합과 짝수의 합을 for문으로 계산하여 출력하세요
//		// 2) A부터 Z가지 띄어쓰기로 구분하여 한줄에 출력하세요
//		// 3) 빈 문자열에 * 기호를 5번 추가하여 출력하세요
		
//		1)
		int oddsum = 0, evensum = 0;
		
		for(int i=1; i <= 100; i++) {
			if(i%2==0) {
				evensum +=i;
			}else {
				oddsum  +=i;
			}
		}
		
		System.out.println("짝수 : " + oddsum);
		System.out.println("홀수 : " + evensum);
		
//		2)
		//char는 글자를 표현하기 위한 정수 자료형이다.
		for(char ch = 'A'; ch<= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
//		3)
		String s = "";
		for(int i = 0; i < 5; i++) {
			s += '*';
		}
		System.out.println(s);

		
		
		
/////////////////////////////////////////////////////////////////////////
	}

}
