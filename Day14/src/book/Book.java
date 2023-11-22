package book;

// 도서 관리 프로그램에서 다룰 도서를 나타내는 클래스
// 도서 제목	(문자열)
// 저자		(문자열)
// 출판일자	(문자열)
// 평점		(실수, 소수점 첫째자리까지)
// 가격		(정수, 출력시 천단위 구분기호를 포함)

public class Book {
	
	private String name;
	private String author;
	private String publishDate;
	private double score;
	private int price;
	
	public Book(String name, String author, String publishDate, double score, int price) {
		this.name = name;
		this.author = author;
		this.publishDate = publishDate;
		this.score = score;
		this.price = price;
	}
	
	public void show() {
		System.out.println("도서이름 : " + name);
		System.out.printf("%s, %s, %.1f, %,d원\n\n", author, publishDate, score, price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
