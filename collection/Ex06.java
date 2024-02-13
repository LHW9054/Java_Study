package collection;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		// Set : 순번이 없고, 값의 중복을 허용하지 않는다.
		
		HashSet<Integer> set = new HashSet<>();
		// Generic Type에서 primitive 타입을 지정할수 없다.
		// 대신 Wrapper class를 이용하여 지정할수 있다.
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		
		System.out.println(set);
		
		// 순번이 없어서, 특정값을 지정해서 불러올수 없다.
		// System.out.println(set.get(0));
		
		for(Integer num : set) {
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("set.size() = " + set.size());
		
	}
}
