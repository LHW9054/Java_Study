package Function;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Quiz01 {
////////////////////////////////////////////////////////////
//	
//	static int pick(int n1) {
//		int jd = 0;
//		if(n1<0) {
//			jd = n1 * -1;
//		}else {
//			jd = n1;
//		}
//		return jd;
//	}
////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
//		int user;
		int[] arr = new int[3];
//		int[] arr2 = new int[3];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(15)+1;
		}
		
//		System.out.print("현재 위치해 있는 층수는? : ");
//		user = sc.nextInt();
//		
//		for(int z = 0; z < arr.length; z++) {
//			arr2[z] -= arr[z];
//		}
//		
//		for(i = 0; i<arr.length; i++) {
//			arr[i] = arrays.[0];	
//		}
		
		
		
		
		
		// 3대의 엘리베이터가 있다.
		// 사용자에게 현재 층수를 입력받아서 가장 가까운 엘리베이터가 움직이도록 출력 하세요
		// 처음부터 순서대로, 엘리베이터의 이름을 A,B,C 라고 하면
		// "%s 엘리베이터가 이동합니다." 라고 출력해야 합니다.
		// Ex04에서 작성했던 함수를 참조하여, 활용하면 좋습니다.
		
		int currentfloor;
		System.out.print("현재층 입력 : ");
		currentfloor = sc.nextInt();
		
		int min = 14;	//최소값을 구하기 위해서는 이론상의 최대값을 넣어두고 시작한다.
		int index = 0;
		char elename;
////////강사님/////////////////////////////////////////////////////////////
		for(int i = 0; i < arr.length; i++) {
			// i번째 엘리베이터의 층수와, 요청받은 층수의 차이를 출력
			int diff = getabsolute(arr[i] - currentfloor);
			if(min > diff) {
				min = diff;
				index = i;
			}
			System.out.print(diff + " ");
		}
		System.out.println();
		System.out.println((char)(index + 'A') + "엘리베이터가 이동합니다.");
		
		
		System.out.println(Arrays.toString(arr));
		
		char test = getnearelebatorname(arr, currentfloor);
		System.out.println("test : " + test);
		sc.close();
	}
/////////////////////////////////////////////////////////////////////////
	
	static int getabsolute(int num) {
		return num > 0 ? num : -num;
	}
	
	//위에 구하는 식 함수로 가져오는법
	static char getnearelebatorname(int[] arr, int currentfloor) {
		char ele = 'a';
		int index = 0;
		int min = 14;
		
		// 1) 현재층과 각 엘리베이터의 차이 구하기
		for(int i = 0; i < arr.length; i++) {
			int diff = arr[i] - currentfloor;
			// 2) 차이에 절대값 처리하기(거리)
			if(diff < 0) {
				diff = -diff;
			}
			// 3) 거리중 최소값을 찾아서 index구하기
			if(min > diff) {
				min = diff;
				index = i;
			}
			
		}
		// 4) index를 ele에 더하고 반환하기
		ele += index;
		return ele;
	}
	
	

}
