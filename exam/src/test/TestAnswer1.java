package test;

//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestAnswer1 {
	public static void main(String[] args) {
		output1();
	}
	
	public static void output1() {
		FileWriter fos = null;
		//FileOutputStream fos = null;
		try {
			fos = new FileWriter("test4.txt");
			//fos = new FileOutputStream("test.txt");
			String str = "안녕하세요!";
			//fos.write(str);
			
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
