package input;

import java.io.*;

public class Ex08 {
	//입력
	public static void main(String[] args) throws IOException{
		
		int num;
		System.err.println("에러출력스트림");
		System.out.println("표준출력스트림");
		System.out.print("글자 하나 입력 (1바이트) : ");
		num = System.in.read();
		
		System.out.printf("num : %c, %d\n", num, num);
		
//		int num2;
//		System.out.print("다시 한글자 입력 (1바이트) : ");
//		num2 = System.in.read();
//		System.out.printf("num : %c, %d\n",num ,num);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.print("한글자 입력 (2바이트) : ");
		int num3 = isr.read();
		System.out.printf("num2 : %c, %d\n", num3, num3);
		
		// 2바이트 입력객체를 기반으로 줄단위(버퍼단위)입력객체를 생성
		BufferedReader br = new BufferedReader(isr);
		br.readLine();	//이전까지 입력한 내용 버리기
		
		System.out.print("문장 입력 : ");
		String str = br.readLine();
		System.out.println("str : " + str);
		
		//위 과정을 간편화 하고, 어느정도의 예외까지 내장처리하게 만든 클래스가 Scanner
		//Scanner 를 이용하면 편리하게 입력받을수 있다.
		
	}
}
