package Phonebook;

//	NAME    VARCHAR2(100) 
//	AGE     NUMBER        
//	PNUM    VARCHAR2(20)

public class DTO {
	// Data Transfer Object : 데이터를 이동시키기 위한 클래스, 단일 데이터의 형식을 정의한다
	
	// 테이블의 컬럼과 자료형을 클래스의 필드로 구성한다
	private String name;
	private int age;
	private String pnum;
	
	// 객체를 출력할 때 원하는 문자열 형식으로 변경하기 위한 toString()
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", name, age, pnum);
	}
	
	// private 필드로 구성하고, getter/setter를 작성한다
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	
	
	

	
}
