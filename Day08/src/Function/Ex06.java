package Function;

public class Ex06 {
	public static void main(String[] args) {
		
		System.out.println("args.length : " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] : %s\n", i, args[i]);
		}
		
		// lower case, upper case
		if(args.length > 0) {
			switch(args[0]) {
			case "/l" : System.out.println("hello world"); break;
			case "/u" : System.out.println("HELLO WORLD"); break;
			default : System.out.println("Hello World");
			}
		}
		
		System.out.println("끝");
	}

}
