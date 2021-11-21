package obj;

public class obj_wrapper {
	
	public static void main(String[] args) {
		
		
		//[wrapper]
		
		
		//Wrapper Class, Utility Class
		//int -> Integer
		//double -> Double
		//boolean -> Boolean
		//값형 7개 -> Wrapper Class 제공
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Double.MIN_EXPONENT);
		
		System.out.println(Integer.parseInt("100") + 100);
		System.out.println(Double.parseDouble("3.14")*2);
		
		
		//두 숫자의 우위 비교
		// 1  : 앞에 숫자가 크다
		// -1 : 뒤에 숫자가 크다
		// 0  : 숫자가 같다
		
		System.out.println(Integer.compare(10, 5));
		System.out.println(Integer.compare(5, 10));
		System.out.println(Integer.compare(5, 5));
		
		System.out.println();
		
		// -양수(크다), 음수(작다), 0(같다)
		System.out.println(compareInt(10, 5));
		System.out.println(compareInt(5, 10));
		System.out.println(compareInt(10, 10));
		
		System.out.println();
		
		System.out.println(Double.compare(3.14, 2.56));
		System.out.println();
		
		System.out.println(Integer.max(10, 5)); //더 큰수
		System.out.println(Integer.min(10, 5)); //더 작은수
		System.out.println();
		
		System.out.println(Integer.compare(-10, 5));
		System.out.println(Integer.compareUnsigned(-10, 5)); //절댓값 비교
		System.out.println(Math.abs(-10) > Math.abs(5)); //절댓값 비교
		
		System.out.println(Integer.toString(100)); 	// "100" 문자열 100이 찍힘
		System.out.println(String.valueOf(100)); 	// "100"
		System.out.println(100 + ""); 				// "100"
		System.out.println();
		
		
		System.out.println(Integer.toBinaryString(10)); //2진수로 바꿔서 출력해줌
		System.out.println(Integer.toOctalString(10)); 	//8진수로 바꿔서 출력해줌
		System.out.println(Integer.toHexString(10));	//16진수로 바꿔서 출력해줌
		System.out.println();
		
		
		//문자, 문자열 비교
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println(c1 > c2); //내부적으로 정수형이므로 직접 비교 가능(과거에 배움)
		
		String s1 = "A";
		String s2 = "B";
		
		//System.out.println(s1 > s2); --> 중요 : 주소값(= 식별자)의 우위 비교는 불가능!!!
		
		s1 = "홍길동"; // 128 251 301
		s2 = "아무개"; // 256 524 145 --> 이런 문자코드값들을 비교할것임? 기준이 애매함 그래서 얘네는 비교 불가
		//하지만 근본 원인은 주소값 비교 불가능이기 때문!
		
		//정렬 > 우위 비교
		
		System.out.println(compareString("홍길동", "아무개입니다"));
		System.out.println(compareString("홍길동", "홍길순"));
		System.out.println(compareString("홍길동", "홍길동"));
		System.out.println(compareString("홍길동", "홍길동입니다"));
		
		//System.out.println("홍길동" > "아무개"); 이건 안됨
		
		System.out.println();
		
		s1 = "홍길동";
		s2 = "아무개";
		
		System.out.println(s1.compareTo(s2)); //양수(4361) > s1이 크다
		System.out.println(s2.compareTo(s1)); //음수(-4361) > s1이 작다
		System.out.println("홍길동".compareTo("홍길동")); //0 > 같다
		System.out.println();
		
		s1 = "Java";
		s2 = "java";
		
		System.out.println(compareString(s1, s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
	}//main

	
	public static int compareInt(int a, int b) {
		
		
		//첫번째 방법
//		if (a > b) {
//			return 1;
//		} else if (a < b) {
//			return -1;
//		} else {
//			return 0;
//		}

		
		//두번째 방법
		return a - b;
	
	}	

	
	public static int compareString(String s1, String s2) {
		
		//s1 = "홍길동";
		//s2 = "아무개":
		
//		int length = s1.length() > s2.length() ? s2.length() : s1.length();
		int length = Integer.min(s1.length(), s2.length());
		
		for (int i=0; i<3; i++) {//두문자열 중 짧은 애 길이만큼 돌아야 한다.

			//System.out.printf("%c-%c\r\n", s1.charAt(i), s2.charAt(i));
			
			if (s1.charAt(i) > s2.charAt(i)) {
				return 1;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return -1;
			} 
		
		}//for
	
		//작은 문자열의 길이까지는 동일한 문자열..
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		} else {
			return 0;
		}
	}
		

}
		

