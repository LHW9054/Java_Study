package resizableArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 크기가 변하는 배열
		// 실제 배열은 크기가 변화하지 않으나, 참조변수의 특성을 활용하여
		// 변수가 참조하는 배열을 바꿔치기한다
		
		// 정수를 입력하는 만큼 배열에 저장한다
		// 만약 0을 입력하면 더이상 추가하지 않는 의도로 간주하고 반복을 종료한다
		
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int[] arr = new int[size];
		int[] tmp;
		int input;
		
		while(true) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if(input != 0) {
				size += 1;
				tmp = new int[size];
				for(int i = 0; i < size - 1; i++) {
					tmp[i] = arr[i];
				}
				tmp[size - 1] = input;
				arr = tmp;	// tmp 변수가 바라보는 새로운 배열을 arr가 바라보게 한다
			}				// arr가 기존에 참조하던 배열 객체는 참조를 받지 못해서 소멸한다 (G.C)
			else {
				break;
			}
			System.out.println(arr);
			System.out.println(arr.length + " : " + Arrays.toString(arr));
			System.out.println();
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
