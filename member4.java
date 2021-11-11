package obj;


public class member4 {
	
	public static void main(String[] args) {
		
		Family family = new Family();

		Person father = new Person();
		father.setName("홍길동");
		father.setAge(40);
		father.setHometown("서울");

		Person mother = new Person();
		mother.setName("호히호");
		mother.setAge(37);
		mother.setHometown("인천");

		Person son = new Person();
		son.setName("홍철수");
		son.setAge(15);
		son.setHometown("서울");

		Person daughter = new Person();
		daughter.setName("홍순자");
		daughter.setAge(12);
		daughter.setHometown("서울");
		

		
//		Person[] parent = new Person[2]; //진짜 배열 생성
//		parent[0] = father;
//		parent[1] = mother;
//		
//		family.setParent(parent); //배열을 매개변수로 전달
		
		Person[] children = new Person[2];
		children[0] = son;
		children[1] = daughter;
		
		family.setChildren(children);
		
		
		
		
		//배열 노출(X) -> 구성원 노출(O)
		family.setFather(father);
		family.setMother(mother);
		
		System.out.println(family.getParentName());
		
		
		User user = new User();
		user.addFriend(son); //User안의 friend배열의 첫번째방에 son 추가하기
		
		
		
		//배열 참조 변수를 만든것을 배열을 만들었다고 착각하지 말것!!!!
		//int[] nums; //= new int[3]		
		//nums[0] = 10;
		
		Family family2;
		//NullPointerException, NullReferenceException > 널참조 에러 > 참조 변수만 존재하고 객체는 없을 때 발생하는 에러 > 모든 에러 중 발생 1순위
		family.setFather(father); 
		
		
	}//main

}



class User{
	
	//배열을 참조할때
	//- 배열 참조 변수만 만들었다고 배열이 생성된 것이 아니다!!
	//- 반드시 new int[2]를 선언해야 진짜 배열이 만들어진다!!

	//배열의 길이? > 배열이 없다;;;
	private Person[] friend = new Person[10]; //배열 참조 변수 
	//						= new Person[2]; //진짜 배열
	
	public void addFriend(Person p) {
		this.friend[0] = p;
	}
}

class Family {
	
//	private Person father;
//	private Person mother;
	
//	private Person son;
//	private Person daughter;
	
//	private Person son1;
//	private Person son2;
//	private Person son3;
//	private Person son4;
	//지저분함
	
	
	
	//배열 참조변수는 만들었지만, 배열은 만들지 않았다.
	private Person[] parent; //=new Person[2];
	private Person[] children;//=new Person[2];
	
	public Person[] getParent() {
		return parent;
	}
	public void setParent(Person[] parent) {
		this.parent = parent;
	}
	public Person[] getChildren() {
		return children;
	}
	public void setChildren(Person[] children) {
		this.children = children;
	}
	
	
	
	//모든 경우 해당하는 얘끼가 아님!!!
	//- 배열을 외부에 노출시키면 > 외부에서 객체를 사용하기가 불편하다.
	//- 배열을 감추고 > 사용법을 개량
	public void setFather(Person father) {
		this.parent[0] = father;
	}
	
	public Person getFather() {
		return this.parent[0];
	}
	
	public void setMother(Person mother) {
		this.parent[1] = mother;
	}
	
	public Person getMother() {
		return this.parent[1];
	
	}

	public String getParentName() {
		String temp = "";
		
		for(int i=0; i<this.parent.length; i++) {
			temp += this.parent[i].getName() + ",";
		}
		return temp;
	}
	
}


//아빠, 엄마, 아들, 딸 -> 모든역할
class Person {
	
	private String name;
	private int age;
	private String hometown;
	
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
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
}
