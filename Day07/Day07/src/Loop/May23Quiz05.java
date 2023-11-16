package Loop;				//5.22

import java.util.Scanner;

public class May23Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 ;
		String n2 = "";
		String tmp = "";
		
//		System.out.print("입력");
//		n1 = sc.nextInt();
		
		n1 = 1234567;
		
		int cnt = 0;			// 반복의 횟수를 체크하기 위한 변수
		
		while(n1 != 0) {
			if(cnt != 0 && cnt % 3 == 0) {	// 맨체음을 제외한 순번이 3의 배수이면 콤마를 추가한다.
				tmp += ",";
			}
			cnt++;

			tmp += n1 % 10;		// 오른쪽 끝에서 숫자를 하나 가져와서 , tmp에 더한다.
			n1 /= 10;			// 사용한 맨 끝자리는 제거한다.
		}
		
		System.out.println("tmp : " + tmp);
		
		int i = tmp.length() - 1;	// 인덱스는 0 부터 시작하기 때문에 길이 -1 이 마지막 값이다.
		while( i != -1) {			//9, 8, 7, 6, 5, 4, 3, 2, 1, 0
//			System.out.print(tmp.charAt(i));
			n2 += tmp.charAt(i);
			i--;
		}
		System.out.println(" n2 : " + n2);
		sc.close();
		
		
	}

}
