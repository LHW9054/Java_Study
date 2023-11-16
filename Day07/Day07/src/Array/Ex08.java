package Array;

public class Ex08 {
	public static void main(String[] args) {
		
		int n1 = -5, n2 = 2, n3 = 4;
		int max = n1;
		
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println("max : " + max);
		System.out.println();
					// 하나의 요소를 element라고 부름
		int[] arr = {17, 26, 33, 52, 46, 87, 69, 92, 73};
		max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println();
		
////////내가한거//////////////////////////////////////////////////
//		// 1) arr의 값 중에서, 홀수이면서 가장 큰 값을 찾아서 출력하세요
//		int odd = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 == 1) {
//				odd = arr[i];
//			}
//		}
//		System.out.println("홀수의 최대값 : " + odd);
//		
//		// 2) arr의 값 중에서, 짝수인 값의 합계를 구하여 출력하세요
//		int even = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				even = arr[i];
//			}
//		}
//		System.out.println("짝수의 최대값 : " + even);
//		
//		// 3) arr의 모든 값의 평균을 구하여 소수점 둘째자리 까지 출력하세요
//		double avg1 = 0;
//		double avg2 = 0;
//		for(int i = 0; i < arr.length; i++) {
//			avg1 += arr[i];
//			avg2 = avg1/arr[i];
//		}
//		System.out.printf("모든값의 평균 : %.2f", avg2);
////////////////////////////////////////////////////////////////
		
////////강사님///////////////////////////////////////////////////
		//1)홀수중가장큰값
		int oddmax = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 !=0 && oddmax <arr[i]) {
				oddmax = arr[i];
			}
		}
		System.out.println("1) 홀수중가장큰값 : " + oddmax);
		
		//2)짝수의 합계
		int evensum = 0;
		
		for(int num : arr) {
			if(num % 2 == 0) {
				evensum += num;
			}
		}
		System.out.println("2) 짝수의 합계 : " + evensum);
		
		//3)평균
		int sum = 0;
		for(int num : arr) {
			sum +=num;
		}
		double avg = sum / (double)arr.length;
		System.out.printf("3) 평균 : %.2f\n", avg);
////////////////////////////////////////////////////////////////
		
	}

}
