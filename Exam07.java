package dy250311;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car();
		Car myCar2 = new Car("������ ", 0);
		Car myCar3 = new Car("�Ķ�", 0);
		Car iuCar = new Car("�ʷ�", 0);
		
		System.out.println(myCar1.getColor() + ", "+  myCar1.getSpeed());  // myCar1
		System.out.println(myCar2.getColor() + ", " + myCar2.getSpeed()); // myCar2
		System.out.println(myCar3.getColor() + ", " + myCar3.getSpeed());
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		myCar2.upSpeed(70);
		System.out.println(myCar2.getColor() + ", " + myCar2.getSpeed());
		
		System.out.println("����� ���� ���(���� �ʵ�) ==> " + Car.carCount);
		System.out.println("����� ���� ���(���� �޼ҵ�) == > " + Car.currentCarCount());
		System.out.println("���� �ְ� ���� �ӵ� ==> " + Car.MAXSPEED);
		
		System.out.println("PI�� �� :::: " + Math.PI);
		System.out.println("3�� 5���� ==> " + Math.pow(3, 5));
		
	}	

}
