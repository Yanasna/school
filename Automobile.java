package pro0317;


//부모 설계도
class Car {
	//1.속성 메소드
	protected String color;  //색상
	 
	protected int speed; //속도
	
	//private 자식에 상속 안됨
	
	
	//2. 생성자
	Car(){}
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	//3. 할일 메소드
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void upspeed(int value) {
		speed = speed + value;
		if(speed > 200)
			speed = 200;
	}

		
}


//자식클래스
public class Automobile extends Car{
	
	//1.속성 메소드
	private int seatNum;
		//2. 생성자
	Automobile(String color, int speed, int seatNum){
		this.color = color;
		this.speed = speed;
		this.seatNum = seatNum;
		
	}
		//3. 할일 메소드
		//source -> generate 

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
@Override
void upspeed(int value) {
	//protected는 자식 상속 가능하다.
	// TODO Auto-generated method stub
	speed = speed + value;
	if (speed > 300)
		speed = speed + value;
		
}
}
