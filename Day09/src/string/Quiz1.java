package string;

public class Quiz1 {
	public static void main(String[] args) {
		// Luhn 알고리즘
		
		/*
 			카드번호 16자리의 글자를 이용하여 카드번호의 유효성을 검증하는 알고리즘
 			우측부터 세어서 홀수번째는 그대로 두고 짝수번째는 두배로 만든다
 			만약 두배로 만들어진 값이 두자리수가 되면 각 자릿수를 합한다
 			이렇게 만들어진 16자리의 정수를 모두 더하여 그 합이
 			10으로 나누어 떨어지면 유효한 카드번호, 그렇지 않으면 유효하지 않은 카드번호이다
 			
 			문자열로 카드번호를 xxxx-xxxx-xxxx-xxxx 형식으로 전달받아서
 			유효성을 true/false 로 반환하는 함수를 작성하고 테스트하세요
		 */
		
		// 2720-1234-5678-1357
		// 4740-2264-1658-2317 (62, false)
		
		// 1720-1234-5678-1357
		// 2740-2264-1658-2317 (60, true)
		
		String t1 = "1720-1234-5678-1357";
		String t2 = "1720-1234-5678-1357";
		
		boolean b1 = checkCardNumber(t1);
		boolean b2 = checkCardNumber(t2);
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
	}
	
	static boolean checkCardNumber(String cardNumber) {
		boolean answer = false;
		cardNumber = cardNumber.replace("-", "");
		
		if(cardNumber.length() != 16) {	// -를 제외한 카드번호의 길이가 맞지 않으면
			return false;				// 함수를 중단하면서 false를 반환한다
		}
		
		int sum = 0;
		for(int i = 0; i < cardNumber.length(); i++) {
			char ch = cardNumber.charAt(i);
			int num = ch - 48;
			// 홀수번째는 그대로, 짝수번째는 두배
			if(i % 2 == 0) {
				num *= 2;
				if(num >= 10) {	// 만약 더한 값이 두자리수 이상이면 (10 이상이면)
					num = num / 10 + num % 10;	// 10의 자리와 1의 자리를 더한다
				}
			}
			sum += num;	// 합계에 누적시킨다
		}
		answer = sum % 10 == 0;	// 그 합이 10으로 나누어 떨어지면 true
		return answer;
	}
	
	
}
