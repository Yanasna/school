package dy250311;

public class Student {
	
	private String name;
	private int stuId;
	private int age;
	
	public Student(String name, int stuId, int age) {
		this.name = name;
		this.stuId = stuId;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public int getstuId() {
		return stuId;
	}
	public int getage() {
		return age;
	}
}
