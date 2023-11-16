package Function;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int length = ran.nextInt(5) + 1;
		int[] arr = new int[length];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt() % 100;
		}
		System.out.println(Arrays.toString(arr));
		
		// 절대값이 최대인 값을 찾아내기
		// 1) 절대값으로 구성된 새로운 배열을 만들기
		int[] tmp = new int[length];
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if(num < 0) {
				num = -num;
			}
			tmp[i] = num;
		}
		System.out.println("1) tmp : " + Arrays.toString(tmp));
		
		// 2) 최대값을 찾아서 그 index를 저장하기
		int index = 0;
		int max = 0;
		for(int i  = 0; i < tmp.length; i++) {
			if(max < tmp[i]) {
				max = tmp[i];
				index = i;
			}
		}
		
		// 3) 원래 배열에서 index를 이용하여 값을 출력
		System.out.println("3) 절대값이 가장 큰 수 : " + arr[index]);
		
		// 4) 함수를 이용하여 계산한 값
		int result = getmaxabsindex(arr);
		System.out.println("4) 절대값이 가장 큰수 : " + arr[result]);
		
	}	// end of main
	
	// 함수정의는 함수 바깥에서 이루어져야 한다. (클래스 내부에서 함수를 정의한다.)
	
	static int getmaxabsindex(int[] arr) {
		
		int index = 0;
		return index;
	}
	
}
