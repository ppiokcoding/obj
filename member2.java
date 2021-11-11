package obj;


public class member2 {
	
	public static void main(String[] args) {
		
		Family family = new Family();
		
		Father father = new Father();
		father.setName("홍길동");
		father.setAge(30);
		father.setHometown("서울");
		
		family.setFather(father);
		
	}//main
	
	

	//	private String fatherName;
	//	private int fatherAge;
	//	private String fatherHometown;
	//배열은 자료형과 성질이 똑같아야하기 때문에 클래스로 묶는다.
}

//아빠, 엄마, 아들, 딸
// -이름, 나이, 출생지
//- 멤버 변수의 성격 > 집합 발견!! > 무조건 묶어라!(배열, 클래스)
class Family{
	
	private Father father;
	private Mother mother;
	private Son son;
	private Daughter daughter;
	
	
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
	}
	public Mother getMother() {
		return mother;
	}
	public void setMother(Mother mother) {
		this.mother = mother;
	}
	public Son getSon() {
		return son;
	}
	public void setSon(Son son) {
		this.son = son;
	}
	public Daughter getDaughter() {
		return daughter;
	}
	public void setDaughter(Daughter daughter) {
		this.daughter = daughter;
	}
	
	
	
}

class Father{
	private String Name;
	private int Age;
	private String Hometown;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getHometown() {
		return Hometown;
	}
	public void setHometown(String hometown) {
		Hometown = hometown;
	}
	
}

class Mother{
	private String Name;
	private int Age;
	private String Hometown;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getHometown() {
		return Hometown;
	}
	public void setHometown(String hometown) {
		Hometown = hometown;
	}
	
}

class Son{
	private String Name;
	private int Age;
	private String Hometown;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getHometown() {
		return Hometown;
	}
	public void setHometown(String hometown) {
		Hometown = hometown;
	}
	
}

class Daughter{
	private String Name;
	private int Age;
	private String Hometown;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getHometown() {
		return Hometown;
	}
	public void setHometown(String hometown) {
		Hometown = hometown;
	}
	
}