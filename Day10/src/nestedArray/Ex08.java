package nestedArray;

public class Ex08 {
	
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
		
		int[][] arr = new int[5][5];
		int num;
		show(arr);
		
		num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		show(arr);
		
		num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[j][i] = num++;
			}
		}
		show(arr);
		
		num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i % 2 == 0) {
					arr[i][j] = num++;
				}
				else {						// j : 0, 1, 2, 3, 4
					arr[i][4 - j] = num++;	// x : 4, 3, 2, 1, 0
				}
			}
		}
		show(arr);
		
		
		num = 1;
		arr = new int[5][5];	// 배열의 모든 숫자를 0으로 초기화
		
		arr[0][0] = num++;	// x값이 짝수이면
		arr[1][0] = num++;	// y값은 0부터 1씩 증가하여 4까지 
		arr[2][0] = num++;
		arr[3][0] = num++;
		arr[4][0] = num++;
		
		arr[4][1] = num++;	// x값이 홀수이면
		arr[3][1] = num++;	// y값은 4부터 1씩 감소하여 0까지
		arr[2][1] = num++;
		arr[1][1] = num++;
		arr[0][1] = num++;
		
		arr[0][2] = num++;	// for(int i = 0; i < 5; i++) { // 0, 1, 2, 3, 4
		arr[1][2] = num++;	// 		for(int j = 0; j < 5; j++) {// 0, 1, 2, 3, 4
		arr[2][2] = num++;	//		i가 짝수이면 j를 그대로 0부터 4까지 증가하는대로 사용
		arr[3][2] = num++;	// 		i가 홀수이면 j는 4부터 0까지 감소하는 형식이 되어야 한다
		arr[4][2] = num++;
		
		// 다시 초기화
		arr = new int[5][5];
		num = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i % 2 == 0) 	arr[j][i] = num++;
				else			arr[4 - j][i] = num++;
			}
		}
		
		show(arr);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
