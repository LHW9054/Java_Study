package string;

public class Quiz2 {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		String[] new_ids = {
				"...!@BaT#*..y.abcdefghijklm", 
				"z-+.^.", 
				"=.=", 
				"123_.def", 
				"abcdefghijklmn.p"
		};
		String[] results = {
				"bat.y.abcdefghi", 
				"z--", 
				"aaa", 
				"123_.def", 
				"abcdefghijklmn"
		};
		
		for(int i = 0; i < new_ids.length; i++) {
			String new_id = new_ids[i];
			String result = results[i];
			System.out.println(s.solution(new_id).equals(result));
			System.out.println();
		}
	}
}
