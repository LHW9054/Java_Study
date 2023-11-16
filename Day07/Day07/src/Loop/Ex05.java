package Loop;

public class Ex05 {
	public static void main(String[] args) {
		// 내가한거
		
		// 다음 모양의 문자열을 만들어서 화면에 출력하세요
		
		// ====*====*====*====*====
		
		String str1 = "====";
		String str2 = "*";
		
		for(int i = 1; i <=5; i++) {
			System.out.print(str1);
				if(i != 5) {
					System.out.print(str2);
			}
		}

////////////////////////////////////////////////////////
//		String str = "";
//		for(int i = 1; i < 25; i++) {
//			if(i%5==0) {
//				str += "*";
//			}else {
//				str += "=";
//			}
//		}
//////////////////////////////////////////////////////////
//		
//////////////////////////////////////////////////////////
//		System.out.println();
//		
//		String str2 = "";
//		for(int i = 0; i < 5; i++) {
//			str2 += "====";
//			if (i!= 4) {		//마지막 순번 아니면
//				str2 += "*";
//			}
//		}
//		System.out.println(str2);
////////////////////////////////////////////////////////
		
		
		
	}
}
