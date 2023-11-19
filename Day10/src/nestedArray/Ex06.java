package nestedArray;

public class Ex06 {
	public static void main(String[] args) {
		
		int[] arr1 = {  1,  2,  3,  4,  5 };
		int[] arr2 = {  6,  7,  8,  9, 10 };
		int[] arr3 = { 11, 12, 13, 14, 15 };
		int[] arr4 = { 16, 17, 18, 19, 20 };
		int[] arr5 = { 21, 22, 23, 24, 25 };
		
		// 배열 : 같은 자료형의 여러 데이터를 연속으로 배치한 자료구조
		int[][] arr = { arr1, arr2, arr3, arr4, arr5 };
		
		int[][] array = {
			{  1,  2,  3,  4,  5 },	// [0]
			{  6,  7,  8,  9, 10 },	// [1]
			{ 11, 12, 53, 14, 15 },	// [2]
			{ 16, 17, 18, 19, 20 },	// [3]
			{ 21, 22, 23, 24, 25 }	// [4]
		};
		
		
		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);	
			// 한번 인덱스로 접근한 형태가 배열이라서
			// 각 배열에 대해서 한번 더 반복문을 수행한다
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		
	}
}
