package Socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	static String getLocalIpaddr() throws Exception{
		
		Runtime rt = Runtime.getRuntime();		// 운영체제에 명령을 전달할수 있는 객체
		Process pro = rt.exec("ipconfig");		// 명령을 실행하여 프로세스를 지정함
		InputStream is = pro.getInputStream();	// 명령의 결과를 내 프로그램에 가져오는 입력 통로 개설
		Scanner sc = new Scanner(is, "CP949");	// 입력통로의 내용을 지정한 인코딩으로 읽어오는 Scanner
		
		while(sc.hasNextLine()) {				// 처리하지 않은 줄이 있으면
			String line = sc.nextLine();		// 불러와서
			if(line.contains("IPv4")) {			// "IPv4"를 포함 한다면
				sc.close();						// Scanner를 close하고
				return line.split(" : ")[1];	// 결과에서 " : " 를 기준으로 분리한 오른쪽 값을 반환
			}
		}
		sc.close();
		return null;
		
	}
	
	public static void main(String[] args) throws Exception{
		
		String localAddr = getLocalIpaddr();
		System.out.println(localAddr);
		
		ServerSocket ss = new ServerSocket(7777);
		
		System.out.println("접속 대기중...");
		Socket so = ss.accept();
		
		String remoteAddr = so.getInetAddress().toString();
		System.out.println(remoteAddr+" 에서 접속함");
		
		Scanner sc = new Scanner(so.getInputStream());
		String data = sc.nextLine();
		System.out.println(remoteAddr + " : " + data);
		sc.close();
		sc.close();
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
