package dy250311;

public class Car {
	
	private String color; //���⼭ �ۿ� ����
	private int speed =  0; 
	static int carCount = 0; // static --> only one / Sharing 
	final static int MAXSPEED = 200;  
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	Car(){}
	
	//������
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
		carCount++;
	}
	
	void upSpeed(int value) {
		if(speed + value >= 200)
		{
			speed += 200;
		}
		else 
			speed = speed + value;
		
	}
	void downSpeed(int value) {
		if(speed - value <= 0)
		{
			speed  = 0;
		}
		else 
		{
			speed  = speed - value;
		}
		
	}
	
	public String getColor() {
		return color; 
		
	}
	public String setColor() {
		return color; 
		
	}
	public int getSpeed() {
		return speed;
	}
	public int setSpeed() {
		return speed;
	}
//private �ؼ� getColor�� �޾ƾ���

}
	