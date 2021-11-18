package obj;

public class interface_03 {
	
	public static void main(String[] args) {
		
		//[interface]
		
		
		//자식 		-> 부모 
		//클래스  	-> 클래스			: O
		//클래스  	-> 인터페이스		: O
		//인터페이스 	-> 클래스		: X 
		//인터페이스 	-> 인터페이스	: O
		
		
		//다중 상속
		// - 자바는 (클래스) 다중 상속을 지원하지 않는다.
		// - 자바는 (인터페이스) 다중 상속은 지원한다. > 사용 多
		
		
		
	}//main
	
}


interface 직원 {
	void 출근한다();
	void 퇴근한다();
}

interface 간부 extends 직원 {
	void 결재한다();
}

interface 사원 extends 직원 {
	void 보고서작성한다();
}

interface 아빠 {
	void 일한다();
}

interface 엄마 {
	void 살림한다();
}

interface 추가 {
	void 출근한다();		//직원의 모습
	void 퇴근한다();		//직원의 모습
	
	void 보고서작성한다();	//사원의 모습
	
	void 일한다();		//아빠의 모습
} //3가지 성격의 코드가 한군데에 뭉침 > 안좋은 코드 > 수정 필요 > ',' 찍어서 나눠주는 것으로 수정!!



//한 집안 가장
//
class 아무개 implements 아빠, 사원 { // 이게 다중 상속임 아빠도 상속받으면서 사원도 상속받는 것!
								 // Role > 동시에 규칙을 만족
	@Override
	public void 일한다() {

	}

	@Override
	public void 출근한다() {

	}

	@Override
	public void 퇴근한다() {

	}

	@Override
	public void 보고서작성한다() {

	}
}

//==============================================================================
class AAA {
}

class BBB extends AAA {
}

interface CCC {
}

class DDD implements CCC {
}

class EEE {
	//구현된 멤버
	public int a;
	public void test() {
	}
}

//interface FFF 상속 EEE { 
	// 얘는 상속이 안됨 왜? 
	//	=> 인터페이스는 구현된 것들을 포함하지 못함(ex59) 근데 상속을 해버리면 
	//	   위의 EEE에서 구현된 변수와 메소드들이 같이 딸려들어가므로 구현된 곳을 포함하게 되는 
	//	   아이러니한 상태가 됨 그래서 안되는 것임  
	
//}



interface GGG {
	void aaa();
}

interface HHH extends GGG {
	//얘는 에러가 안남
	//인터페이스는 추상메소드를 가질 수 있다.
	void bbb();
}


class III implements GGG { 
	//일반 클래스는 추상 멤버를 가질 수 없다. > 그래서 구현을 해서 온전한 메소드를 만들었다.
	@Override
	public void aaa() {
	}
}


//======================인터페이스끼리도 상속을 한다.====================
interface 사람 {
	void 숨쉬다();
}


interface 어른 extends 사람{
	//void 숨쉬다();
	void 걷는다();
}

interface 아기 extends 사람{ 
	//void 숨쉬다();
	void 기어다닌다();
}

//================================================================


class 홍길동 implements 어른 {

	@Override
	public void 숨쉬다() { // 사람이라는 인터페이스가 시킴
		
	}

	@Override
	public void 걷는다() { // 어른이라는 인터페이스가 시킴
		
	}
	
}