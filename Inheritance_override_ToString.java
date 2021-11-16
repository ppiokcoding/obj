package obj;

import java.util.Date;

public class Inheritance_override_ToString {

	public static void main(String[] args) {
		
		//[ToString]
		
		//자바 콘솔 출력 명령어(print, println, printf)는 객체를 출력하면 
		//자동으로 객체의 toString() 메소드를 호출한다.
		
		//toString() > 모든 클래스가 소유하고 있다.
		
		
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.toString());  //Date.toString() => 메소드 오버라이딩.
		//부모인 Object가 물려준 toString()가 맘에 안들어서 자기가 똑같은 메소드를 직접 만들어서 사용.
		
		
		Time t1 = new Time(2, 30);
		//com.test.java.obj.inheritance.override.Time@7907ec20
		//패키지.클래스@해시코드 > 쓸모 없는 문자열
		System.out.println(t1);
		System.out.println(t1.toString()); //Object.toString()
		//stem.out.println(t1.info()); //남들이 이 메소드를 뭔지 모름
		
		//앞으로 덤프용 메소드 > toString()
		
		
	}//main
	
	
	
}


 class Time {
	
	private int hour;
	private int min;
	
	
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}


//	@Override
//	public String toString() {
//		return String.format("Time [hour=%s, min=%s]", hour, min);
//	}
	
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Time [hour=");
//		builder.append(hour);
//		builder.append(", min=");
//		builder.append(min);
//		builder.append("]");
//		return builder.toString();
//	}
	
	/*
	//메소드 오버라이드(재정의) > 덤프용 메소드
	public String toString() {
		
		return String.format("%d: %d", this.hour, this.min);
	}
	
	//객체의 내용을 덤프하는 용도 > 객체의 상태를 한번에 확인 용이
	public String info() {
		
		return String.format("%d: %d", this.hour, this.min);
	}
	 */
	
//	@Override
//	public String toString() {
//		
//		return //내맘대로 고치기();
//	}
	
	@Override //= Annotation(주석)
	//   - 프로그래밍 기능을 하는 주석
	//   - 아래나 옆에 붙어있는 요소를 대상으로 특정 행동을 한다.
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}

	
	
 }

class Parent {
	
	public void test() {
		
	}//test 이거 없애면 자식의 public void test() 메소드 경고뜬다. 
				//=> 너 부모의 테스트 가져온건데 부모 테스트 그거 사라졌어 알고있어라 라는 의미 

}


class Child extends Parent {
	
	//test쓴후 ctrl+space 누름
	@Override //관리 차원의 어노테이션(위에서 설명한 경고하는 의미)
	public void test() {
		super.test();
	}
}



