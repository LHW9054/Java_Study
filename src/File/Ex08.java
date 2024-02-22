package File;

import java.io.File;
import java.io.FileWriter;

public class Ex08 {
	public static void main(String[] args) throws Exception{
		
		File f = new File("a.txt");
		if(f.exists() == false) {
			f.createNewFile();
		}
		
		// 기존 내용을 유지하고 아래쪽에 내용을 추가할 것인가?
		boolean append = false;
		
		FileWriter fw = new FileWriter(f, append);
		fw.append("Hello\n");
		fw.append("world\n");
		fw.append("java\n");
		fw.append("한글\n");
		fw.flush();
		fw.close();
		
		System.out.println("완료");
		
		
	}
}
