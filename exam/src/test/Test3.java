package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) {
		output1();
	}
	
	public static void output1() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test3.txt");
			String str = "kh정보교육원";
			/*
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
			*/
			try {
				//오류1. try~catch~
				//오류2. for문 삭제 후 charAt(i) -> getBytes()로 변경 : FileOutputStream은 바이트 단위로 출력하기 위한 스트림
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
