package obj;

public class class02 {
	
	public static void main(String[] args) {
		
		
		//[class_02]
		
		//클래스의 멤버
		//1. 멤버 변수
		//2. 멤버 메소드
		
		//u1이라는 사람이 하는 행동 info()와
		//u2라는 사람이 하는 행동 info()는 구분이 되지 않는다.
		// -> 서로 다른 객체의 행동이 구분이 되지 않으면 u1과 u2라는 객체가 동시에 존재 할 필요성이 없어진다.
		
		User u1 = new User();
		
		u1.info(); //행동
		
		User u2 = new User(); // u1 != u2, 다른 사람이다.
		u2.info(); //행동 -->또 유저입니다. 나옴 
		
		User u3 = new User();
		u3.info(); //행동 -->또 유저입니다. 나옴
		//결국 u2부터 쓸데없는 애들을 만들게 된 것임. 메소드 차체가 누가 시키든 똑같은 결과만 나오도록 만든 메소드라 쓸데없이 메모리만 차치하는 나쁜 클래스 설계임
		//쓸데없는 같은 행동을 반복하게 하면 안됨
		
		u1.name = "홍길동";
		u1.hello();
		
		u2.name = "김나나";
		u2.hello();
		
		
	}//main

}


class User{
	
	//나쁜 메소드 -> 잘못 만든 메소드
	public void info() {
		System.out.println("유저입니다.");
		
	}
	
	//좋은 메소드 -> 객체가 자신만이 할 수 있는 일을 한다.
	// -> "자신이 가진 데이터를 활용해서 행동을 한다."
	public String name;
	
	public void hello() { 
		System.out.printf("안녕하세요. 저는 %s입니다.\n", name);
	}
	
}


