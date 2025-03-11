
package dy250311;


import java.util.Scanner;
import java.util.Random;

public class dy25031101 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd  = new Random();
		
		System.out.println("과자 또는 음료수 입력 >>  ");
		String zapanki = sc.nextLine();
		if(zapanki.equals("음료수")) {
			int juice = rd.nextInt(5) + 1; 
			
			switch(juice) {
			case 1 : 
				System.out.println("나랑드 사이다");
				break;
			case 2 : 
				System.out.println("데자와");
				break;
			case 3 : 
				System.out.println("콜라");
				break;
			case 4 : 
				System.out.println("포카리");
				break;
			case 5 : 
				System.out.println("응 안줘");
				break;
			}
		}
		else if(zapanki.equals("과자")) {
			int cheaps = rd.nextInt(3) + 1;
			switch(cheaps) {
			case 1 : 
				System.out.println("포카칩");
				break;
				
			case 2 : 
				System.out.println("스윙칩");
				break;
				
			case 3 :  
				System.out.println("꽝!!!");
				break;
			}
		}
		else 
		{
			System.out.println("필요없음 가라~");
		}
		
		
		
	}

}
