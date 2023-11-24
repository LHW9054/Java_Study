package object;

class Student /* extends Object */ {
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	public Student(String name, int k, int e, int m) {
		this.name = name;
		kor = k;
		eng = e;
		mat = m;
		sum = k + e + m;
		avg = sum / 3.0;
	}
	public void show() {
		System.out.printf("%s] %3d, %3d, %3d, %3d, %.2f\n", 
				name, kor, eng, mat, sum, avg);
	}
	
	@Override
	public String toString() {
		String format = "%s] %3d, %3d, %3d, %3d, %.2f\n";
		Object[] args = { name, kor, eng, mat, sum, avg };
		String s = String.format(format, args);
		return s;
	}
}
public class Ex09 {
	public static void main(String[] args) {
		
		Student s1 = new Student("짱구", 11, 12, 13);
		Student s2 = new Student("유리", 21, 22, 23);
		
		s1.show();
		System.out.println(s2);
	}
}









