
package dy250311;


import java.util.Scanner;
import java.util.Random;

public class dy25031101 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd  = new Random();
		
		System.out.println("���� �Ǵ� ����� �Է� >>  ");
		String zapanki = sc.nextLine();
		if(zapanki.equals("�����")) {
			int juice = rd.nextInt(5) + 1; 
			
			switch(juice) {
			case 1 : 
				System.out.println("������ ���̴�");
				break;
			case 2 : 
				System.out.println("���ڿ�");
				break;
			case 3 : 
				System.out.println("�ݶ�");
				break;
			case 4 : 
				System.out.println("��ī��");
				break;
			case 5 : 
				System.out.println("�� ����");
				break;
			}
		}
		else if(zapanki.equals("����")) {
			int cheaps = rd.nextInt(3) + 1;
			switch(cheaps) {
			case 1 : 
				System.out.println("��īĨ");
				break;
				
			case 2 : 
				System.out.println("����Ĩ");
				break;
				
			case 3 :  
				System.out.println("��!!!");
				break;
			}
		}
		else 
		{
			System.out.println("�ʿ���� ����~");
		}
		
		
		
	}

}
