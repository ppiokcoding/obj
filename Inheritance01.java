package obj;


public class Inheritance01 {
	
	public static void main(String[] args) {
		
		//[Inheritance01]
		/*
		 상속, Inheritance
		 - 부모가 가지는 재산을 자식에게 물려주는 행동
		 - 부모 클래스가 가지는 멤버(= 변수, 메소드)를 자식 클래스에게 물려주는 행동
		 
		 
		 상속을 왜 하는지?
		 - 자식 클래스가 직접 구현해야 할 멤버(변수, 메소드)들을 직접 구현하지 않고 부모 클래스로부터 
		   물려받아서 자기가 직접 구현한것처럼 사용하기 위해서.
		 - 비용 절감, 코드 재사용(*******) -->코드 재사용성의 N0.1이 상속이다. 상속을 잘 할수록 코드가
		   많이 줄어들고 반복작업을 안할 수 있다.
		 
		  
		  상속관계에 있는 클래스 호칭
		 - 부모 클래스 <- 자식 클래스
		 - 슈퍼 클래스 <- 서브 클래스
		 - 기본 클래스 <- 확장(파생) 클래스
		 
		 */
		
		
		//System.out.println(num);
		
		Child c = new Child();
		c.a = 10;
		c.b = 20;
		c.ccc();
		System.out.println(c.a);
		System.out.println(c.b);
		
		
		
		Son son = new Son();
		
		//Son 클래스가 직접 생성한 멤버
		son.d = 10;
		son.e = 20;
		son.fff();
		
		//Parent 클래스가 물려준 멤버
		son.a = 30;
		son.b = 40;
		son.ccc();
		
		
		Daughter daughter = new Daughter();
		
		//상속받은거 
		daughter.a = 10;
		daughter.b = 20;
		daughter.ccc();
		
		
		//직접받은거
		daughter.g = 30;
		daughter.h = 40;
		daughter.iii();
		
		//DDD
		DDD d = new DDD();
		System.out.println(d.a); //AAA(증조 할머니)
		System.out.println(d.b); //BBB(할머니)
		System.out.println(d.c); //CCC(어머니)
		System.out.println(d.d); //CCC(자신)
		
	}//main

	
}


// class Parent 자식클래스 child (x)인 이유 :
// 부모가 먼저태어남 근데 자식이 생기기도 전에 이름을 알 수없기 때문에! 마치 없는 변수 출력하려는 느낌
// System.out.println(num) => num 이따가 쓸건데요..? 이상한 소리임 이거랑 같은 이치임 
// ***그래서 자식이 부모를 선택하는 것으로 결론남!!!!!
//	class Child extends Parent (o)


//부모클래스와 자식 클래스를 서로 연결해 주는  순간(extends) 상속이 바로 발생한다.

//부모 클래스	
class Parent{
	public int a;
	public int b;
	public void ccc() {
		System.out.println("ccc");
	}
}


//자식 클래스
class Child extends Parent{
	//자신의 멤버를 하나도 구현하지 않는 자식 클래스는 구현할 필요가 없다.
	// > 존재 이유 0% > Parent 클래스를 직접 사용하면 되기 때문에
	
}

//Son 클래스의 상태?
// -> 기존에 Patent의 역할(a, b, ccc)을 그대로 유지하면서
//	  추가로 기능을(d, e, fff) 구현한 상태 

//어떤 하나의 클래스를 기본으로 유지하면서 거기에 추가로 기능을 확장하는 결과 발생!!!
class Son extends Parent{
	//Son 클래스 자신의 멤버 변수와 메소드
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}
}

class Daughter extends Parent {
	public int g;
	public int h;
	public void iii() {
		System.out.println("iii");
	}
}

class AAA {
	public int a = 10;
}

class BBB extends AAA{
	//int a
	public int b = 20;
}

class CCC extends BBB{
	//int a
	//int b
	public int c = 30;
}

class DDD extends CCC{
	//int a
	//int b
	//int c
	public int d = 40;
}

//상속은 되물림 될수록 물려지는 멤버가 많아질 수 밖에 없는 구조이다.
