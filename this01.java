package obj;

public class this01 {
	
	public static void main(String[] args) {
		
		//[this]
		
		
		//객체를 접근할 때
		//1. 외부에서 접근
		//	-> 객체명을 사용 > 절대적 표현
		//	-> 객체명.멤버명
		//	-> m1.model
		//	-> m1.setModel()
		
		//2. 내부에서 접근
		//	-> this 키워드 사용 > 상대적 표현
		//	-> this.멤버명
		//	-> this.model
		//	-> this.setModel()
		
		//영희는 배고파요	
		//나(영희)는 배고파요	
		//나(삐옥)이는 배고파요 -----> 이것이 this의 키워드임! 어떤 객체가 실행하느냐에따라 주체가 바뀜
		
		Mouse m1 = new Mouse();
		//m1 = 김아무개영희 이라는 키워드 즉 특정한 것 하나를 가리키는 표현
		
		m1.setModel("A001");
		m1.setPrice(10000);
		
		
		Mouse m2 = new Mouse();
		
		m2.setModel("B002");
		m2.setPrice(20000);
		
		
	}//main

}

class Mouse {
	
	private String model;
	private int price; //멤버 2개가 선언된 클래스
	
	//단축키? 같은걸로 게터/세터 한번에 완성
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		
		//this
		//- 객체 접근 연산자(지정자)
		//- 현재 코드가 소속되어 있는 객체를 표현한다.
		//- this를 적어놓은(사용하고 있는) 메소드를 가지고 있는 객체
		//- this는 자기 자신을 가르키는 상대적 표현 > '나'라는 뜻(객체)
		
		//m1.model = model; 
		//= 아무개는 배고파요 즉 3인칭으로 표현한 것임
		//= 미래에 태어날 애를(m1) 미리 표현한 것이랑 똑같음 그래서 틀림
		//		> 설계 당시는 내가 뭔 이름을 가질지 모름 그래서 this라는 키워드를 쓰게됨!
		
		this.model = model;
		
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}