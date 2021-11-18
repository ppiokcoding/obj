package obj;


public class interface_02 {
	
	public static void main(String[] args) {
		
		
		//한줄 평 : "클래스들이 지켜야될 표준화된 사용법을 인터페이스가 정의한다."
		
		
		//[interface]
		
		//Gram lg = new Gram();
		//lg.powerOn();
		//lg.powerOff();
		
		//10년 사용 > 고장
		
		//구입
		//MacBook mac = new MacBook();
		
		//mac.powerOn(); --> 10년사용으로 습관이 되었지만 이 메소드는 없다
		//mac.powerOff();
		//mac.on();
		//mac.off();
		
		//다음날 -> 익숙해지기까지 오랜시간 소요
		//mac.powerOn();
		
		//...그래서 서로가 경쟁하는 회사지만 고객의 입장을 생각해서 서로 협의하에 전원은 협의를 시킴
		
		
		//Gram lg = new Gram();
		
		//lg.powerOn();	//클래스 > 로컬 사용법
		//lg.start();		//인터페이스 > 표준 사용법
		
		
		//lg.stop();
		
		
		//MacBook mac = new MacBook();
		
		//mac.start();
		//mac.stop();
		
		
		//최종 결론!
		//LapTop lg = new Gram(); // 되는 코드임
		//왜? 
		//LapTop = Gram
		//부모 = 자식
		//업캐스팅
		LapTop lg = new Gram(); //자식개체를 부모껍데기에 담은 것임
		
		//참조변수의 자료형이 중요하다
		lg.start();
		lg.stop();
		//lg.powerOn(); //사용할 수 없게 됨 왜? 안보이니깐! 
		
		
		
		LapTop mac = new MacBook();
		
		mac.start();
		mac.stop();
		
		//같은 자료형(LapTop)이기때문에 같은 사용법을 가지게 된 것임.
		
		
		//인터페이스는 즉,
		//-> 클래스들한테 공통된 행동을 하라고 강제로 시키면서 
		//-> 편향된 사용 즉 모두가 똑같은 행동을 하는 것만 노출시켜주는조직화된 행동을 하게해줌
		
		
	}//main
	
}


//인터페이스
// - 클래스들간의 사용법을 규칙화하는 도구
// - 제약 사항(= 인터페이스) > 사용법 제시(강제적)

//모든 노트북 > start(), stop()
interface LapTop {
	
	void start();
	void stop();

}


//LG 그램 노트북 클래스
class Gram implements LapTop {
	
	public String model;
	public String Color;

	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	public void powerOff() { 
		System.out.println("전원을 끕니다.");
	}

	//새로 생김
	@Override
	public void start() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void stop() {
		System.out.println("전원을 끕니다.");
	}

}


//맥북
class MacBook implements LapTop {
	
	public String model;
	public int weight;
	
	public void start() {
		System.out.println("맥북 On");
	}
	
	public void stop() {
		System.out.println("맥북 Off");
	}

}

class Galaxy {
	
}

