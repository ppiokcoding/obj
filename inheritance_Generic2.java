package obj;


public class inheritance_Generic2 {

	public static void main(String[] args) {
		
		//[Generic]

		//제네릭 클래스 사용
		// -> 클래스를 선언할 때는 멤버의 타입이 결정되지 않았는데
		// 	 객체를 생성할 때 자료형을 넘겨서 멤버의 타입이 결정되었다.
		// -> 클래스의 사용 범위 넓히기 위해서..
		
		//제네릭 클래스 객체 생성 방법
		Item<String> item = new Item<String>();
		item.a = 10;
		item.b = "문자열";
		item.c = "문자열";
		
		
		Item<Integer> item2 = new Item<Integer>();
		item2.c = 100;
		
		
		
		//제네릭에 전달할 자료형(실인자)은 반드시 참조형만 가능하다.
		//Mouse<int> m1 = new Mouse<int>();
		
		
		//Mouse<integer> m1 = new Mouse<integer>();
		Mouse<Boolean> m1 = new Mouse<Boolean>();
		//m1. => 값형 확인
		
		m1.a = true;
		m1.b = false;
		m1.c = true;
		
		Monitor<String,Integer> m2 = new Monitor<String, Integer>("모니터", 200000);
		System.out.println(m2.getA()); //String
		System.out.println(m2.getB()); //Integer
		
		
		Monitor<Boolean, Double> m3 = new Monitor<Boolean, Double>(false, 3.14);
		System.out.println(m3.getA()); //Boolean
		System.out.println(m3.getB()); //Double
		
		
	}//main
	
//	public static void test(미정 a, 미정 b, 미정 c, ...) {
//		//어떤 일 구현 > 매개변수의 타입이 미리 결정되어 있지 않으면 메소드내에서 하는 일에도 상당한 제약이 걸린다.
//	}
	

}

//int a = 10; > 데이터를 담는 공간
//T = int; > 자료형을 담는 공간 
//T = Scanner;
//T = Boolean;

//제네릭 클래스
//- T	: 타입 변수
//- <> 	: 매개 변수
class Item<T> {
	
	public int a;
	public String b;
	public T c; 	//현 시점에서는 c의 자료형을 알지 못한다. > 나중에 결정된다. > 객체 생성 시
	
}

class Mouse<T> {
	
	public T a;
	public T b;
	public T c;
}

class Keyboard<T> {
	
	public T a;
	
	public void test(T a) { //메소드 매개변수
		T b; //지역에서는 사용금지(되긴하나 권장하지 않는다) > 통제가 힘들어서
	}
	
	public T get() {
		
		return a;
	}
}

class Monitor<T, U> {

	public T a;
	public U b;
	
	public Monitor(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return this.a;
	}
	
	public U getB() {
		return this.b;
	}
	
}
