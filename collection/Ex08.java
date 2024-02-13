package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex08 {
	public static void main(String[] args) {
		// Map : key와 value를 1:1 맵핑하여 저장한다
		//		 Map의 key는 array의 index 역할을 한다
		//		 index는 항상 0부터 시작하는 정수이지만
		//		 key는 원하는 임의의 값을 넣을 수 있다
		//		 index와 마찬가지로 key가 중복되는 경우는 없다
		//		 value는 중복이 가능하다
		//		 key를 이용하여 value에 접근할 수 있다
		//		 value를 이용하여 역으로 key를 조회할 수는 없다
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("name", "이지은");
		map.put("age", "30");
		map.put("birth", "1993-05-16");
		System.out.println(map);
		
		map.put("age", "31");
		System.out.println(map);
		
		System.out.println("map.size() : " + map.size());
		System.out.println();
		
		// key를 이용하여 value를 가져와서 출력하기
		System.out.println("map.get(\"name\") : " + map.get("name"));
		System.out.println("map.get(\"age\") : " + map.get("age"));
		System.out.println("map.get(\"birth\") : " + map.get("birth"));
		
		// key를 알면 value를 구할 수 있으나, value를 안다고 해서 key를 구할 수는 없다
		System.out.println("map.get(\"이지은\") : " + map.get("이지은"));
		System.out.println("map.get(\"31\") : " + map.get("31"));
		System.out.println("map.get(\"1993-05-16\") : " + map.get("1993-05-16"));
		System.out.println();
		
		// map에서 key의 모음 혹은 value의 모음을 추출할 수 있다
		// keyset은 Set의 특성을 그대로 가진다 (순서가 없고, 중복이 없다)
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			// key를 알면 value를 구할 수 있다
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// values는 중복될 수 있다
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		System.out.println();
		
		// 순환자의 형태로 key를 제공하는 경우도 있다
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {			// 아직 조회하지 않은 다음 값이 있으면
			String key = it.next();		// 그 다음 값을 하나 불러와서
			String value = map.get(key);// key에 맞는 value를 구하고
			System.out.println(key + " : " + value);	// 같이 출력한다
		}
		System.out.println();
		
		// 만약, 잘못된 key를 넣었을 경우 null 대신 다른 값을 기본값으로 사용할 수 있다
		// null은 다른 연산을 수행할 수 없는 경우가 대부분이기 때문에 사용한다
		
		String testKey = "present";
		String t1 = map.get(testKey);
		String t2 = map.getOrDefault(testKey, "없음");
		
		System.out.println(testKey + " : " + t1);
		System.out.println(testKey + " : " + t2);
		System.out.println();
		
	}
}






