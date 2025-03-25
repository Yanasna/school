package pro0325;

public class User {

	private String name;
	private int age;
	
	User(){}
	User(String name, int age){
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "User [이름=" + name + ", 나이=" + age + "]";
	}
	

}
