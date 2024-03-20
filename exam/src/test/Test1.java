package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		output1();
	}
	
	public static void output1() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.txt");
			String str = "안녕하세요!";
			/*
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
			*/
			try {
				//오류1. try~catch~
				//오류2. for문 삭제 후 charAt(i) -> getBytes()로 변경
				fos.write(str.getBytes());	
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {	
			//오류3. 파일닫기 + try~catch
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
