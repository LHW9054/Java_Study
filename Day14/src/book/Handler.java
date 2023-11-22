package book;

public class Handler {

	// 객체들의 저장공간
	private Book[] arr = new Book[10];
	
	// 전체 목록 반환
	public Book[] selectList() {
		return arr;
	}
	
	// 추가
	public int add(Book book) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = book;
				row = 1;
				break;
			}
		}
		return row;
	}
	
	// 검색 (이름 포함으로 검색)
	public Book[] searchList(String keyword) {	// 검색어를 전달받는다
		int cnt = 0;	// 검색어를 포함하는 도서가 총 몇개인지 기록할 변수
		for(int i = 0; i < arr.length; i++) {	// 저장된 데이터 중에서
			
			if(arr[i] != null && 
					(arr[i].getName().contains(keyword) || 
					 arr[i].getAuthor().contains(keyword))) {
				cnt += 1;	// 개수를 1 증가시킨다
			}
		}
		Book[] result = new Book[cnt];	// 검색어 포함 도서 개수만큼 배열을 생성하여
		int index = 0;	// 결과 배열에 담을 index
		
		for(int i = 0; i < arr.length; i++) {	// 저장된 데이터 중에서
			if(arr[i] != null && 
					(arr[i].getName().contains(keyword) || 
					 arr[i].getAuthor().contains(keyword))) {	
				result[index++] = arr[i];	// 해당 도서를 결과배열의 index번째에 대입한다
			}
		}
		return result;	// 결과 배열을 반환한다
	}
	
	// 삭제 (이름 일치로 삭제)
	public int delete(String name) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null;
				row = 1;
				break;
			}
		}
		return row;
	}
}
