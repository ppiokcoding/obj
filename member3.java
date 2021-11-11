package obj;


public class member3 {
	
	public static void main(String[] args) {
		
		//더 좋은 방법
		//해결책: 상속 -> 다른방식으로 해결
		
		Family family = new Family();
		
		Person father = new Person();
		father.setName("홍길동");
		father.setAge(40);
		father.setHometown("서울");
		
		Person mother = new Person();
		mother.setName("홍길자");
		mother.setAge(44);
		mother.setHometown("서울");
		
		Person son = new Person();
		son.setName("홍철이");
		son.setAge(10);
		son.setHometown("서울");
		
		Person daughter = new Person();
		daughter.setName("홍말자");
		daughter.setAge(14);
		daughter.setHometown("서울");
		
		family.setFather(father);
		family.setMother(mother);
		family.setSon(son);
		family.setDaughter(daughter);
		
	}//main

}

class Family {
	
	private Person father;
	private Person mother;
	private Person son;
	private Person daughter;
	
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public Person getSon() {
		return son;
	}
	public void setSon(Person son) {
		this.son = son;
	}
	public Person getDaughter() {
		return daughter;
	}
	public void setDaughter(Person daughter) {
		this.daughter = daughter;
	}
	
}


//아빠, 엄마, 아들, 딸 -> 모든역할
class Person {
	
	
	private String name;
	private int age;
	private String Hometown;
	
	
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
	public String getHometown() {
		return Hometown;
	}
	public void setHometown(String hometown) {
		Hometown = hometown;
	}



}