package day21;

public class PhoneBookInfo {
	
	private String name;
	private int age;
	private String pnum;
	
	public PhoneBookInfo(String name, int age, String pnum) {
		this.name = name;
		this.age = age;
		this.pnum = pnum;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %s", name, age, pnum);
	}
	
	public PhoneBookInfo() {}

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
