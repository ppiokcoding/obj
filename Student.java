package obj;

import java.util.Calendar;

public class Student {
	
	//멤버 구성
	
	//1. 멤버 변수
	//- 모든 자료형을 사용할 수 있다.
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	
	
	public String[] tel;
	public Calendar birthday;
	
	//2. 멤버 메소드
	//- 자신의 성적을 출력하는 메소드
	public void printScore() {
		int total = kor + eng + math;
		double avg = total /3.0;
		
		System.out.printf("%s: 총점 %d점, 평균 %.1f점\n"
							, name
							, total, avg);
	}
	
	public int getTotal() {
		int total = kor + eng + math;
		return total;
	}
	
	public double getAvg() {
		int total = kor + eng + math;
		double avg = total / 3.0;
		return avg;
	}
	
	
}
