package Loop;

public class Ex02 {
	public static void main(String[] args) {
		
		//for문에서 ; 으로 구분된 각 절은 상황에 따라 생략할수 있다.
		
		int i;
		
		for(i=0;i<5;i++) {
			System.out.println("test1");
		}
		System.out.println("끝");
		System.out.println();
		
		for(; i < 10; i++) {
			System.out.println("test2");
		}
		System.out.println("끝");
		System.out.println();
		
		for(; i<15;) {
			System.out.println("test3");
			i++;
		}
		System.out.println("끝");
		System.out.println();
		
		// 조건절을 생략하면 while(true)와 마찬가지로 무한 반복이 만들어 진다.
		for(;;) {
			System.out.println("test : " + i);
			i +=1;
			if(i==1000) {
				break;
			}
		}
		
		System.out.println();
		
	}

}
