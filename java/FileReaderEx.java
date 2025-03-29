package pro0325;

import java.io.FileReader;
import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fin = new FileReader("C:\\Users\\313\\Yellow.txt");
			int ch;
			while((ch = fin.read()) != -1) {
				System.out.print((char) ch);
			}
			fin.close();

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("ÆÄÀÏÀÌ ¾ø½À´Ï´Ù.");
		} catch(IOException e){
			e.printStackTrace();
		}
		}

}
