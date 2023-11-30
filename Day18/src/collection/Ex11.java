package collection;

import java.util.HashMap;

public class Ex11 {
	public static void main(String[] args) {
		
		// 1부터 1000 사이의 정수 중에서
		// 3의배수, 5의배수, 7의 배수의 개수를 각각 구하세요
		
		HashMap<String, Integer> map= new HashMap<>();
		
		for(int i = 0; i<=1000; i++) {
			if(i%3==0) {
				map.put("3의배수", map.getOrDefault("3의배수",0) +1);
			}
			if(i%5==0) {
				map.put("5의배수", map.getOrDefault("5의배수",0) +1);
			}
			if(i%7==0) {
				map.put("7의배수", map.getOrDefault("7의배수",0) +1);
			}
		}
		System.out.println(map);
		
		
		
		
		
		
		
		
	}
}
