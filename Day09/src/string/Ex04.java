package string;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String search = "아이브 after like 가사";
		search = search.replace(" ", "+");
		
		String url = "https://search.naver.com/search.naver?query=" + search;
		URL requestURL = new URL(url);
		URLConnection conn = requestURL.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		String data = "";
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		System.out.println(data.length());
		
		// 문자열 함수를 이용하여 내가 원하는 부분만 남기기
		data = data.substring(data.indexOf("<div class=\"intro_box\">"));
		data = data.substring(0, data.indexOf("</div>"));
		
		System.out.println(data.length());
		
		data = data.replace("<br/>", "\n");
		data = data.replace("<br>", "\n");
		data = data.replace("\n ", "\n");
		data = data.replace("</p>", "");
		data = data.substring(data.lastIndexOf(">") + 1);
		data = data.replaceFirst(" ", "");
		
		System.out.println(data);
		System.out.println(data.length());
		
		sc.close();
	}
}
