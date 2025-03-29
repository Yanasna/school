package dy250311;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Student st1 = new Student("김영중", 20221053, 23);
		Student st2 = new Student("김희식", 20221051, 23);
		
		System.out.println("이름 : " + st1.getName() + " 학번 : " + st1.getstuId() + " 나이 : " +  st1.getage());
		System.out.println("이름 : " + st2.getName() +  " 학번 : " + st2.getstuId() + " 나이 : " + st2.getage());
	}

}
