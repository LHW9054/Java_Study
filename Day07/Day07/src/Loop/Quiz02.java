package Loop;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 1 ~ 100 사이 정수를 입력받아서
		// 퍼센트에 맞게 환산하고
		// 전체길이에서 입력한 수치 이전은 #을 출력하고
		// 이후는 공백을 출력한다.
		// 단, 항상 가운데에는 입력한 수치를 %형태로 출력해야 한다.
		//
		// EX)
		// [##########          20%                    ]
		// [####################50%                    ]
		// [####################75%##########          ]
		// [####################100%###################]
		
		//<내가 생각 했을때 난수>
		/*1. 퍼센트 구하기, 2.#을 퍼센트 앞뒤로 구현하기. 3.자리수 만큼 채우기*/
////////내꺼////////////////////////////////////////////////////////
//		int num;
//		int per;
//		
//		
//		
//		System.out.print("정수 입력 :");
//		num = sc.nextInt();
//		
//		per = num/100;
//		
//
//		
//		
//		for(int i= 0; i < 50; i++) {
//			if(num == i) {
//				i /= 100;
//				per = i;
//			}
//		}
//		
//		System.out.println();
//		System.out.println("끝");
/////////////////////////////////////////////////////////////////////
		
////////강사님/////////////////////////////////////////////////////////
		
		int input, half;
		
		System.out.print("입력 : ");
		input =  sc.nextInt();
		half = input/2;
		
		System.out.print("[");
		for(int i = 0; i < 50; i++) {
			if(i==25) {
				System.out.printf(" %d %%", input);
			}else if(i < half) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println("}\n");
		System.out.println("끝");
		
/////////////////////////////////////////////////////////////////////
		sc.close();
	}

}
