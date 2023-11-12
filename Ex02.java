package Operator;

public class Ex02 {
	public static void main(String[] args) {
		// 논리연산자의 특징
		
		// 1)A && B 는 양쪽 모두 True 이여야 전체결과가 true이다.
		// 만약, A가 false라면B의 결과에 상관없이 전체결과는 false이다.
		// 따라서, a가 false라면 b의 내용은 체크하지 않는다.(코드를 수행하지 않는다.)
		
		// 2) A || B 는 양쪽 모두 FALSE이여야 전체 결과가 FALSE이다.
		// 만약, A가 true라면 B의 결과에 상관없이 전체 결과가 true이다.
		// 따라서, A가 true라면 B의 내용은 체크하지 않는다.(코드를 수행하지 않는다.)
		
		int a =2, b = 1, c = 0, d = -1;
		System.out.printf("%d, %d, %d, %d\n",a, b, c, d);
		
		boolean bo1 = (a++ + ++b < 0) && (c++ - d-- == 0);
									//첫번째 조건이 true이기 때문에 뒤에 조건은 실행하지 않는다.
		System.out.println("bo1 : " + bo1);
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		
		boolean bo2 = ((a *= 2) > b) || ((d *= c) != 0);
		System.out.println("bo2 : " + bo2);
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		
		// 제어문의 조건으로 활용할때 !flag 형식으로 사용하거나
		// flag == false 형식으로 사용할수 있다.
		
		int age = 15;
		boolean isAdult = age >=20;
		
		if(!isAdult) {//간결하게 표현하고 싶을때
			System.out.println("성인이 아닙니다.!!");
		}
		
		if(isAdult == false) {//명확하게 표현하고 싶을때
			System.out.println("성인이 아닙니다.!!");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
