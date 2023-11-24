package abstractClass;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06 {
	public static void main(String[] args) {
		
		// 인터페이스도 추상클래스에 속하기 때문에, 익명 내부 클래스 문법을 사용할 수 있다
		Runnable run1 = new Runnable() {
			@Override
			public void run() {				// 매개변수의 개수가 0 (생략 불가)
				System.out.println("run1");	// 코드가 한줄 (생략 가능)
			}
		};
		run1.run();
		
		// 람다식을 사용하면 아래와 같이 생성한다
		Runnable run2 = () -> { System.out.println("run2"); };
		run2.run();
		
		// 람다식 기본 형식 : () -> {}
		// () : 함수의 매개변수를 작성하는 공간, 매개변수가 하나라면 ()를 생략한다
		// -> : 람다식 기호
		// {} : 함수의 실행 내용 (body), 실행코드가 한줄이면 {}를 생략한다
		// 		한줄의 실행코드가 return이면 return도 생략한다
		
		Comparable<String> comp1 = new Comparable<String>() {
			@Override
			public int compareTo(String o) {// 매개변수 1개 (생략 가능)
				return "hello".compareTo(o);// 실행코드 1줄 (생략 가능)
			}
		};
		
		int res1 = comp1.compareTo("Hello");
		System.out.println("res1 : " + res1);
		
		Comparable<String> comp2 = o -> "hello".compareTo(o);
		
		int res2 = comp2.compareTo("Hello");
		System.out.println("res2 : " + res2);
		Integer n1 = 10;
		Integer n2 = 20;
		
		Comparator<Integer> comp3 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		};
		int res3 = comp3.compare(n1, n2);
		System.out.println("res3 : " + res3);
		
		Comparator<Integer> comp4 = (o1, o2) -> -o1.compareTo(o2);
		int res4 = comp4.compare(n1, n2);
		System.out.println("res4 : " + res4);
		
		// comparator 활용
		Integer[] arr = { 4, 8, 2, 7, 6 };
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, comp4);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, (a, b) -> a - b);	// if(arr[i] - arr[j] > 0)
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}



