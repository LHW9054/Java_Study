package File;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) throws IOException{
		
		File f1 = new File("a.txt");
		File f2 = new File("C:\\upload", "b.txt");
		File dir = new File("C:\\upload");
		File f3 = new File(dir, "c.txt");
		
		// 자바에서 파일 객체를 생성한다고 해서, 실제 디스크에 파일이 만들어 지는것이 아니다!!
		
		System.out.println("f1이 존재하는가 : " + f1.exists());
		System.out.println("f2이 존재하는가 : " + f2.exists());
		System.out.println("dir이 존재하는가 : " + dir.exists());
		System.out.println("f3이 존재하는가 : " + f3.exists());
		System.out.println();
		
		if(f1.exists()==false) {
			boolean flag1 = f1.createNewFile();
			System.out.println("f1이 생성되었는가 : " + flag1);
		}
		
		if(dir.exists()) {
			boolean flag2 = dir.delete();
			System.out.println("dir가 삭제 되었는가" + flag2);
		}
		
		System.out.println("f1이 존재하는거 : " + f1.exists());
		System.out.println("f1이 읽기 가능한가 : " + f1.canRead());
		System.out.println("f1이 쓰기 가능한가: " + f1.canWrite());
		System.out.println("f1이 실행 가능한가 : " + f1.canExecute());
		System.out.println("f1이 파일인가 : " + f1.isFile());
		System.out.println("f1이 디렉토리(폴더)인가 : " + f1.isDirectory());
		System.out.println();
		
		
		
		
		
	}
}
