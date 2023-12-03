package File;

import java.io.File;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws Exception{
		// 텍스트 파일의 내용을 읽어오기
		
		String parent = "C:\\windows\\system32\\drivers\\etc";
		String child = "hosts";
		File f = new File(parent, child);
		
		System.out.println("f가 존재하는가 : " + f.exists());
		
		if(f.exists()) {
			// 파일의 내용을 읽어내느 Scanner
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {			// 다음줄이 있으면
				String line = sc.nextLine();	// 다음줄을 저장한다음
				System.out.println(line);		// 출력하고
				Thread.sleep(500);				// 0.5초 지연시킨다.
			}
			sc.close();
			
		}
		
	}
}
