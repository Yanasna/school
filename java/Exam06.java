package dy250311;

public class Exam06 {	
	
	static int var = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =  100, num2 = 0;
		try {
			System.out.println(num1/num2);
		}
		catch (java.lang.ArithmeticException e) {
			System.out.println("°è»ê¿¡ ¹®Á¦°¡ ÀÖ½À´Ï´Ù.");
			
//			e.printStackTrace();
		}
	}

}
