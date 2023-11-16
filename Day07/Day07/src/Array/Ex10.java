package Array;

public class Ex10 {
	public static void main(String[] args) {
		
		String[] arr = new String[5];
		
		for(String s:arr) {
			System.out.println(s);
		}
		System.out.println();
		
		arr[0] = "이지은";
		arr[1] = "나단비";
		arr[2] = "홍진호홍진호";
		
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println();
		
		for(String s : arr) {
			if(s != null)		
			System.out.println("글자 길이 : " + s.length());
		}
		System.out.println();
		
	}

}
