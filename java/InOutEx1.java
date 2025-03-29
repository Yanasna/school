package pro0325;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class InOutEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		FileWriter fout = null;
		System.out.print("이름과 나이를 입력하세요 >> ");
		
		String name = sc.nextLine();
		
		int age = sc.nextInt();
		
		try {
			fout = new FileWriter("C:\\Users\\313\\test.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0 , 2);
			}
		fout.close();
		}catch(IOException e)
			{
				System.out.println("입출력 오류");
			}
		sc.close();
	}

}
