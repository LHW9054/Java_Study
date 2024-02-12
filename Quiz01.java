package static_final;

class Card {

	private char kind;	// 스페이드, 클로버, 하트 (객체마다 서로 다른 값)
	private int num;	// 카드 숫자 (객체마다 서로 다른 값)
	private static int width;	// 카드의 가로 너비 (여러 객체가 같은 값을 공유해야 한다)
	private static int height;	// 카드의 세로 높이 (여러 객체가 같은 값을 공유해야 한다)
	private String p;	// 객체마다 서로 달라야 한다

	public void setCardProperty(char kind, int num) {
		this.kind = kind;
		this.num = num;
		if (kind == 'H')			p = "♥";
		else if (kind == 'S')		p = "♠";
		else if (kind == 'C')		p = "♣"; // 다이아는 형태 깨져서 안만듬
	}

	public void showCard() {
		System.out.println("[" + kind + num + " CARD]");
		for (int i = 0; i < height; i++) {
			if (i == 0)					System.out.print("┌");
			else if (i == height - 1)	System.out.print("└");
			else						System.out.print("│");// 줄의 가장 왼쪽

			if (i == 0 || i == height - 1) // 줄의 가운데 부분 출력
				for (int j = 0; j < width; j++)
					System.out.print("─");
			else {
				for (int j = 0; j < width; j++) {
					if (j == width / 2 && (i >= height / 2 - num / 2 && i <= height / 2 + num / 2)) {
						if (num % 2 == 0 && i == height / 2)
							System.out.print(" ");
						else
							System.out.print(p);
					} else
						System.out.print(" ");
				}
			}

			if (i == 0)					System.out.print("┐");
			else if (i == height - 1)	System.out.print("┘");
			else						System.out.print("│");
			System.out.println();
		}
	}
//객체를 생성하지 않아도 클래스로 접근할수 있다.
	public static void setSize(int i) {	
		// Set_Size에서 가로 세로 값을 할당
		width = i;
		height = i;
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		// 객체를 생성하기 전에 미리 카드의 크기를 결정하고
		// 이후 같은 크기로 카드들을 생성합니다
		
		Card card1 = new Card(); // 하나의 클래스로 서로 다른 객체를 생성한 경우
		Card card2 = new Card(); // 객체들이 같은 값을 갖게 만들고 싶다면
		Card card3 = new Card(); // static을 활용하면 된다
		
		card1.setSize(3);
		card2.setSize(7);
		card3.setSize(5);

		card1.setCardProperty('H', 5);
		card1.showCard();
		card2.setCardProperty('C', 5);
		card2.showCard();
		card3.setCardProperty('S', 5);
		card3.showCard();
	}
}
