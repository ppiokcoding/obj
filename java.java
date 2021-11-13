package obj;

public class java {

	public static void main(String[] args) {
		

		PencilCase pcase = new PencilCase();
		
		pcase.init(); //x 5자루
		pcase.list();
		System.out.println();
		
		Pencil p = new Pencil();
		p.setColor("white");
		p.setThickness(20);
		
		pcase.add(p); //x 6자루
		pcase.list();
		System.out.println();
		
		
		pcase.get(2);
		
	}//main

}

class PencilCase {
	private Pencil[] list = new Pencil[10]; // ******** 핵심
	private int index = 5;// 0~4까지는 이미 Pencil을 채웠으니까 > 필통안의 연필 개수

	// cook(), add()
	public void init() {

		// 배열 > 5개 펜슬을 추가하기
		for (int i = 0; i < 5; i++) {

			Pencil p = new Pencil();

			// p.color = "";
			// p.thickness = 10;
			p.setColor("black"); // 난수 처리 완료
			p.setThickness(10);

			this.list[i] = p; // 필통안에 펜을 넣는 행동

		}

	}// cook()

	public void add(Pencil p) {

		if (this.index >= this.list.length) {
			System.out.println("필통이 꽉 찼습니다.");
			return; // 강제 종료
		}

		this.list[index] = p;
		this.index++;

	}

	// 필통안의 연필을 확인(가져오기)
	// - 전체
	// - 1개

	public void list() {

		// 배열의 방개수 > 10개
		// 배열안의 연필 개수 > 5개
		for (int i = 0; i < this.index; i++) {
			System.out.printf("%s(%d)\r\n", this.list[i].getColor(), this.list[i].getThickness());
		}

	}

	public void get(int index) {
		System.out.printf("%s(%d)\r\n", this.list[index].getColor(), this.list[index].getThickness());
	}

}

class Pencil {

	private String color;
	private int thickness;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

}
