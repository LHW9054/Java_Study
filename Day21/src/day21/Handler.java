package day21;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handler {

	private ArrayList<PhoneBookInfo> list = new ArrayList<>();
	private final String fileName = "phonebook.txt";
	
	// 저장
	public void save() throws Exception {
		// 1) 파일을 대상으로 하는 출력 통로를 개설해야 한다
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		
		// 2) FileWriter 객체를 이용하여 문자열을 기록한다
		// 문자열은 어디서 불러올 것인가? (어떤 내용을 기록하고 싶은가?)
		for(int i = 0; i < list.size(); i++) {	// 리스트의 길이만큼 반복
			PhoneBookInfo ob = list.get(i);		// 리스트의 i번째 객체를
			fw.write(ob.toString() + "\n");		// 문자열 형태로 한줄씩 기록
		}
		fw.flush();
		
		// 3) 데이터를 모두 보냈다면, 사용이 끝난 통로를 닫아준다
		fw.close();
	}
	
	// 불러오기
	public void load() throws Exception {
		File f = new File(fileName);
		if(f.exists() == false) {		// 만약 파일이 없다면
			f.createNewFile();			// 지정한 이름으로 파일을 생성하고
			return;						// 불러오는 내용은 수행하지 않는다(어차피 내용이 없다)
		}
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String name = line.split(", ")[0];
			int age = Integer.parseInt(line.split(", ")[1]);
			String pnum = line.split(", ")[2];
			list.add(new PhoneBookInfo(name, age, pnum));
		}
		sc.close();
	}
	
	// 전체 목록
	public List<PhoneBookInfo> select() {
		return list;
	}
	
	// 추가
	public int insert(PhoneBookInfo ob) {
		return list.add(ob) ? 1 : 0;
	}
	
	// 검색
	
	// 삭제
}
