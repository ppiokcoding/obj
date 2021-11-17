package obj;

import java.util.Calendar;

public class obj_final {
	
	public static void main(String[] args) {
		
		//[final]
		
		
		//final 키워드
		//- 수정 불가능!!
		//- 지역변수, 멤버변수, 메소드, 클래스에게 사용한다.
		//1. 변수에 사용했을 때(*************)
		// - 값을 수정 할 수 없다.
		// - 상수
		//2. 메소드에 사용했을 때(x, 아직은 이름)
		// - 상속할 때 사용
		// - 메소드 오버라이드 방지
		//3. 클래스에 사용했을 때(x, 아직은 이름)
		// - 상속할 때 사용
		// - 상속 방지
		
		//지역 변수
		int a = 10; 
		final int b = 20;
		
		a = 30;
		//b = 40; final 로 바꿨으므로 바꾸면 안되는 값으로 됨
		
		System.out.println(a);
		System.out.println(b);
	
		
		//상수(final 변수)
		// - 이름을 모두 대문자로(****)
		
		final double PI = 3.14;
		
		//num 	//읽기, 쓰기 모두 가능
		//NUM		//읽기 전용
	
		
		System.out.println(PI);		//상수
	
		//int NUM = 100; //이렇게 하지마... 대문자로만 쓰는건 상수 설정할때 하는 것! 변수쓸때는 이렇게 하지마 제발
		
		int year = 1;
		System.out.println(Calendar.YEAR); //YEAR 변수...그러나 캘린더 상수라고 불렀음 
										   //왜냐 대문자로 되어있어서!
		//Calendar.YEAR = 200;  //오류메세지: The final field Calendar.YEAR cannot be assigned
		
		
		//c1.get(1)
		//c1.get(year) : 년 -> 월
		//c1.get(Calendar.YEAR)
		
		User u1 = new User();
		System.out.println(u1.age);
		//u1.age = 30; //The final field User.age cannot be assigned
		
		System.out.println(u1.GENDER); //읽기 전용 변수 -> 상수
		//u1.GENDER = "Male"; -> 누구도 안한다.
		
		
		System.out.println(Calendar.YEAR);
		
		
	}//main

}

class User {
	final public int age = 20;
	final public String GENDER = "Female"; 
	public static String school = "역삼중학교";
	
	final public static String HOMETOWN = "서울";
	
}


class FinalParent {
	
	//final 메소드
	//- 자식 클래스가 재정의하지 못하도록
	//- 왜? 재정의 됐을때의 일어난 여러가지 상황을 미리 예측해서 안정화를 못할 거 같아서
	final public void test() {
		System.out.println("부모 메소드");
	}
}


class FinalChild extends FinalParent{
//	@Override
//	public void test() {
//		System.out.println("메소드 재정의");
//		super.test();
//	}
}


//상속 불가능!!!
final class FinalUser {
	
	
}

//class FinalAdministrator extends FinalUser{
//	
//}


