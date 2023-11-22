package student;

// 학생관리 프로그램에서 1명의 학생정보를 저장할 객체의 클래스를 구성합니다.
// 이름, 국어, 영어, 수학, 합계, 평균 정보를 저장합니다.(실수, 소수점둘째자리까지 출력) 정보를 저장합니다.
// 생성자에서는 이름과 국영수 점수만 전달 받습니다.
// 국영수 점수를 이용하여 합계와 평균을 계산하여 저장합니다.
// show() 함수를 작성하여 이름과 합계및 평균을 화면에 출력합니다.
// 필드는 private, 생성자와 메서드는 public으로 설정합니다.


/////내가//////////////////////////////////////////////////////////////
//public class Student {
//	private String name;
//	private int kor, mat, eng;
//	private float sum, avg;
//	
//	void name(String name) {
//		this.name = name;
//		show();
//	}
//	
//	float sum (int kor, int mat, int eng) {
//		this.kor = kor;
//		this.mat = mat;
//		this.eng = eng;
//		return sum;
//	}
//	
//	float avg(float sum) {
//		this.sum = sum;
//		avg = sum/3;
//		return avg;
//	}
//	
//	public void show() {
//		System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
//		System.out.printf("◀%s의 국어점수는 %d▶",name, kor);
//		System.out.printf("◀%s의 수학점수는 %d▶",name, mat);
//		System.out.printf("◀%s의 영어점수는 %d▶",name, eng);
//		System.out.printf("◀%s의 합계점수는 %f▶",name, sum);
//		System.out.printf("◀%s의 평균점수는 %.2f▶",name, avg);
//		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
//	}
//////////////////////////////////////////////////////////////////////
	
/////강사님/////////////////////////////////////////////////////////////
	public class Student{
		private String name;
		private int kor;
		private int mat;
		private int eng;
		private int sum;
		private double avg;
		
		public Student(String name, int kor, int eng, int mat) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
			this.sum = kor + eng + mat;
			avg = sum / 3.0;
	}
		
		public void show() {
			System.out.printf("%s) 합계 : %d, 평균 : %.2f\n", name, sum, avg);
		}
		
		public String getName() {
			return name;
		}
		
		
//////////////////////////////////////////////////////////////////////

}
