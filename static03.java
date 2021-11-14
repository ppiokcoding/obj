package obj;


public class static03 {
	//작성 순서 표시했음
	
	public static void main(String[] args) {
		
		//[static_03]
		
		
		//3.
//		Pen p1 = new Pen();
//		
//		p1.setModel("153");
//		p1.setColor("검정");
//		
//		//6.
//		Pen p2 = new Pen("젤리펜", "빨강");
		
		
		//7.
		//목적) 펜을 몇 개 만들었는지 개수 세기
		
		//case 1.
		//- 쉽게 구현 가능
		//- 많이 사용
		//- count++을 누락하면 발견하기 힘들다;;;
		//- count가 Pen의 생성개수라는 사실을 증명하기 힘들다;;
		/*
		int count = 0; // 누적 변수
		
		Pen p1 = new Pen("153", "검정");
		count++;
		
		Pen p2 = new Pen("153", "검정");
		count++;
		
		Pen p3 = new Pen("153", "검정");
		count++;
				
		System.out.println("펜의 개수: "+ count);
		*/
		
		
		//case 2.
		//- p1이 가진 변수만 카운트 누적 하자
		// 하면 안되는 이유 : 모든 펜이 하나하나 누적해야하는 값을 왜 하필 p1한테 맡기냐?
		//이는
		//- count 변수를 객체 변수로 생성한다. > 큰 문제점
		//- 객체 변수는 개인(개별) 데이터를 의미한다. > 공용값이 생성횟수를 누적하려고 시도한 것 자체가 문제다!!
		//이 카운트는 개인변수가 아니다. 집합값을 개인 변수에 넣는게 말이 안됨
		//30명이 회비를 모았다. 그리고 그걸 잠시 통장에 넣으려하면 공용통장에 넣어야함
		//근데 이건 개인 통장에 넣은 짓을 한 것임
		/*
		Pen p1 = new Pen("153", "검정");
		p1.count++;
		
		Pen p2 = new Pen("153", "검정");
		//p2.count++;
		p1.count++;
		
		Pen p3 = new Pen("153", "검정");
		//p3.count++;
		p1.count++;
		
		System.out.println("펜의 개수: "+ p1.count);
		*/
		
		//case.3 (1,2보단 그나마 이상적/무난한 방법)
		//- count++을 누락하면(까먹는등...) 발견하기 힘듦--->이것까지 완벽 해결하려면 case.4
		/*
		Pen p1 = new Pen("153", "검정");
		//p1.count++; 개인 카운트
		Pen.count++; // 공용카운트
		
		Pen p2 = new Pen("153", "검정");
		Pen.count++; // 공용카운트
		
		Pen p3 = new Pen("153", "검정");
		Pen.count++; // 공용카운트
		
		System.out.println("펜의 개수: "+ Pen.count);
		
		//다같이 쓰는 건 정적 변수를 이용해라
		*/
		
		
		//case.4
		//- 가장 이상적 형태
		//- static count + 생성자
		Pen p1 = new Pen("153", "검정");
		Pen p2 = new Pen("153", "검정");
		Pen p3 = new Pen("153", "검정");
		
		System.out.println("펜의 개수: "+ Pen.count);
		
		
		//포커스
		//- 어떤 멤버 변수를 만들때 1과 2중 어떤걸 선택하는지? 성격?
		//1. 객체 변수(static x) > 개인데이터
		//2. 객체 변수(static o) > 공용데이터
		
		
		
		
	}//main

}

//1.
class Pen {
	
	//보편적인 선언 순서(의식의 흐름 때문에)
	//1. 멤버 변수
	//2. 생성자
	//3. 메소드
	
	
	private String model;
	private String color; //이 객체 맴버들은 new 라는 걸 호출하면서 만들어짐
	
	//pen이라는 소속감이 생긴 카운트 
	//public int count;= 객체변수(개인데이터) // 잠깐 퍼블릭으로 열것임 case2.에서, 그리고 이건 잘한 것 근데 객체 변수로 만든게 잘못
	public static int count; // = 정적변수(공용데이터)
	
	//4. 컨트롤 스페이스 -> 자동 생성자 만들어줌
	
	//생성자
	//1. 객체 생성자
	// - static이 없는 변수만 초기화 역할
	//2. 정적 생성자
	// - static이 있는 변수만 초기화 역할
	
	//정적 생성자
	//- 이름x
	//- 접근지정자x
	//- 오버로딩x
	//- 개발자가 명시적으로 호출할 수 없다.
	//- 정적 멤버가 생성된 직후에 자동으로 호출된다.
	//- 프로그램을 통틀어 딱 1번만 실행된다.(main 메소드 호출 직전)
	static {
		//Pen.count = 0; // 이게 자동으로 만들어짐... 0부분을 컨트롤 할 것 아니면 정적생성자를 굳이 만들필요는 없다.
	}//이게 정적 생성자, 하는일 = 정적 변수 초기화
	
	//객체 생성자 > 객체를 생성할때마다 호출된다.
	public Pen() {
		//this.model = "";
		//this.color = "";
		
		//case.4
		//Pen.count++; //여기를 고치면 됨
		this("", ""); 
		
	}
	
	//5. 마우스 우클릭 + 소스 유징~
	
	//객체 생성자
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		//Pen.count = 0; //정적멤버를 여기서 초기화 하면 x
		Pen.count++; // 100% 보장
	}
	
	
	
	//1-2.
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//2.
	public String info() {
		
		return String.format("(%s,%s)"
									, this.model
									, this.color);
	}
	
	
}