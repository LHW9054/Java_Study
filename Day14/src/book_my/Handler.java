package book_my;

public class Handler {
	
	private Book[] book = new Book[5];	// 담은 책은 5권
	
	
	public String add(Book name, Book writer) {
		for(int i = 0; i <= book.length; i++) {
			if(book[i] == null) {
				book[i] = name;
				break;
				}
			}
		return null;
		}
	
	
////	public String search (String keyword) {
//		for(int i = 0; i < book.length; i++) {
//			if(book[i] != null && book[i].equals(book[i])) {
//				return book[i].toString();
//			}
//		}
//	}
//	
//	public Book[] getArray(){
//		return book;
//	}
//	
//	public String getname() {
//		return book;
//	}	
//	
//	public int review(int grade) {
//		int ab = 1;
//		for(int i =0; i < book.length; i++) {
//			if(book[i] =)
//		}
//	}
//	
//	
//	
//	public void show() {
//		System.out.printf("책이름 : %s\n저자 : %s\n출판일자 : %s\n평점 : %.1f\n가격 : %s\n");	
//		}
	
	
	
}
