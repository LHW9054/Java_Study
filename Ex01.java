package Operator;

public class Ex01 {
	public static void main(String[] args) {
		// 논리연산자 : &&, ||, !
		// boolean 타입의 값을 연산한다.
		// && : and, 서로 다른 두 조건이 모두 true이면 true를 나타낸다.
		// || : or, 서로 다른 두조건 중 하나라도 true 이면 true를 나타낸다.
		// ! : not, 단항 연산자이며 true는 false로 바꾸고, false는 true로 바꾼다.
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println("bo1 && bo2 : " + (bo1 && bo2));
		System.out.println("bo1 && true : " + (bo1 && true));
		System.out.println("bo1 || bo2 : " + (bo1 || bo2));
		System.out.println("bo1 || bo2 : " + (false && bo2));
		
		// 서로 다른 두조건을 동시에 만족한다면 true
		// 성별이 남성이고, 나이가 20세 이상인 겨우에만 true
		String gender = "남성";
		int age = 25;
		
		boolean flag1 = gender.equals("남성") && age >= 20;
		
		System.out.println("flag : " + flag1);
		
		// 서로 다른 두조건중 하나라도 만족하면 true
		// 현금이 5천원 이상 있거나, 카드를 가지고 있다면 true
		
		int cash = 10000;
		boolean card = true;
		
		boolean flag2 = cash >= 5000|| card == true;
		System.out.println("flag2 : " + flag2);
		
		// 기존 조건의 반대경우를 나타내고 싶을때 ! 를 붙여준다.
		System.out.println("!flag1 : " + !flag2);
		
		boolean tvpower = false;
		
		System.out.println("tvpower : " + tvpower);
		tvpower = !tvpower;//true

		System.out.println("tvpower : " + tvpower);
		tvpower = !tvpower;//false
		
		System.out.println("tvpower : " + tvpower);
		tvpower = !tvpower;//true
		
		System.out.println("tvpower : " + tvpower);
		tvpower = !tvpower;//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
