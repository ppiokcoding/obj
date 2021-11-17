package obj;


public class inheritance_casting {
	
	public static void main(String[] args) {
		
		//[casting]
		
		/*
		 형변환, Type Cast
		 1. 값형 형변환
		 	- 값형끼리만 가능(boolean 제외)
		 
		 2. 참조형 형변환
		 	- 참조형끼리만 가능
		 	- 상속관계의 클래스끼리만 가능(******)
		 			> 직계 관계에서만 가능하다.(방계는 불가능)
		 
		
		 참조형 형변환, Reference Type CAST (지난번에 한 형변환은 값형 형변환임)
		 - 자식 클래스 -> (형변환) -> 부모 클래스
			- 업캐스팅(Up Casting)
			- 암시적인 형변환
			
		 - 부모 클래스 -> (형변환) -> 자식 클래스
		 	- 다운캐스팅(Down Casting)
		 	- 명시적인 형변환
		 	
		 - 손자 클래스 -> (형변환) -> 할아버지 클래스 : 세대수 무관
		 	- 업캐스팅
		 	
		 */
	
		Parent p1 = new Parent();
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		Child c1 = new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println();
		
		Parent p2;
		Child c2 = new Child();
		
		
		//형변환 발생
		//Parent = Child
		//암시적인 형변환 > 개발자가 신경 안써도 될 정도로 안전하기 때문
		//부모 = 자식
		//업캐스팅
		//100% 안전하다.
		//p2 = (Parent)c2;
		p2 = c2;
		
		
		//형변환이 올바르게 수행되었는지 확인? > 검증 방식이 다르다 
		//								> 복사된 객체를 올바르게 사용이 가능한지를 확인한다. 
		//									> 올바르다. 
		//									> 안보이는 c와 d는 절대로 생각하지 말것!!
		System.out.println(p2.a);
		System.out.println(p2.b); //Parent 타입이므로 a,b 만 보임
		//System.out.println(p2.c);
		//System.out.println(p2.d);
		
		
		Parent p3 = new Parent();
		Child c3;
		
		//형변환 발생
		//Child = Parent
		//자식 = 부모
		//다운 캐스팅
		//명시적인 형변환 = 위험할 수도 있다.
		//100% 불가능!!
		//c3 = (Child)p3; //런타임 오류 > ClassCastException
		
		//검증
//		System.out.println(c3.a);	
//		System.out.println(c3.b);	
//		System.out.println(c3.c);	//Error
//		System.out.println(c3.d);	//Error
		
		
		Parent p4;
		Child c4 = new Child();
		
		//업캐스팅
		p4 = c4;
		
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");
		System.out.println("다른 업무 구현");

		
		Child c5;
		c5 = (Child)p4;
		
		//다운캐스팅
		// - 위의 다운캐스팅은 불가능했는데 이 다운캐스팅은 왜 가능한가??
		// - 힌트: 조삼모사!!
		// 답: 겉으로 보기에는 왼쪽이 chid 오른쪽이 parent 같지만, 실제로는 왼쪽 child 오른쪽 parent
		//인건 맞지만 위에 보면 p4에 chid가 있었음 
		
		//겉: Child = Parent > Parent 객체를 Child 참조 변수 복사 X
		//속: Child = Parent = Child > Child 객체를 Child 참조 변수 복사 O

		System.out.println(c5.a);
		System.out.println(c5.b);
		System.out.println(c5.c);
		System.out.println(c5.d);
		
		//-----------------------------------
//		Random rn;
//		BufferedReader reader;
//		Calendar c;
//		Lotto lotte;
		//소스가 아닌 컴파일된 결과물을 준다고 첫시간에 말함
		//결론은 4개의 멤버 중 누가되고 누가 안되는 것인지는 알아볼 방법이 없다.
		//그래서 자바는 전체를 싸잡아서 실패라고 결론을 내버림 그래서 그걸 
		//이런 복사(부모 객체를 자식 껍데기로 참조하는 것)는 하면 안돼 라고 해버림
		//왜냐 자식 객체는 늘 부모보다 많기 때문에 
		//자식 객체를 부모 변수에 담을 수 없다.(= 다운 캐스팅)
		//업캐스팅은 출발을 즉 child 객체를 만들어서 부모객체에 복사하는 행위를 업캐스팅이라 함
		//업개스팅은 가능한 이유는 참조변수로 접근 하는 모든 멤버를 실제로 사용할 수 있느냐 그것이 명제이다.
		//
	}//main

}


class Parent {
	public int a = 10;
	public int b = 20;
}

class Child extends Parent{
	public int c = 30;
	public int d = 40;
}

class Son extends Parent{
	public int e = 50;
}

class Daughter extends Parent {
	public int f = 60;
	
}




