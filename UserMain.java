package pro0325;

import java.util.*;

import java.io.*;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> userList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.nextLine();
			if(name.equals("�׸�"))
				break;
			System.out.println("���̸� �Է��ϼ���(�׸��Է½� ����)");
			int age = Integer.parseInt(sc.nextLine());
			
			
			
			User user1 = new User(name, age);
			userList.add(user1);
		}
		try {
		BufferedWriter fr = new BufferedWriter(new FileWriter("C:\\Users\\313\\1.txt"));
		
		for(User user : userList)
		{
			fr.write(user.toString());
			fr.newLine();
		}
		System.out.println("���� ���� �Ϸ�");
		fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			}	
		}
		
	}
