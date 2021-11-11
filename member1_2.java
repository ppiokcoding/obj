package obj;

public class member1_2 {
	
	public static void main(String[] args) {
		
		
		Family family = new Family();
		
		family.setFatherName("홍길동");
		family.setFatherAge(40);
		family.setFatherHometown("서울");
		
		
		family.setMotherName("홍길자");
		family.setMotherAge(45);
		family.setMotherHometown("서울");
		
		family.setSonName("홍철수");
		family.setSonAge(10);
		family.setSonHometown("서울");
		
		
		family.setDaughterName("홍미미");
		family.setDaughterAge(12);
		family.setDaugherHometown("서울");
		
	}//main
	

}//class

//아빠, 엄마, 아들, 딸
//- 이름, 나이, 출생지
//- 멤버 변수의 성격 > 집합 발견!! > 좋은 코드(x) > 재구성!!! > 좋은 코드(o)
class Family{
	
	private String fatherName;
	private int fatherAge;
	private String fatherHometown;
	
	
	private String motherName;
	private int motherAge;
	private String motherHometown;
	
	
	public int getFatherAge() {
		return fatherAge;
	}

	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}

	public String getFatherHometown() {
		return fatherHometown;
	}

	public void setFatherHometown(String fatherHometown) {
		this.fatherHometown = fatherHometown;
	}

	public int getMotherAge() {
		return motherAge;
	}

	public void setMotherAge(int motherAge) {
		this.motherAge = motherAge;
	}

	public String getMotherHometown() {
		return motherHometown;
	}

	public void setMotherHometown(String motherHometown) {
		this.motherHometown = motherHometown;
	}

	public int getSonAge() {
		return sonAge;
	}

	public void setSonAge(int sonAge) {
		this.sonAge = sonAge;
	}

	public String getSonHometown() {
		return sonHometown;
	}

	public void setSonHometown(String sonHometown) {
		this.sonHometown = sonHometown;
	}

	public int getDaughterAge() {
		return daughterAge;
	}

	public void setDaughterAge(int daughterAge) {
		this.daughterAge = daughterAge;
	}

	public String getDaugherHometown() {
		return daugherHometown;
	}

	public void setDaugherHometown(String daugherHometown) {
		this.daugherHometown = daugherHometown;
	}
	private String sonName;
	private int sonAge;
	private String sonHometown;
	
	
	private String daughterName;
	private int daughterAge;
	private String daugherHometown;
	
	
	
	public String getFatherName() {
		return fatherName;
	}
	
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getSonName() {
		return sonName;
	}
	public void setSonName(String sonName) {
		this.sonName = sonName;
	}
	public String getDaughterName() {
		return daughterName;
	}
	public void setDaughterName(String daughterName) {
		this.daughterName = daughterName;
	}
	
	
}