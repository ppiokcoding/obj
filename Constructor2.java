package obj;

public class Constructor2 {
	
	public static void main(String[] args) {
		
		//[Constructor_2]
		
		//생성자(오버로딩)
		
		Developer hong = new Developer();
		
		hong.setName("김철수");
		hong.setLanguage("Java");
		
		
		Developer hong2 = new Developer("김철수", "Java");
		
		Developer hong3 = new Developer("김철수"); //미정
		
		
	}//main

}

class Developer{
	
	private String name;
	private String language;
	
	//**자바는 사용자가 어떤 형태의 생성자를 1개 이상 선언하면, 더 이상 기본 생성자를 자동으로 생성하지 않는다.
	
	//생성자 + 유효성 검사!!
	
	//생성자 오버로딩을 구현하면 > 중복되는 코드 발생 > this() 호출형태로 다른 생성자를 호출해서 중복 코드를 최소화
	
public Developer() {
		
		//new Developer("익명", "미정");
		//this.name = "익명";
		//this.language = "미정";
		
		//Developer("익명", "미정");
		this("익명", "미정"); //또 다른 생성자 호출하는 방법
		
	}
	
	public Developer(String name, String language) {
		//if (유효성 검사) {
		this.name = name;
		this.language = language;
		//}
	}
	
	public Developer(String name) {
		//this.name = name;
		//this.language = "미정";
		
		this(name, "미정");
	}
	
//	public Developer(String language) {
//		this.name = "익명";
//		this.language = language;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
