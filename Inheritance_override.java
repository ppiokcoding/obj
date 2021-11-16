package obj;

import java.util.Random;

public class Inheritance_override {
	
	public static void main(String[] args) {
		
		//[Override]
		
		//메소드 오버라이드, Method Override
		//- 메소드 재정의(수정) > 메소드 교체
		//- 상속 시 발생
		//- 왜? 상속하는 이유 > 세대가 교체 될 수록 클래스 기능 발전 or 상황에 맞게 변화
		//- 개발자 편의성
		//- 사용법(메소드 시그니처)는 그대로 유지하면서, 내용만 새로운 메소드를 교체
		
		
		Hong hong = new Hong();
		hong.name = "홍길동";

		Son son = new Son();
		son.name = "홍재석";
		
		Daughter daughter = new Daughter();
		daughter.name = "홍나래";
		
		//동네사람 > 길 > 홍길동이네 식구 
		//- "안녕하세요. 저는 ***입니다."
		
		//객체가 달라도 한 집안의 객체면 행동이 동일하다.
//		hong.hello();
//		son.hello();
//		daughter.hello();
		
		//아들 > 난 아빠가 물려준 hello() 방식으로 인사하기 싫어!
		//solution 1.
		//- 문제점: 다른 사람이 곤란해짐. 
//		hong.hello();
//		son.hi();
//		daughter.hello();
		
		hong.hello(); //Hong.hello()
		//son.hello();  //의도x, 메소드 노출o
		son.hi();	  //의도o
		daughter.hello(); //Hong.hello() vs Daughter.hello()
		
		//객체.난수생성하기();
		//객체.난수만들기();
		
	}//main

}


//다중 상속
// - 하나의 클래스가 2개 이상을 클래스로부터 상속
// - 자바는 다중 상속을 지원하지 않는다.(불가능) ex) C++ 
// - 자바는 부모 클래스를 딱 1개만 가질 수 있다. > 단일 상속만 가능하다.



class Hong {
	public String name;
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다.\r\n", this.name);
	}
	
}

class Son extends Hong {
	//부모가 물려주는 멤버 중 일부를 상속 거부 가능? > 불가능! => 100% 상속이 됨
	
	//solution 1.
	//- 부모 메소드는 내버려두고, 자신만의 메소드를 만들었다.
	public void hi() {
		System.out.printf("안녕..난 %s임\r\n", this.name);
	}
}

class Daughter extends Hong {
	
	//solution 2.
	//메소드 오버라이드
	//- 부모로부터 상속받은 메소드를 감추고
	//	자신이 선언한 메소드를 노출시키는 기술
	
	//결론 > 무조건 자신의 hello()를 사용한다.
	@Override
	public void hello() { 
		System.out.printf("야 안녕 난 %s인데? 뭐\r\n", this.name);
	}
	
}

//nextInt() -> -21억 ~ +21억

class MyRandom extends Random{
	
	//부모 클래스의 메소드와 자식 클래스 메소드가 충돌 발생 > 무조건 자식이 이긴다. 
	//		> 자식 클래스의 메소드가 항상 외부에 노출된다.(100%)
	
//1~10사이의 난수 > 더이상 MyRandom으로는 -21억 ~ +21억의 난수를 발생시킬 업무가 없다.(****)
	public int nextInt() {
		
		return (int)this.nextInt(10) + 1;
		
	}
}