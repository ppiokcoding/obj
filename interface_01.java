package obj;

public class interface_01 {
	
	public static void main(String[] args) {
		
		//[interface]
		
	
		/*
		 클래스
		 1. 객체를 생성한다.
		 2. 참조변수를 생성한다.
		 
		 인터페이스
		 1. 객체를 생성한다. (x)
		 2. 참조변수를 생성한다.(o)
		 
		 인터페이스, interface
		 - 클래스의 일종(= 자료형)
		 - 추상 메소드를 가진다.
		 - 구현 멤버는 가질 수 없다. (변수, 일반 메소드)
		 - pulic 멤버만 가진다.
		 
		 */
		
		int a = 10;
		//Member m = new Member;  //얘는 못씀
		Member m;
		
		
		
		
	}//main

}

//인터페이스는 앞에 대문자 I(헝가리언표기법)을 붙임=> IMember, class와의 구분을 위해서! 
//근데 요즘엔 기능(커서만 올리면 뭔지 보임)이 너무 잘 되어있어서 점점 사라지는 추세임
interface Member {
	
	//멤버 선언
	//*** 오류 이유 : 인터페이스는 구현된 멤버를 가질 수 없다.
	// - 구현된 멤버 
	// 	 = 변수 (x)
	//	 = 할 일을 선언한 메소드 = 구현부를 가지는 메소드 (x)
//	public int a;
//	public int b;
//	
//	public void test() {
//		//구현부
//	}
	
	//추상메소드 : 이름만 있지 하는일은 없다.
	// - 구현부가 없는 메소드
	public abstract void test();
	public abstract void aaa();
	void bbb(); //이렇게 써도됨 똑같은 효력을 발생함
	int ccc();
	int dd(String str);
	
}
//부모가 interface 일땐, implements 를 써줌
//***********************중요
//인터페이스를 상속받는 클래스에서는 (=Hong) 반드시(100%) 인터페이스의 추상 메소드를 구현해야 한다.
// -> test() 메소드의 구현부(몸통)를 만들어줘야 한다.

class Hong implements Member {

	//약속! > 완성!
	//약속의 범위 : 
	// - 메소드의 구현부를 선언하는 것 까지만 
	// - 메소드 구현부를 내용까지는 강요 불가능! > 클래스가 맘대로 구현한다. NO TOUCH!!
	
	//public void test() {
	//	
	//} 이건 직접 입력한거
	
	//ctrl + space 이용
	@Override
	public void test() { //아빠인 Hong이 못이룬 public void test();를 아들이 이뤄줌
		
	}

	@Override
	public void aaa() {
		
	}

	@Override
	public void bbb() {
		
	}

	@Override
	public int ccc() {
		return 0;
	}

	@Override
	public int dd(String str) {
		return 0;
	}
	
	
}



