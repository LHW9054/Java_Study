package Loop;

public class Ex01 {
	// for : 일정한 횟수만큼 반복할 때 주로 사용한다.
	public static void main(String[] args) {
			//(1)		(2)	  (4)
		for(int i = 0; i < 5; i++) {	//0, 1, 2, 3, 4
			System.out.println("Hello !!!"); //(4)
		}
		System.out.println();
		
		int cnt = 0;//(1)
		while(cnt < 5) {//(2)
			System.out.println("java");//(3)
			cnt++;//(4)
		}
		System.out.println();
	}

}
