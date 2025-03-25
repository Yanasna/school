package pro0325;

import java.io.File;
import java.io.*;


public class TextcopyEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			File src = new File("C:\\Users\\313\\Yellow.txt");
			File dest = new File("C:\\Users\\313\\system.txt");
			
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			int c;
			while((c = fr.read()) != -1) {
				fw.write((char)c );
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "파일 복사 완료" + dest.getPath());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.print("파일 복사 에러");
			
		}
	}

}
