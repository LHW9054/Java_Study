package operator;

public class Ex06 {
	public static void main(String[] args) {
		// 대입 연산
		// 우변의 값을 죄변의 공간에 복사하여 저장한다. 기존 값을 덮어 쓴다.
		int n1 = 10;
		int n2 = 20;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		n1 = n2;
		// n2의 값을 n1 변수에 복사하여 대입한다. 기존의 10은 사라지고 20으로 바뀐다.
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
		// 대입 연산에서 좌변과 우변에 동일한 변수가 등장하곤, 산술연산의 결과를 대입할때
		n1 = n1 + 3;
		System.out.println("n1 : " + n1);
		
		n1 += 3;		// 기존값에서 3만큼 증가시킨다.(복합대입, 배정대입)
		System.out.println("n1 : " + n1);
		// 복합대입연산자는 기존값을 참조하여 더하거나 빼거나 산술연산을 수행한다.
		
		// 게시글 조회수. 게시글을 열람할때 마다 기존 조회수 +1 을 연산하여 다시 대입힌다.
		// update board set viewcount - viewcount + 1 where idx = 5283;
		int viewcount = 0;
		viewcount +=1;
		viewcount +=1;
		viewcount +=1;
		System.out.println("viewcount : "+viewcount);
		
		// -=, *=, /=, %=
		
		int binary = 1;
		for(int i =0; i <10; i++) {
			binary *=2;
		}
		System.out.println(binary); //2^10		
	}
}
