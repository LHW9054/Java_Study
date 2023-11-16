package Function;

public class Ex04{

	public static void main(String[] args) {
		// 1) 정수를 하나 전달 받아서 절대값을 반환하는 함수
		int t1 = getabsolute(5 - 7);
	
		// 2) 세 정수를 전달받아서 최소값을 반환하는 함수
		int t2 = getminvalue(7, 2, 5);
	
		// 3) 길이가 3인 배열을 전달받아서 최소값을 반환하는 함수
		int[] arr = {7, 2, 5};
		int t3 = getminvalue(arr);
	
		// 하나의 함수이름으로, 여러개의 함수 정의를 별도로 만들수 있다.
		// 함수 오버로딩, 머서드 오버로딩
		// 구분 기준 : 함수이름 + 매개변수의 자료형, 개수, 순서
	
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
	}

////강사/////////////////////////////////////////////////////////
	static int getabsolute(int num) {
		return num > 0 ? num : -num;
	}
	
	static int getminvalue(int n1, int n2, int n3) {
		int min = 0;
		min = Integer.MAX_VALUE;	// 정수 범위에서 최대값
		if(min > n1) {
			min = n1;
		}
		if(min > n2) {
			min = n2;
		}
		if(min > n3) {
			min = n3;
		}
		return min;
	}
	
	static int getminvalue(int[] arr) {
		int min = 0;
		min = Integer.MAX_VALUE;	//정수 범위에서 최대값
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
////////////////////////////////////////////////////////////////
////나///////////////////////////////////////////////////////////
//	static int getabsolute(int num) {
//		return -num;
//	}
//	
//	static int getminvalue(int n1, int n2, int n3) {
//		int answer = 0;
//		if(n1 < n2 && n1 < n3) {
//			answer = n1;
//		}else {
//			answer = n2;
//		}
//		return answer;
//	}
//	
//	static int getminvalue(int[]) {
//		
//		
//	}
////////////////////////////////////////////////////////////////

}	