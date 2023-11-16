package Loop;

public class Ex06 {
	public static void main(String[] args) {

		
		String str = "";
		
		for (int i = 1; i <= 12; i ++) {
			str += i;
			if(i%4 == 0) {
				str += "\n";
			}else {
				str += "\t";
			}
		}
		
		System.out.println(str);
		
	}
}
