package obj;

public class Inheritance02_object {
	
	public static void main(String[] args) {
		
		//[Object]
		
		//object 클래스
		//- java.lang 패키지에 소속
		//- 모든 자바 클래스를 통틀어 가장 중요한 클래스
		//- 모든 클래스의 근원(Origin, Root)
		//- 단군 할아버지
		//- Class Object is the root of the class hierarchy.
		//- Every class has Object as a superclass. 
		//- All objects,including arrays, implement the methods of this class.
		
		
		TestCCC c = new TestCCC();
		c.a =10;
		c.b = 20;
		c.c = 30;
		
		
		
		TestBBB b = new TestBBB();
		b.a = 10;
		b.b = 20;
		
		
		//TestAAA 객체의 멤버 수
		// - 2개: 직접 선언
		// - 9개: 상속 받은 멤버
		
		TestAAA a = new TestAAA();
		a.a = 10;
		
		MyRandom rnd = new MyRandom();
		//rnd. 찍으면 나오는 여러 메소드들은 왜 있냐면 우리눈엔 안보이지만 오브젝트를 부모로 삼겠다라는 코드가
		//자동으로 들어가서 그럼
		

		//Object 객체는 만들어서 사용할 일이 없다.
		Object o = new Object();
		
		
	}//main

}//


//Object 클래스는 상속을 명시하지 않은 모든 클래스의 부모 클래스가 된다.(*******)
class TestAAA {
	public int a;

	public void aaa() {

	}
}

class TestBBB extends TestAAA{
	public int b;
}

class TestCCC extends TestBBB{
	public int c;
}


