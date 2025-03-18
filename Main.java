package pro0317;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car("Àº»ö", 0);
		System.out.println(myCar1.getColor() + " , "  + myCar1.getSpeed());
		Automobile myAuto = new Automobile("Èò»ö", 0, 6);
		System.out.println(myAuto.getColor() + ", " + myAuto.getSpeed() + ", " + myAuto.getSeatNum());
		
		
		myCar1.upspeed(300);
		System.out.println(myCar1.getColor() + myCar1.getSpeed());
		
		
		myAuto.upspeed(300);
		System.out.println(myAuto.getColor() + ", " +myAuto.getSpeed());
	}

}
