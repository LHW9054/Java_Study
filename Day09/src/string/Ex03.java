package string;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		// 문자열 함수를 활용하는 예시
		
		String url = "https://search.naver.com/search.naver?query=iu&where=news";
		
		// 명령어를 운영체제에게 전달하여 프로그램을 실행하기 위한 객체 Runtime
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Runtime rt = Runtime.getRuntime();
		rt.exec(chromePath + " " + url);
		
		String[] arr = url.split("\\?");
		
		System.out.println(url);
		System.out.println();
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
		
		String[] arr1 = arr[0].split("/");
//		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		System.out.println("프로토콜 : " + arr1[0].replace(":", ""));
		System.out.println("서버이름 : " + arr1[2]);
		System.out.println("페이지이름 : " + arr1[3]);
		
		String[] arr2 = arr[1].split("&");
//		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		for(int i = 0; i < arr2.length; i++) {
			String s = arr2[i];
			String name = s.split("=")[0];
			String value = s.split("=")[1];
			System.out.printf("%s : %s\n", name, value);
		}
		
		
	}
}
