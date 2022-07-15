package day10;
//도메인 객체 -VO(Value Object), DTO(Data Transfer Object) =>값을 가지고 있는 객체
public class Student {
	
	private int id;
	private String name;
	
	public Student() { //기본생성자
		this(0,"아무개");
	}
	
	public Student(int id, String name) {
		this.id =id;
		this.name =name;
	}
	//setter getter--------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}////////////////////////
