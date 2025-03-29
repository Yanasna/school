package pro0325;

import java.util.*;

import java.io.*;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> userList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("이름을 입력하세요");
			String name = sc.nextLine();
			if(name.equals("그만"))
				break;
			System.out.println("나이를 입력하세요(그만입력시 종료)");
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
		System.out.println("파일 생성 완료");
		fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			}	
		}
		
	}
