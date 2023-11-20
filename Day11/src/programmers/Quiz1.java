package programmers;

import java.util.Arrays;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		System.out.println(Arrays.toString(moves));
		int[] basket = new int[moves.length];
		
		for(int i = 0; i < moves.length; i++) {

			// index번째 인형을 꺼낸다
			int index = moves[i] - 1;
			int get = 0;
			for(int j = 0; j < board.length; j++) {	// 인형이 담긴 통은 N x N 정사각형
				if(board[j][index] != 0) {	// 인형이 있다면
					get = board[j][index];	// 지정한 위치의 인형을 꺼낸다
					board[j][index] = 0;	// 인형을 꺼낸 자리는 0을 대입한다
					break;					// 인형 하나 꺼냈으면 더이상 반복하지 않는다
				}
			}

			// 꺼낸 인형을 바구니에 넣는다
			for(int j = 0; j < basket.length; j++) {
				if(basket[j] == 0) {
					basket[j] = get;
					break;
				}
			}
			System.out.println(get + " : " + Arrays.toString(basket));

			// 연속된 인형이 있다면 터트린다
			// [4, 3, 1, 1, 3, 2, 4, 0]
			for(int j = 0; j < basket.length; j++) {
				// 배열 선언시 0이 연속으로 배치되어 있어서, 0일 경우는 연산에서 제외시킨다
				if(basket[j] != 0 && basket[j] == basket[j + 1]) {
//					basket[j] = basket[j + 2];		
//					basket[j + 1] = basket[j + 3];
					basket[j] = 0;		
					basket[j + 1] = 0;
					answer += 2;
				}
			}
		}
		return answer;
	}
}

public class Quiz1 {
	static void show(int[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				String s = "";
				switch(board[i][j]) {
				case 0: 	s = "     ";	break;
				case 1: 	s = "😎";		break;
				case 2: 	s = "😍";		break;
				case 3: 	s = "😛";		break;
				case 4: 	s = "😆";		break;
				case 5: 	s = "😀";		break;
				}
				System.out.print(s + " ");
//				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// main함수는 변경하지 않습니다 !!
		Solution s = new Solution();
		int[][] board = {
				{0, 0, 0, 0, 0},	
				{0, 0, 1, 0, 3},	
				{0, 2, 5, 0, 1},	
				{4, 2, 4, 4, 2},	
				{3, 5, 1, 3, 1},	
		};
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		show(board);
		
		int answer = s.solution(board, moves);
		
		show(board);
		System.out.println(answer == 4 ? "정답" : "오답");
	}
}
