package nestedLoop;

public class Ex04 {
	
	static void showPosition() {
//////////////////////////////////////////////////////////////
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("[%d, %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
//////////////////////////////////////////////////////////////
	public static void main(String[] args) {
//////////////////////////////////////////////////////////////
		showPosition();
//////////////////////////////////////////////////////////////
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag = i + j >= 4;
				System.out.print(flag ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
//////////////////////////////////////////////////////////////		
		
		int space = 4;
		int star = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space -= 1;
			star += 1;
		}
		System.out.println();
//////////////////////////////////////////////////////////////
		//     *
		//   * * *
		// * * * * *
		//   * * *
		//     *
//////////////////////////////////////////////////////////////
		space = 2;
		star = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
			if(i < 2) {
				space -= 1;
				star += 2;
			}
			else {
				space += 1;
				star -= 2;
			}
		}
		System.out.println();
//////////////////////////////////////////////////////////////
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				boolean flag1 = (i == 2 || j == 2); 
				boolean flag2 = (i % 2 != 0 && j % 2 != 0);
				System.out.print(flag1 || flag2 ? "* " : "  ");
			}
			System.out.println();
		}
		System.out.println();
//////////////////////////////////////////////////////////////
		
		
		
		
		
	}
}
