package programmers;

import java.util.Stack;

class Solution3 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<>();
		
		for(int i = 0; i < moves.length; i++) {
			// index번째 인형을 꺼낸다
			int index = moves[i] - 1;
			for(int j = 0; j < board.length; j++) {	// 인형이 담긴 통은 N x N 정사각형
				if(board[j][index] != 0) {			// 인형이 있다면
					int size = basket.size();
					if(size >= 1 && board[j][index] == basket.peek()) {	// 마지막 요소를 꺼내지는 않고 참조한다	
						basket.pop();	// 마지막 요소를 꺼낸다 (스택에서 사라진다)
						answer += 2;
					}
					else {
						basket.push(board[j][index]);
					}
					board[j][index] = 0;		// 인형을 꺼낸 자리는 0을 대입한다
					break;						// 인형 하나 꺼냈으면 더이상 반복하지 않는다
				}
			}
		}
		return answer;
	}
}

public class Quiz1_Stack {
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
		Solution3 s = new Solution3();
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
