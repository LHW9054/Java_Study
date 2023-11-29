package product;

import java.util.Arrays;
import java.util.Comparator;

public class Handler {
	// { f, f, i, i, null, null ... }
	Product[] arr = new Product[10];		//Food or industrialproduct를 담을 배열
	
	Object[] compArray = new Object[4];
	
//	public Handler() {
//		Comparator<Product> comp1 = (a, b) -> a != null && b != null ? a.name.compareTo(b.name) : 0;
//		Comparator<Product> comp2 = (a, b) -> a != null && b != null ? b.name.compareTo(a.name) : 0;
//		Comparator<Product> comp3 = (a, b) -> a != null && b != null ? a.price - b.price : 0;
//		Comparator<Product> comp4 = (a, b) -> a != null && b != null ? b.price - a.price : 0;
//		compArray[0] = comp1;
//		compArray[1] = comp2;
//		compArray[2] = comp3;
//		compArray[3] = comp4;
//	}

	// 전체 목록
	public Product[] selectAll() {	// selectall메서드는 product 클래스 배열에 
		return arr;					// arr값을 반환해줘
	}

	// 추가
	public int insert(Product tmp) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = tmp;
				row = 1;
				break;
			}
		}
		return row;
	}

	
	
	
	
	
	// 검색
	public Product[] search(String search) {
		Product[] ret = null;
		int length = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			Product p = arr[i];
			// 상품(p)의(.) 이름(name)이 검색어(search)를 포함(contains)하면
			if(p != null && p.name.contains(search)) {	
				length++;
			}
		}
		
		ret = new Product[length];
		length = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.contains(search)) {
				ret[length++] = arr[i];
			}
		}
		
		return ret;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 삭제
//	row = handler.delete(name);
	public int delete(String search) {
					//메임함수에서 name변수의 값을 받아옴 그 네임 변수이름이 search로 바
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(search)) {
				// arr[i]번째의 값이널값이 아니고
				// arr[i]의 .name => product의 네임값과 search를 비교 했을때 같아면
				// && => 두값이 참일때 참!
				arr[i] = null;
				// 위에 그 arr[i]의 값은null이다.
				row += 1;
				//그리고 로우의 값은 1이다.
			}
		}
		return row;
		// 로우의 값을 반
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	// 정렬
//	@SuppressWarnings("unchecked")	// 타입이 확인되지 않은 다운캐스팅에 대하여 경고를 억제한다
	public Product[] sort(int option) {	
		// 1) 람다식 Comparator
//		Arrays.sort(arr, (a, b) -> (a != null && b != null) ? a.name.compareTo(b.name) : 0);
		
//		 2) 익명 클래스
		Arrays.sort(arr, new Comparator<Product>() {
			@Override
			public int compare(Product a, Product b) {
				if(a != null && b != null) {
					return a.name.compareTo(b.name);
				}
				return 0;
			}
		});
		
//		if(0 <= option && option < compArray.length) {
//			Arrays.sort(arr, (Comparator<Product>)compArray[option]);
//		}
		return arr;
	}
	

}









