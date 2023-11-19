package nestedArray;

import java.util.Arrays;
/*System.out.print 명령을 통해 배열값을 출력하기위해서는
 * java.util.Arrays를 import하고 Arrays.toString( )을 사용하면 된다.
 */
import java.util.List;

public class Ex07 {
	
	static void show(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1 ? "]\n" : ", ");
		}
	}
	
	public static void main(String[] args) {
		
////////숫자 배열 ///////////////////////////////////////////////////////
		// selection sort (선택 정렬)
		// 배열이나 리스트 등, 여러 요소가 선형으로 배치된 구조에서
		// 값의 크기를 비교하여 n번째 자리에 가장 적합한 값을 선택하여 배치하는 정렬방식
		
		int[] arr = { 4, 8, 2, 7, 6 };
		show(arr);// 함수에 실행 하게 만든 메인안에 있는 함수 
		
		// 서로 다른 두 값의 크기 비교가 필요하다
		// 크기를 비교하여 내가 원하는 기준(오름차순)에서 벗어나면 자리를 교체한다
		// 두 변수의 값을 교환하기 위해서는 임시 변수가 하나 더 필요하다
		// 두 값을 각각 지정하기 위해서, i번째 값과 j번째 값을 순환시켜야한다
		
		for(int i = 0; i < arr.length -1; i++) {// -1인 이유는 마지막은 더 비교할 필요가 없기 때문
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] - arr[j] > 0) {
					int tmp = arr[i];		//변수선언
					arr[i] = arr[j];
					arr[j] = tmp;
//					show(arr);
				}
			}
		}
		show(arr);
		System.out.println();
/////////////////////////////////////////////////////////////////////
		
////////문자배열///////////////////////////////////////////////////////
		String[] arr2 = { "신짱구", "한유리", "김철수", "이훈이", "맹구" };
		
		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < arr2.length - 1; i++) {	// 0, 1, 2, 3 [기준]
			for(int j = i + 1; j < arr2.length; j++) {	// i보다 1큰값부터 끝까지 [대상]
				if(arr2[i].compareTo(arr2[j]) > 0) {	// arr2[i] - arr2[j] > 0
					String tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		// 이후 컬렉션에서 이루어지는 다른 정렬에서도
		// 실제 구현 내용은 다르지만
		// 두 값의 크기를 비교한다는 원리는 변하지 않는다
		
		List<String> list = Arrays.asList(
				new String[]{ "신짱구", "한유리", "김철수", "이훈이", "맹구" }
		);
		System.out.println(list);
		list.sort((a, b) -> a.compareTo(b));
		System.out.println(list);
		
		
		
		
		
	}
	
}
