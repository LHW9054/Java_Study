package book_my;

// 도서 관리 프로그램에서 다룰 도서를 나타내는 클래스
// 도서 제목	(문자열)
// 저자		(문자열)
// 출판일자	(문자열)
// 평점		(실수, 소수점 첫째자리 까지)
// 가격		(정수, 출력시 천단위 구분기호를 포함)
public class Book {
	
	private String name;		// 책이름
	private String writer;		// 저자
	private String pub;			// 출판일자
	private float grade;		// 평점
	private int price;			// 가격
	
	public Book(String name, 
				String Writer, 
				String pub, 
				float grade, 
				int price) {
		
		this.name = name;
		this.writer = writer;
		this.pub = pub;
		this.grade = grade;
		this.price = price;
	}
	
	
}
