package Loop;

public class Quiz02 {
	public static void main(String[] args) {
		// 1부터 100사이의 정수를 반복하여
		// 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
////////강사님///////////////////////////////////////////////////////////////////////
		int oddsum = 0, evensum = 0;
		int cnt = 1;
		
		while(cnt <=100) {
			if(cnt % 2 == 0) {
				evensum = cnt;
			}else {
				oddsum += cnt;
			}
			cnt++;
		}
		System.out.println("짝수의 합 : " + evensum);
		System.out.println("홀수의 합 : " + oddsum);
///////////////////////////////////////////////////////////////////////////////////
	}
}
