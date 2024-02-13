package collection;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
	/*
		연구실에 있는 총 N마리의 폰켓몬 중에서 N/2마리를 가져도 좋다
		최대한 많은 종류의 폰켓몬을 포함하여 N/2마리를 선택해야 한다
		
		N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법에서
		폰켓몬 종류번호의 개수를 return
	 */
	public int solution(int[] nums) {
		int answer = 0;
		
//		HashMap<String, Integer> map = new HashMap<>();
//		for(int num : nums) {
//			map.put(num + "번 폰켓몬", map.getOrDefault(num + "번 폰켓몬", 0) + 1);
//		}
//		System.out.println(map);
		
		HashSet<Integer> set = new HashSet<>();
		for(int num : nums) {
			set.add(num);
		}
		
		int n = nums.length / 2;	// 전체 마릿수의 절반만 가져갈 수 있다
//		int m = map.size();			// 중복이 없기 때문에 마릿수가 아니라 종류수만 체크한다
		int m = set.size();			// map에서 value의 역할이 없어서 set으로 바꿔서 작성함
		
		answer = n > m ? m : n ;
		return answer;
	}
}

public class Programmers1845 {
	// 1845번. 폰켓몬
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int[] nums1 = { 3, 1, 2, 3 };		// 4마리, 3종류
											// 4/2 = [2] < 3종류
		
		int[] nums2 = { 3, 3, 3, 2, 2, 4 };	// 6마리, 3종류
											// 6/2 = [3] < 3종류
		
		int[] nums3 = { 3, 3, 3, 2, 2, 2 };	// 6마리, 2종류
											// 6/2 = 3 > [2]종류
		
		int ret1 = 2;
		int ret2 = 3;
		int ret3 = 2;
		
		System.out.println("test1 : " + (s.solution(nums1) == ret1));
		System.out.println("test2 : " + (s.solution(nums2) == ret2));
		System.out.println("test3 : " + (s.solution(nums3) == ret3));
	}
}



