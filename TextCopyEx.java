package pro0325;

import java.io.*;


public class TextCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			FileInputStream ig = new FileInputStream("C:\\Users\\313\\cat.jpg");
			BufferedInputStream fi = new BufferedInputStream(ig);
			BufferedOutputStream fo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\313\\output.jpg"));
			
			
			int c;
			while((c = fi.read()) != -1) {
				fo.write((char)c );
			}
			fi.close();
			fo.close();
			System.out.println( "파일 복사 완료");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.print("파일 복사 에러");
		}
	}

}
