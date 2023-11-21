package oop;
// 기존에 없던, 내가 새로 정의한 자료형(클래스)
class kid{
	// 서로 다른 자료형의 변수
	String name;
	double high;
	
	//함수
	void show() {
		System.out.printf("%s의 키는 %,1fcm입니다.\n",name,high);
	}
	
	void setdata(String name, double high) {
		this.name = name;
		this.high = high;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		kid o1 = new kid();
		kid o2 = new kid();
		kid o3 = new kid();
		kid o4 = new kid();
		kid o5 = new kid();
		
		o1.setdata("짱구", 105.9);
		o2.setdata("유리", 104.2);
		o3.setdata("훈이", 106.2);
		o4.setdata("맹구", 113.9);
		o5.setdata("철수", 108.7);
		
		// 같은 자료형(kid)의 데이터가 여러개 있으므로, 배열로 묶을 수 있다.
		kid[] arr = {o1,o2,o3,o4,o5};		//배열준비
		
		for(int i = 0; i<arr.length; i++) {	//순차출력
			arr[i].show();
		}
		System.out.println();
		
		// 
		for(int i = 0; i<arr.length;i++) {	// 선택정렬
			for(int j = i+1; j <arr.length;j++) {
				if(arr[i].name.compareTo(arr[j].name) > 0) {
					kid tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i = 0; i <arr.length;i++) {	//결과출력
			arr[i].show();
		}
		System.out.println();
		
	}
}
