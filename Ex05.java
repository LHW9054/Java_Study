package output;

public class Ex05 {
	public static void main(String[] args) {
	
		//메모리의 데이터를 화면에 출력하는 함수
		System.out.print("A"); 	//출력후 줄을 바꾸지 않는다.
		System.out.println("B");	//출력후 한줄 내린다.
		System.out.printf("C");	//줄은 바꾸지 않고, 서식에 따른 출력을 할수 있다.
		
		// print(), println()은 하나의 값만 출력할수 있다.
		System.out.println("2 + 3 = " + (2 + 3));
		
		// printf()는 첫번째 항목에 문자열 서식을 지정한 후, 이후에 여러값을 순서대로 지정한다.
		System.out.printf("%s의 나이는 %d살입니다.\n", "이지은", 31);
		
		// printf()는 서식에 맞춰서 데이터를 출력한다.
		// String.format()은 서식에 맞춰서 문자열을 생성한다.
		
		String data = String.format("%s의 나이는 %d살입니다\n", "이지은", 31);
		System.out.println("data : " + data );
		
		
	}
}
