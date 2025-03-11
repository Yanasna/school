package dy250311;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car();
		Car myCar2 = new Car("빨간색 ", 0);
		Car myCar3 = new Car("파랑", 0);
		Car iuCar = new Car("초록", 0);
		
		System.out.println(myCar1.getColor() + ", "+  myCar1.getSpeed());  // myCar1
		System.out.println(myCar2.getColor() + ", " + myCar2.getSpeed()); // myCar2
		System.out.println(myCar3.getColor() + ", " + myCar3.getSpeed());
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		myCar2.upSpeed(70);
		System.out.println(myCar2.getColor() + ", " + myCar2.getSpeed());
		
		System.out.println("생산된 차의 대수(정적 필드) ==> " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) == > " + Car.currentCarCount());
		System.out.println("차의 최고 제한 속도 ==> " + Car.MAXSPEED);
		
		System.out.println("PI의 값 :::: " + Math.PI);
		System.out.println("3의 5제곱 ==> " + Math.pow(3, 5));
		
	}	

}
