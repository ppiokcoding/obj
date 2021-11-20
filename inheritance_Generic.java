package obj;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class inheritance_Generic {
	
	public static void main(String[] args) {
		
		//[Generic]
		
		//제네릭, Generic
		//1. 제네릭 클래스 >****
		//2. 제네릭 메소드
		
		//요구사항] int -> Integer
		//1. int 값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		//2. String값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		//3. boolean값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		//4. double
		//5. char
		//6. Random
		//7. Calendar
		//8. Student
		//9. User
		//10. 무한대
		
		WrapperInt n1 = new WrapperInt(10); //전용 클래스
		System.out.println(n1);
		System.out.println(n1.getData() * 2);
		
		
		WrapperObject n2 = new WrapperObject(20); //범용 클래스
		System.out.println(n2);
		System.out.println((int)n2.getData() * 2);
		
		
		//=================================================
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length());
		
		
		Wrapper<String> s3 = new Wrapper("대한민국");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참":"거짓");
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2);
		System.out.println((boolean)(b2.getData()) ? "참":"거짓");
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean> (true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : "거짓");
		
		//자바 배우는 수업 내용
		//- 중후반(클래스 수업) > 어려운 기술(상속, 제네릭 등)
		//- 우리가 직접 구현할 횟수 < 미리 만들어진 사용할 횟수
		
		
		//m1();
		
		
		
	}//main

	private static void m1() {

		Parent p = new Parent();
		Parent p2 = new Child(); //업캐스팅
		
		
		//**** Object 참조 변수는 세상의 모든 자료형을 담을 수 있는 변수이다.
		Object o1 = new Object(); 	//자신 = 자신
		Object o2 = new Parent();	//부모 = 자식
		Object o3 = new Child();	//할아버지 = 손자
		Object o4 = new Random();	
		Object o5 = new Scanner(System.in);	
		Object o6 = Calendar.getInstance();
		Object o7 = "문자열";
		Object o8 = new int[5];
		
		Object[] list = new Object[5];
		list[0] = new Parent();
		list[1] = new Random();
		list[2] = new Scanner(System.in);
		
		//참조형 변수 = 값;
		int n = 10;
		Object o9 = 10; //박싱(Boxing) 발생 > new Integer(10);
		
		System.out.println(n * 2);	//자료형 int
//		System.out.println(o9 * 2); //에러나는 이유, 자료형이 obect임
		System.out.println((int)o9 * 2); //다운캐스팅, 언박싱(UnBoxing)
		System.out.println((Integer)o9 * 2); //정석
		
		
		//object는 꺼냈을때 자료형이 object이기때문에 자료형을 바꾸는 작업 필요
		
		//1. 클래스 1개로 모두 사용이 가능(Obect 클래스의 장점)
		//2. 원래 자료형으로 되돌릴 필요 없음(전용 클래스의 장점)
		Wrapper<Integer> n3 = new Wrapper<Integer>(30); //범용 클래스
		System.out.println(n3);
		System.out.println(n3.getData() * 2);
		
		
		//*** 값형의 데이터를 Object 변수에 넣을 때 박싱이 발생하고, 
		//	  꺼내서 사용할 땐 다운캐스팅을 통한 언박싱이 발생한다.
		
		
		
		Object o10 = true;
		Object o11 = 3.14;
		
		
		//정수 생성
		int a = 10;
		Integer b = new Integer(20);
		Integer  c = 30;
		System.out.println(a + b + c);
		
		
//		User u1 = new User(); //홍길동
//		System.out.println(u1 * 2);
		
		
	}

}



class WrapperInt {
	
	private int data; //클래스의 중심이 되는 데이터

	public WrapperInt(int data) {
		this.data = data;
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}


	@Override
	public String toString() {
		
		//String.valuof(100) -> "100"
		//Integer.toString(100) -> "100"
		//100 + "" -> "100" (편법)
		
		
		return this.data + "";
	}
	
}


class WrapperString {
	
	private String data; //클래스의 중심이 되는 데이터

	public WrapperString(String data) {
		this.data = data;
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return this.data + "";
	}
	
}


class WrapperBoolean {
	
	private boolean data; //클래스의 중심이 되는 데이터

	public WrapperBoolean(Boolean data) {
		this.data = data;
		
	}

	public Boolean getData() {
		return data;
	}

	public void setData(Boolean data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return this.data + "";
	}
	
}

//- wrapperInt, WrapperString, WrapperBoolean -> WrapperObject 혼자서 해결

class WrapperObject {
	
	private Object data;
	
	public WrapperObject(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data + "";
	}
}


class Wrapper<T> { //이 안에있는 업무는 '특정' 자료형은 염두해 두고 쓰지 않는다.
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return this.data + "";
	}
	
	
}
