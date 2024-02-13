package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random ran = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 1 ~ 45사이의 중복없는 숫자 6개를 뽑아서 오름차순으로 정렬하여 한줄에 출력ㅎ사세요
		
		// 반복횟수를 5번으로 설정하면, 중복이 발생했을 경우 결과 개수가 부족하다.
//		for(int i = 0; i < 6; i++) {
//			int num = ran.nextInt(45) +1;
//			System.out.println("num = " + num);
//			set.add(num);
//		}
		
		
		
		while(true) {	// set.size() !=6
			int num = ran.nextInt(45) +1;
			System.out.println("num = " + num);
			set.add(num);
			if(set.size() == 6) {
				break;
			}
		}
		System.out.println("set = " + set);
		
//		for(int num : set) {	// 1) 향상된 for문으로 추가하기
//			list.add(num);
//		}
		
//		set.forEach(num -> list.add(num));	// 2) forEach 메서드 사용하기
		
		list = new ArrayList<Integer>(set);	// 3) 생성자 매개변수에 전달하기
		
		System.out.println("list = " + list);
		
		list.sort(null);
		//java.lang.Integer 클래스는 Comparable 한 클래스다.
		
		System.out.println("list = " + list);
		
	}
}
