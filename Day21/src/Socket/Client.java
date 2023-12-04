package Socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		String target;
		String data;
		
		System.out.print("접속할 서버의 IP를 입력 : ");
		target = sc.nextLine();
		
		Socket so = new Socket(target, 7777);
		PrintWriter pw = new PrintWriter(so.getOutputStream());
		
		System.out.println("보낼 메시지 입력 : ");
		data = sc.nextLine();
		
		pw.write(data);
		pw.flush();
		pw.close();
		pw.close();
		pw.close();
		
	}
}
