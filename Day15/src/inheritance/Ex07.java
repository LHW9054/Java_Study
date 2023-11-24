package inheritance;

class Human{
	String name;			// 필드
	
	Human(String name){		// 생성자
		this.name = name;
	}
	void show() {			// 메서드
		System.out.println("이름 :  "+ name);
		System.out.println();
	}
}

class Student extends Human{	//학생은 사람이다.
	String school;
	Student(String name, String school){
		super(name);
		this.school = school;
	}
	@Override
	void show() {
		System.out.println("소속 : " + school);
		System.out.println("이름 : " + name);
		System.out.println();
	}
}

class Actor extends Human{	// 배우는 사람이다.
	String drama;
	Actor(String name, String drama){
		super(name);
		this.drama = drama;
	}
	@Override
		void show() {
		System.out.println("출연작 : " + drama);
		System.out.println("이름 : " + name);
		System.out.println();
//			super.show();
	}
}

class Car {
	Human[] seat = new Human[4];
	
	void entrance(Human ob) {
		for(int i = 0; i < seat.length; i++) {
			if(seat[i] == null) {
				seat[i] = ob;
				return;
			}
		}
		System.out.println(ob.name + "자리가 없습니다.!!");
	}
	
	void checkPeople() {
		for(int i = 0; i < seat.length; i++) {
			if(seat[i] != null) {
				seat[i].show();
			}
		}
	}
	
}



public class Ex07 {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		Student st1 = new Student("안지혜", "KGITBANK");
		Student st2 = new Student("이현우", "KGITBANK");
		
		Actor ac1 = new Actor("송승헌", "가을동화");
		Actor ac2 = new Actor("마동석", "범죄도시3");
		
		Human driver = new Human("한문철");
		
		car.entrance(driver);
		car.entrance(st1);		// 인자의 자료형은 서브클래스이지만
		car.entrance(st2);		// 배개변수의 자료형이 슈퍼클래스 이므로
		car.entrance(ac1);		// 함수를 호출하면서 업캐스팅이 발생한다.
		car.entrance(ac2);
		
		
		Human t1 = ac1; // 서브클래스의 객체를 슈퍼클래스 타입으로 참조한다.(업캐스팅)
		Human t2 = st1;	// 각각다른 타입의 객체를 묶어서 처리하고 싶을때
		
		car.checkPeople();
		
		// 업캐스팅상태에서 오버라이딩 메서드를 호출해도
		// 서브클래스에서 재정의한 내용으로 실행된다.
		
		// 1) 함수호출이 가능한가?
		// 현재 슈퍼클래스에서 show() 메서드가 정의되어 있으므로 호출 가능
		
		// 2) 내용은 어떻게 실행되는가?
		// 객체를 참조하는 타입만 업캐스팅 되었고, 객체가 가지는 내용은 변하지 않는다.
		// 객체는 오버라이딩 메서드를 가지고 있어서, 자료형에 맞는 내용으로 실행된다.
		
		// 자바 객체지향의 4가지 특성
		// 1) 캡슐화	: 서로 다른 자료형의 변수와 함수를 하나의 객체로 묶어서 취급한다.
		// 2) 상속	: 기존 클래스를 활용하여 새로운 클래스를 작성한다.
		// 3) 추상화	: 실제 객체에서 필요한 부분만 가져와서 클래스의 형태로 구현한다.
		// 			  형태만 있고, 내용이 없는 함수를 만들어서 이후에 구현한다.
		// 4) 다형성	: 하나의 객체는 슈퍼클래스로 참조되거나, 서브클래스로 참조될수 있다.
		
		
	}
}
