package pro0317;


//�θ� ���赵
class Car {
	//1.�Ӽ� �޼ҵ�
	protected String color;  //����
	 
	protected int speed; //�ӵ�
	
	//private �ڽĿ� ��� �ȵ�
	
	
	//2. ������
	Car(){}
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	
	//3. ���� �޼ҵ�
	
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


//�ڽ�Ŭ����
public class Automobile extends Car{
	
	//1.�Ӽ� �޼ҵ�
	private int seatNum;
		//2. ������
	Automobile(String color, int speed, int seatNum){
		this.color = color;
		this.speed = speed;
		this.seatNum = seatNum;
		
	}
		//3. ���� �޼ҵ�
		//source -> generate 

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
@Override
void upspeed(int value) {
	//protected�� �ڽ� ��� �����ϴ�.
	// TODO Auto-generated method stub
	speed = speed + value;
	if (speed > 300)
		speed = speed + value;
		
}
}
