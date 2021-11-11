package obj;

public class member1 {
	
	public static void main(String[] args) {
		
		
		//- 클래스 멤버 변수의 자료형
		
		User hong = new User();
		hong.setName("홍수한무");
		hong.setAge(40);
		
		String[] nick = new String[3];
		nick[0] = "거북이";
		nick[1] = "와";
		nick[2] = "두루미";
		
		hong.setNick(nick);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		
		System.out.println(hong.getNick()[0]);
		
		String[] temp = hong.getNick();
		System.out.println(temp[0]); 
		
		
		
		
		User test = new User();
		
		test.setName("삼천갑산");
		test.setAge(50);
		test.setFriend(hong);
		
		System.out.printf("%s의 친구는 %s입니다.\n"
							, test.getName()
							, test.getFriend().getName()); //메소드 체인
		
	}//main

}
class User {
	//클래스 멤버 변수
	// - 자료형? 
	// - 모든 자료형의 멤버를 만들 수 있다.
	private String name; //변수 생성
	private int age;
	private String[] nick = new String[3]; //문자열 배열 - 3개의 방
	private User friend; //모든 변수는 멤버변수가 될 수있다.
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String[] getNick() {
		return nick;
	}
	
	public void setNick(String[] nick) {
		this.nick = nick;
	}

	public User getFriend() {
		return friend;
	}

	public void setFriend(User friend) {
		this.friend = friend;
	}
	
	
	
}