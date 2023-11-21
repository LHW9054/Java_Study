package oop;

public class Ex01 {
	public static void main(String[] args) {
		String[] namearray = {"짱구","유리","훈이","맹구","철수",};
		double[] higharray = {105.9, 104.2, 106.2, 113.9, 108.7};
		
		for(int i = 0; i<5; i++) {
			String name = namearray[i];
			double high = higharray[i];
			System.out.printf("%s의 키는 %.1fcm입니다.\n", name, high);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 위 배열 데이터를 이용하여 이름 기준 오름차순으로 정렬하고 다시 출력하세요
////////내가한거////////////////////////////////////////////////////////////
//		//애들이름
//		for(int i = 0; i < namearray.length-1; i++){
//			for(int j = i+1; j < namearray.length; j++) {
//				if(namearray[i].compareTo(namearray[j]) > 0) {//compare문 몰라서 못씀 그래서 못품
//					String tmp1 = namearray[i];
//					namearray[i] = namearray[j];
//					namearray[j] = tmp1;
//				}
//			}
//		}
//		
//		//애들키
//		for(int i = 0; i < higharray.length-1; i++){
//			for(int j = i+1; j < higharray.length; j++) {
//				if(higharray[i] > higharray[j]) {
//					double tmp2 = higharray[i];
//					higharray[i] = higharray[j];
//					higharray[j] = tmp2;
//				}
//			}
//		}
//		
//		for(int i = 0; i<5; i++) {
//			String name = namearray[i];
//			double high = higharray[i];
//			System.out.printf("%s의 키는 %.1fcm입니다.\n", name, high);
//		}
//		
//		
//////////////////////////////////////////////////////////////////////////
		
///////강사님////////////////////////////////////////////////////////////
		
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 1 ;j++) {
				if(namearray[i].compareTo(namearray[j]) > 0) {
					String t1 = namearray[i];
					namearray[i] = namearray[j];
					namearray[j] = t1;
					
					double t2 = higharray[i];
					higharray[i] = higharray[j];
				}
			}
		}
		
		for(int i = 0; i<5; i++) {
			String name = namearray[i];
			double high = higharray[i];
			System.out.printf("%s의 키는 %.1fcm입니다.\n", name, high);
		}
//////////////////////////////////////////////////////////////////////////
		
	}
}
