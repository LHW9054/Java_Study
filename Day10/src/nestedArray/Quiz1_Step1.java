package nestedArray;

public class Quiz1_Step1 {
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int size = 5;
		int num = 1;
		int[][] arr = new int[size][size];
		
		// 다음 형태로 출력하세요
		//	1  2  3  4  5
		//  16 17 18 19 6
		//  15 24 25 20 7
		//  14 23 22 21 8
		//  13 12 11 10 9
		
		show(arr);
		// 여기에 코드를 작성하세요
		
		arr[0][0] = num++;	// x가 1씩 증가
		arr[0][1] = num++;	// 반복 5회
		arr[0][2] = num++;
		arr[0][3] = num++;
		arr[0][4] = num++;
		
		arr[1][4] = num++;	// y가 1씩 증가
		arr[2][4] = num++;	// 반복 4회
		arr[3][4] = num++;
		arr[4][4] = num++;
		
		arr[4][3] = num++;	// x가 1씩 감소
		arr[4][2] = num++;	// 반복 4회
		arr[4][1] = num++;
		arr[4][0] = num++;
		
		arr[3][0] = num++;	// y가 1씩 감소
		arr[2][0] = num++;	// 반복 3회
		arr[1][0] = num++;
		
		arr[1][1] = num++;	// x가 1씩 증가
		arr[1][2] = num++;	// 반복 3회
		arr[1][3] = num++;
		
		arr[2][3] = num++;	// y가 1씩 증가
		arr[3][3] = num++;	// 반복 2회
		
		arr[3][2] = num++;	// x가 1씩 감소
		arr[3][1] = num++;	// 반복 2회
		
		arr[2][1] = num++;	// y가 1씩 감소, 반복 1회
		
		arr[2][2] = num++;	// x가 1씩 증가, 반복 1회
		
		show(arr);
	}
}
