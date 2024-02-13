package collection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("한국배우목록.txt");			// 파일이름을 전달하여 파일 객체를 생성한다
		Scanner sc = new Scanner(f);				// 파일을 읽어들이는 Scanner
		ArrayList<String> list = new ArrayList<>();	// 문자열을 저장할 list
		while(sc.hasNextLine()) {		// 아직 처리하지 않은 다음 줄이 남아 있다면
			list.add(sc.nextLine());	// 그 줄의 내용을 문자열로 가져와서 리스트에 추가한다
		}
		sc.close();
		
		System.out.println(list);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String name : list) {
			String familyName = name.substring(0, 1);
			map.put(familyName, map.getOrDefault(familyName, 0) + 1);
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			int value = map.get(key);
			list2.add(key + ":" + value);
		}
		System.out.println();
		
		list2.sort((a, b) -> {
			int aCnt = Integer.parseInt(a.split(":")[1]);
			int bCnt = Integer.parseInt(b.split(":")[1]);
			return bCnt - aCnt;
		});
		
		int total = 0;
		for(String s : list2) {
			int count = Integer.parseInt(s.split(":")[1]);
			System.out.printf("%s씨는 %s명입니다\n", s.split(":")[0], count);
			total += count;
		}
		System.out.println("처음 불러온 파일에서의 데이터 개수 : " + list.size());
		System.out.println("성씨로 분류한 인원의 총 합계 : " + total);
		System.out.println(list.size() == total);
		
		
	}
}



