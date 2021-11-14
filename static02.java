package obj;

public class static02 {
	
	
	//프로그램의 실행순서
	
	//1. 클래스 로딩(설계도를 확인하고 인식하는 과정)
	//2. 1번 과정 중에 모든 static(변수, 메소드)을 메모리에 할당 -- 그 과정중 static붙은애들 찾음
	//3. main() 시작
	//4. 나머지 코드
	//5. main() 종료
	
	public static void main(String[] args) {
		
		//[static_02]
		
		//*객체 멤버 변수의 역할
		//- static 키워드가 없는 변수
		//- 객체의 개인 데이터를 저장하는 변수
		//- 남들과 다른 데이터를 가질수 있는 역할> 개인(객체)의 특성을 만들어 낸다.
		//ex. 각 사람들의 이름, 나이, 몸무게 등
		
		
		//*static 멤버 변수의 역할
		//- 모든 객체가 공통으로 사용하는 데이터
		//- 공용 변수(역할), 정적 변수(물리) 
		//			> 즉, 다같이 쓰는 데이터가 있으면 static으로 만들면 편하다
		//ex. 사람들이 살고 있는 행성 등 
		//- 사는 행성 > static(o)
		//- 사는 국적 > static(x) 국적이 바뀔 여지가 있기 때문... 지금 당장은 괜찮아도 미래를 생각힐때 공용이 아닌 개별 데이터가 될 여지가 있음
		//				--> 30명중 1명이 미국으로 이사가 버리면..? 
		
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
class Student{

	//클래스 멤버 > 객체 멤버
	private String name;
	private int age;
	//클래스 멤버 > 정적 멤버
	private static String school; //스쿨 앞에 스태틱 붙임 -> this.school에 노란 밑줄 생김
								  //The static field Student.school should be accessed in a static way
								  //= 앞에 디스를 적으면 안된다는 의미! 대신 클래스 이름을 적어라

	//객체 메소드
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

	public static String getSchool() {
		return school;
	}

	//정적(=static) 메소드
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() { //얘도 heap에 있음 이때 this는 객체 자신

		return String.format("이름: %s, 나이: %s, 학교: %s"
								, this.name
								, this.age
								, Student.school); //this.school -> Student.school
								//this는 자기자신인데 그 안에 없으므로 스태틱을 찾아가야함
	}

	
}