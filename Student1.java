package dy250311;

public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Student st1 = new Student("�迵��", 20221053, 23);
		Student st2 = new Student("�����", 20221051, 23);
		
		System.out.println("�̸� : " + st1.getName() + " �й� : " + st1.getstuId() + " ���� : " +  st1.getage());
		System.out.println("�̸� : " + st2.getName() +  " �й� : " + st2.getstuId() + " ���� : " + st2.getage());
	}

}
