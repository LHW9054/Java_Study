package Loop;

import java.io.*;
import java.util.*;

public class Ex04 {
	public static void main(String[] args) throws IOException{
		// 어떤 파일을 지정하냐에 따라서 문서 내용의 줄수 (반복횟수)가 서로 달라진다.
		
		String filename = "src/loop/Ex01.java";
		File f = new File(filename);
		Scanner sc = new Scanner(f);
		int cnt = 0;
		
		while(sc.hasNextLine()) {	// 다음줄이 확인하여, 다음줄이 있다면 true
			cnt += 1;
			String line = sc.nextLine();
			System.out.printf("%5d : %s\n", cnt, line);
		}
		sc.close();
	}

}
