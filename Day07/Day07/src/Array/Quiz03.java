package Array;

import java.util.Random;
import java.util.Arrays;

public class Quiz03 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
////////내가한거///////////////////////////////////////////////////////////	
//		// 1) arr의 값에서 홀수와 짝수가 각각몇개인지 파악하여 출력하세요
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2==0) {
//				sum1 += 1;
//			}else {
//				sum2 += 1;
//			}
//		}
//		System.out.println("짝수개수 : " + sum1);
//		System.out.println("홀수개수 : " + sum2);
//		
//		// 2) oddArray와 evenArray를 생성하여 각각홀수와 짝수를 담아서 출력하세요
//		int oddarray = 0;
//		int evenarray = 0;
//		
//		for(int z = 0; z < arr.length; z++) {
//			if(arr[z] )
//		}
//		
//		
//		// 3) arr의 총합을 구하여 출력하세요.		
//		int total = 0;
//		for(int a = 0; a < arr.length; a++) {
//			total += arr[a];
//		}
//		System.out.println(total);
/////////////////////////////////////////////////////////////////////////	
		
		
		
////////강사님////////////////////////////////////////////////////////////	

		// 1)
		int oddcount = 0, evencount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		System.out.printf("1) 홀수의 개수 :  %d, 짝수의 개수 : %d\n", oddcount, evencount);
		
		// 2)
		int[] oddarray = new int[oddcount];
		int[] evenarray = new int[oddcount];
		
		int oddindex = 0, evenindex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
//				evenArray[evenArray.length - evenCount] = arr[i];
//				evenCount--;
				evenarray[evenindex++] = arr[i];
			}else {
//				oddArray[oddArray.length - oddCount] = arr[i];
//				oddCount--;
			oddarray[oddindex++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(oddarray));
		System.out.println(Arrays.toString(evenarray));
		
		// 3) arr의 총합을 구하여 출력하세요
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		System.out.println("합계 : " + sum);
////////////////////////////////////////////////////////////////////////	
	}

}
