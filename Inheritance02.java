package obj;

import java.util.Random;

public class Inheritance02 {
	
	
	public static void main(String[] args) {
		//[Inheritance02]
		
		//m1();
		m2();
		
		
		
		
	}//main

	private static void m2() {

		//요구사항] 난수 생성기를 만드시오.
		//상황] 개발자. 담당업무 > 난수 발생 코드 잦은 사용
		//1. -21억 ~ +21억 정수
		//2. 1 ~ 10사이의 정수
		//3. 색상 난수: red, yellow, blue, orange, green
		//4. 논리 난수: true, false
		
		//work1();		//불편
		//work2();		//보통
		//work3();		//좀 더 편해짐
		work4();		//가장 이상적인 방법
		
		
		
		
	}//m2

	private static void work4() {

		//도구 통합 + 기존의 Random을 추가 구현없이 사용 가능 > 상속
		UtilRandom rnd = new UtilRandom();
		
		//1.
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		
		//2.
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());

		
		//3. 
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());

		
		//4.
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextBoolean());
		
	}

	
	
	private static void work3() {

		//도구 통합 > Random -> MyRandom();
		MyRandom rnd = new MyRandom();
		
		//1.
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());

		//2.
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());
		System.out.println(rnd.nextTinyInt());

		//3.
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextColor());
		
		
		//4.
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextBoolean());
		
		
		
		
	}

	private static void work2() {
		
		//난수 작업 > 사용되는 도구 > 2개 > 혼잡> Random vs MyRandom ?? 
		//											=> 그래서 도구를 하나로 통일 필요
		
		
		Random rnd = new Random();
		MyRandom myrnd = new MyRandom();
		
		
		//1.
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		
		
		//2.
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		
	
		//3.
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		
	}
	
	

	private static void work1() {

		Random rnd = new Random();
		
		//1.
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		
		//2. 약간의 추가 비용 발생
		System.out.println(rnd.nextInt(10) + 1);
		System.out.println(rnd.nextInt(10) + 1);
		System.out.println(rnd.nextInt(10) + 1);
		System.out.println(rnd.nextInt(10) + 1);
		System.out.println(rnd.nextInt(10) + 1);

		//3. 색상 랜덤, 추가 비용 많이 발생
		String[] colors = { "red", "yellow", "blue", "orange", "green" };
		
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		
	}

	private static void m1() {

		//난수 생성
		//1. Math.random()
		//2 Random 클래스 > Math.random()을 사용하기 편하게 만든 클래스
		
		//0 ~ 9 사이의 난수
		for (int i=0; i<10; i++) {
		System.out.println(getRandom(10));
		}
		
		
		//Random 클래스
		Random random = new Random();
		
		for (int i=0; i<10; i++) {
			//System.out.println(random.nextInt()); 	// -21억 ~ +21억 정수 난수
			//System.out.println(random.nextDouble()); 	// 0 ~ 1 실수 난수
			//System.out.println(random.nextBoolean());
			//System.out.println(random.nextLong());
			System.out.println(random.nextInt(10)); 	// 사용빈도 多
		}
		
		
		
	}//m1
	
	
	//역할: 코드 비용 절감효과는 미비, 하지만 가독성(좋음), 사용법(좋음)
	public static int getRandom(int max) {
		
		return (int)(Math.random() * max);
	}

}
