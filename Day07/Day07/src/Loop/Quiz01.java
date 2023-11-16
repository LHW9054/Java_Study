package Loop;

public class Quiz01 {
	public static void main(String[] args) {
////////////////////////////////////////////////
//		String a = "*";
//		String b = "  ";
//		String c = "\n";
//		for(int i = 0 ; i<=25 ;i++) {
//			System.out.print(a);
//			System.out.print(b);
//			if(i % 5 == 0) {
//			System.out.print(c);
//			}
//		}
////////////////////////////////////////////////
		
////////////////////////////////////////////////
		String str = "";
		for(int i = 1; i <=25; i++) {
			if(i%2!=0) {
				str +="* ";
			}else {
				str+="  ";
			}
			if(i%5==0) {
				str += "\n";
			}
		}
		System.out.println(str);
////////////////////////////////////////////////
	}
}
