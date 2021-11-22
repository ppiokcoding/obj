package obj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class obj_Exception {

	public static void main(String[] args) throws IOException{
		
		//[Exception]
		
		//예외, Exception
		//- 컴파일 발견 x -> 실행중(런타임) 발견 에러 이것을 Exception 이라 한다.
		//- 개발자 미리 예측 o,x -> 발생 가능성이 있다.
		//- 개발자가 모든 예외를 미리 예측하기 불가능하다.
		
		//예외 처리, Exception Handling
		//1. 전통적인 방식
		// - 제어문 사용(조건문)
		//2. 전용 예외처리 방식
		// - try catch문 사용
		
		
		//m1();
		//m2();
		//m3();
		
		//최후의 저지선
		// - 무슨일일 있어도 마지막인 main에서만큼은 *예외처리*를 하고 끝내야 한다.
		try {
		//m4(); 
		} catch (Exception e) {
			
		}
		
		m4();
		m5();
		
		
		
	}//main

	private static void m5() {

		//예외 던지기
		
		//요구사항] 입력 숫자 짝수면 에러
		
		int num = 5;
		
		if (num % 2 ==1 ) {
			System.out.println("업무 진행");
		} else {
			System.out.println("예외 처리");
		}
		
		
		try {
			System.out.println("업무 진행");
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
		
		//=============================
		try {
			
		if (num % 2 == 0 ) {
			// 강제로 에러를 발생시킨다.
			// 1. 공을 만든다.
			// 2. 공을 던진다.
			throw new Exception();
		}
		
		
		System.out.println("업무 진행");
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
	}

	
	private static void m4() throws IOException { //throws IOException : 예외 미루기, 책임 떠넘기기

		//예외 미루기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//방법 1. 예외를 직접 처리
		try {
		String input = reader.readLine();
		} catch (Exception e) {
			System.out.println("입력 오류");
		}
		
		//방법 2. 떠넘기기
		String input2 = reader.readLine();
		
		//에러가 나는 것을 한곳에서 관리하고 싶을때 이용
		//우선은 그때그때 처리하는 걸 연습한 후 몰아서 처리하는것 하는 방향으로! 지금은 한번에 하는 거 힘듦
		
		
	}

	private static void m3() {

		
		try {
		int num = 0;
		System.out.println(100 / num); //new ArithmeticException();
		
		int[] num2 = { 10, 20, 30 };
		System.out.println(num2[5]);

		Parent p = new Parent();
		Child c;

			c = (Child) p; //new ClassCastException()
			
			
		} catch (ArithmeticException e) {
			//ArithmeticException e = new ArithmeticException()
			//ArithmeticException e = new ArrayIndexOutOfBoundsException()
			System.out.println("0으로 나누기");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류");
		} catch (ClassCastException e) {
			System.out.println("형변환 오류");
		} catch (Exception e) { //얘는 다 잡아버리기 때문에 무조건 뒤에 놓는다.
			System.out.println("예외처리");
		} //일부로 에러를 내고 클래스 이름 찾아서 넣어도 됨!
		//catch절의 순서가 중요하다.
		
		
		//에러가 난 상황에 따른걸 잡기위해서 각각 에러처리를 한 것임!! 
		
		//Exception 클래스
		//xxxException의 최상위 클래스
		
		//xxxException의 클래스
		// - ArithmeticException 클래스
		// - ClassCastException	 클래스
	}//m3

	
	
	private static void m2() {
		
		
		//중요 런타임 오류 발생 > 메시지 정리*
		// - 항상 xxxException 예외 발생
		// - java.lang.ArithmeticException
		// - 세밀한 try catch 처리하기 위해 사용 된다.
		
		int num = 0;
		
		
		try {
			System.out.println(100 / num);
		} catch (Exception e) {
			System.out.println("0으로 나누기");
		}
		
		int[] num2 = { 10, 20, 30};
		
		try {
		System.out.println(num2[5]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}
		
		
		Parent p = new Parent();
		Child c;
		
		try {
			c = (Child)p;
		} catch (Exception e) {
			System.out.println("형변환 오류");
		}
		
		
		
		
	}

	private static void m1() {

		//요구사항] 숫자를 입력받아 연산을 하시오.
		

		//입력 코드(공통)
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		
		//1. '0'을 넣으면 에러나는 프로그램 - > 큰 문제...
//		System.out.printf("100 / %d = %d\r\n", num, 100 / num);
//
//	
//		System.out.println("다른업무..");
//	
		
//		if (조건) {
//			참 블럭 > 긍정적
//		} else {
//			거짓 블럭 < 부정적
//		}
//		
		
		
		//그래서 이런 것에 대한 대비 작업을 예외 처리라고 함
		//2. '0'에 대한 예외 처리를 한 프로그램(= 에러가 나는 상황을 수습한 프로그램) 권장!
		// 		코드관리 차원에서 비즈니스 코드를 먼저보이도록!
//		if (num != 0) {
//		//비즈니스 코드(업무코드)
//		System.out.printf("100 / %d = %d\r\n", num, 100 / num);
//
//		} else {
//			//예외 처리 코드
//			System.out.println("0을 입력하면 안됩니다!");
//		}
//	
//		System.out.println("다른업무..");
		
		
		
		//3. 예외처리(비권장)
		if (num == 0) {
			// 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다!");
		} else {
			// 비즈니스 코드(업부 코드)
			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
		}
		System.out.println("다른업무..");	
		
		
		
		
		//4. 전문 방식(try-catch)
		//	- 가독성 높음
		//	- "num!=0" ??? 안보임 > 동작 방식 다름!
		// 			- if문 : 선조건 후처리, 사전에 미리 검사를 해서 사고가 안나게 처리
		//			- try : 사건 발생 후처리, 사고가 나는지 '감시'를 하다가 사고 발생시 사고처리하는 방식
		
		
		try {

			//try 블럭 > 비즈니스 코드(업무코드) 작성하는 곳
			System.out.println("하나");
			System.out.printf("100 / %d = %d\r\n", num, 100 / num);
			System.out.println("둘 : 에러발생시 안보이는 글"); //에러발생시 안찍힘 
									 //하던일을 멈추고 남아있는 try는 건너뛴채로 강제로 catch로 이동
			
		} catch (Exception e) {// catch 블럭 > 예외처리 코드 적는 곳
			System.out.println("0을 입력하면 안됩니다!");
		
			
			//==========================
			
			//Exception e
			//- 예외가 발생한 상황의 여러가지 정보를 전달하는 객체
			//- 주로 개발자가 참고하는 메시지
			
			//System.out.println(e.getMessage());
			//e.printStackTrace(); //우리가 보는 에러메세지를 찍어 주는 메서드
			
			//==========================
		
		}
		System.out.println("다른업무..");
		
	}//m1


}

class Parent {
	
}

class Child extends Parent {
	
}


