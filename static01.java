package obj;

public class static01 {
	
	public static void main(String[] args) {
		
	
		//[static_01]
	
		//static 키워드
		//- *클래스 멤버*에 붙이는 키워드
		//1. 멤버 변수
		//2. 멤버 메소드
	
		//static int a = 10;
		
		//- 조건: Student의 모든 객체는 "땡땡중학교"이다. 이므로 문제가 됨
		//- 문제점(왜?): 메모리에 동일 데이터가 쌓이고 있다. 
	
	
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		s1.setSchool("땡땡중학교");
		System.out.println(s1.info());
		
		Student s2 = new Student();
		s1.setName("삐옥이");
		s1.setAge(14);
		s1.setSchool("땡땡중학교");
		System.out.println(s1.info());
		
		Student s3 = new Student();
		s1.setName("아무개");
		s1.setAge(16);
		s1.setSchool("땡땡중학교");
		System.out.println(s1.info());
		

	}//main

}

//Ctrl + Shift + L 


//class Student2(x) { 
//	
//}

//class Student3(x) {
//	
//}
//식별자에 숫자 쓰지 말것! 안좋은 습관임

//학생 클래스
//- "땡땡중학교" : 전원 모두(조건)


class Student{

	//	private int a;
	//	private static int b; //접근지정자와 스태틱은 순서를 가리지 않으나 접근지정자를 먼저적는것이 일반적임
	
	//public void c() {}
	
	//public static void d() {}
	
	private String name;
	private int age;
	private String school; //역삼 중학교는 말로 한 것이고 프로그램상으로는 추가 안되어있다.그래서 따로 지정한것!
	
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String info() { //한꺼번에 확인 가능한 info
		
		//String temp = "";
		//temp += "이름: " + this.name;
		//return temp;
		
		//printf("%s..")가 생각남..왜냐? 귀찮잖아!
		//String.format()
		
		//printf() -> String.format()
		//출력용 	   -> 형식문자를 똑같이 쓰면서 문자열을 만드는 역할
		
		
//		String result = String.format("%s님", this.name);


		return String.format("이름: %s, 나이: %s, 학교: %s"
								, this.name
								, this.age
								, this.school);
		
	}
	
	
	
}


