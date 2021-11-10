package obj;

import java.util.Calendar;

public class class03 {

	public static void main(String[] args) {
		
		//{class_03]
		
		//** (되도록) 자바에선 물리적인 파일 1개에 클래스 1개를 선언한다.
		//** 이유: 관리차원에서..
		//** 파일의 이름은 반드시 클래스의 이름과 동일해야 한다. > 안지키면 컴파일 오류 발생 
		//		> 파일에 2개이상의 클래스를 선언한다면 반드시 딱 1개의 클래스에만 public 키워드를 붙인다. 
		//		> 대표 클래스가 된다. > 대표 클래스의 이름이 파일명이 된다.
		
		//질문1 > Size 클래스 잘못됐다. > 찾아서 수정
		//질문2 > class02 클래스 잘못됐다 > 찾아서 수정
		//2번 질문은 바로 찾을 수 있다. 그러나 1번 질문은 발견하기 힘들다. 파일 이름과 똑같지 않기 때문!
		// -> 한 파일 안에 2개 이상의 클래스를 선언 > 대표 클래스 외에는 외부에 노출이 안되서 찾기가 힘들다.
		
		
		//학생 클래스 > Student
		
		//Student(s1)의 역할: 학생 1명의 정보를 담는 컨테이너 > 다른 학생 정보와 구분지어 관리할 수 있다. 
		Student s1 = new Student();
		s1.name = "김아무개";
		s1.kor  = 100;
		s1.eng  = 90;
		s1.math = 80;
		
		s1.tel = new String[] { "010-1234-5555", "010-5678-9999" };
		s1.birthday = Calendar.getInstance();
		s1.birthday.set(1995, 11, 11);
		
		//"김아무개"는 데이터의 저장소 역할만 하고 성적처리와 출력은 외부에서 했음.
		int total = s1.kor + s1.eng + s1.math;
		double avg = total / 3.0;
		
		System.out.printf("%s: 총점 %d점, 평균 %.1f점\n"
							, s1.name
							, total, avg);
		
		
		
		
		//현재는 이 방법을 더 추천
		Student s2 = new Student();
		
		s2.name = "박철수";
		s2.kor  = 80;
		s2.eng  = 20;
		s2.math = 10;
		
		s2.printScore(); //아무개 본인이 직접 자신의 성적을 처리하고 직접 출력을 했음.
		s1.printScore();
		
		
		//본인이 가지고 있는 자신의 성적을 이용해서 계산된 값을 돌려주는 행동 > 잘 만들어진 메소드
		System.out.println(s1.getTotal());
		System.out.println(s2.getAvg());
		
		
	}//main
	
	
}


