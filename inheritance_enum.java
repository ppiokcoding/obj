package obj;


public class inheritance_enum {
	
	public static void main(String[] args) {
		
		
		//[enum]
		
		//열거형, Enumeration
		//- 클래스의 일종
		//- 열거값을 가지는 자료형. 열거값 중 하나를 선택해서 사용하는 자료형
		
		//상황] 의류 쇼핑몰 > 티셔츠 > 고객 > 색상 선택
		//		색상 > 빨강, 파랑, 노랑
		
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m3() {
		
		Gender g1 = Gender.male;
		Gender g2 = Gender.female;
		
		System.out.println(g1);
		System.out.println(g2);
		
		
		if (g1 == Gender.male) {
			System.out.println("남자");
		} else if (g1 == Gender.female) {
			System.out.println("여자");
		}
		
		
		//사용 계층 > 개발자 
		
		//객관식 + 의미
		Color c = Color.red; //열거형 이라는 새로운 자료형
		int c2 = Color2.blue; // 인티져
		
		
		
	}

	private static void m2() {

		//색상 입력 > 객관식 
		System.out.println("1.빨강, 2.파랑, 3.노랑 중 색상을 선택하세요.");
		
		String sel = "1";
		
		System.out.println(sel);
		
	}

	private static void m1() {

		
		//색상 입력 > 주관식 > 정규화된 데이터를 얻기가 상당히 힘들다.
		System.out.println("빨강, 파랑, 노랑 중 색상을 선택하세요.");
	
		String color = "빨강"; //scan.nextLine();
		
		System.out.println("선택: " + color);
		
	}

}


class 클래스명 {
	//구현된 멤버
}

interface 인터페이스명 {
	//추상 멤버
}

enum 열거형 {
	//열거형 멤버( = 데이터 )
}

enum Gender { male, female } //이 단어하나하나가 멤버이자 데이터

enum Color {
	red,	//int -> 0
	yellow,	//int -> 1
	blue	//int -> 2
}

enum Color3 {
	RED,
	YELLOW,
	BLUE		//파이널 키워드가 들어갔으므로 대문자!
}

class Color2 {
	public static final int red = 0;
	public static final int blue = 1;
	public static final int yellow = 2; // 파이널 키워드 주의
}

