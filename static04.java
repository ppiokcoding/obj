package obj;

public class static04 {
	
	public static void main(String[] args) {
		
		//[static_04]
		
		//사용법 정리
		Keyboard k1 = new Keyboard("K800", 80000);
		System.out.println(k1.info());
		
		//객체 메소드: 메소드의 정의가 객체안에 들어있고 객체를 통해서 접근하기 때문에 객체 메소드이기도함
		k1.m1();
		
		//정적 메소드 : 클래스 이름을 통해서 호출해서 정적메소드라고도 함 
		Keyboard.m2();
		
	}//main

}
//게터 세터는 필수요소가 아님 그러나 잘 모르겠으면~

//클래스 선언!!! > **가이드 라인(잘모르겠을때 이렇게만 해라 우선은)
//1. private + 변수 선언
//	1-1. 객체 변수 선정(개인 데이터) > 99.99%
//	1-2. 정적 변수 선정(공용 데이터) > 00.01% 사용률
//		-> 사물함 -> 개인 사물함 + 공용 사물함 -> 관리 용이?
// 		공용변수인 static은 아무나 건들 수 있기때문에 누가 건들였는지 모름 그래서 사건이 터졌을때 관리하기가 너~무 힘들다.
// 		ex. 공동 사물함의 휴지
//2. 생성자
//	2-1. 기본 생성자 필수(관습)
//	2-2. 오버로딩 생성자(필요에 따라)
//	2-3. 정적 변수 존재 > 정적 생성자
//3. 메소드
//	3-1. getter/setter (필요에 따라)
//	3-2. 업무용 메소드(****메인) > 업무 + 행동


//로지텍 키보드
class Keyboard{
	
	//개인데이터
	private String model;
	private int price;
	
	//공용 데이터
	private static String brand;
	
	
	//객체 생성자(컨트롤 스페이스로 만들기)
	public Keyboard() {
		this.model = ""; 
		this.price = 0;
	}

	public Keyboard(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	//정적 생성자(단축키 : 컨트롤 쉬프트 제트)

	static {
		Keyboard.brand = "로지텍";
	}

	
	//getter, setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Keyboard.brand = brand;
	}

	

	//덤프 메소드 : 객체의 상태를 한번에 파악하는 메소드
	public String info() {
		return String.format("(%s, %s)"
				,this.model
				,this.price);
		
	
	// => 여기까지 딱 정석적 방법임
	}
	
	//***기억해야 할 것!!!!
	//객체 메소드 -> 객체멤버 접근가능, 정적멤버 접근가능(그림판)
	//정적 메소드 -> 객체멤버 접근불가능, 정적멤버 접근가능 => this라는 키워드를 절대! 쓸수 없다.***** 
	
	//ex.
	// 국민들이 있다 치자
	// 국민 개개인이 하는 행동 => 개인 행동 == 객체 메소드 -> 개인 데이터 사용 + 공용 데이터 사용(대한민국사람)
	// 대한민국 '대표' 행동   => 집단 행동 == 정적 메소드 -> 개인 데이터 사용이 불가능 + 공용 데이터 사용
	//											   (쓸일도 없기도 하고! 홍길동이 개인적으로 뭐하는지 언급할 필요가 없듯이!)
	//결국 집단을 대표하는 행동은 집단으로 얘기하는 것! 
	
	
	
	
	//메소드 > 객체 메소드(스테틱 안붙여서)
	public void m1() {
		
		//객체 변수
		System.out.println("객체변수: " + this.model);
		
		//정적 변수
		System.out.println("정적변수: " + Keyboard.brand);
		
	}
	
	
	//정적 메소드(static이 붙으면 '정적')
	public static void m2() {
		//객체 변수
		//System.out.println("객체변수: " + this.model);
		//this 키워드 쓸수 없기 때문에 주석 달아놓음
		//에러메세지: Cannot use this in a static context
		
		
		//정적 변수
		System.out.println("정적변수: " + Keyboard.brand);
		
	}
	
	//정적메소드에서 this안되는 이유 설명 
	class User{
		private int a;
		private int b;
		
		public static void test() {
			//System.out.println(this.a);
			//System.out.println(this.b);
		}
	
	//그럼 되게 하려면??
	public void test2() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	}
}



