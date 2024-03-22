package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		output1();
	}
	
	public static void output1() {
		//문제1. FileOutputStream은 byte단위 전송이므로 저장된 데이터인 "안녕하세요!" 는 한글이므로 byte단위로 전송 불가능하여 정상적으로 인코딩되지 못하고 데이터가 깨짐
		FileOutputStream fos = null; //-> FileWriter fos = null;
		try {
			fos = new FileOutputStream("test.txt");  //-> fos = new FileWriter("test.txt")
			String str = "안녕하세요!";
			/*
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
			*/
			try {
				//오류1. try~catch~
				//오류2. for문 삭제 후 charAt(i) -> getBytes()로 변경 => ※이렇게 고치면 틀림※
				fos.write(str.getBytes());	
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {	
			//오류3. 파일닫기 + try~catch 
			//문제2. 반환의무위배 :예외의 발생유무와 관계없이 사용한 자원은 반환되어야 하지만 현 코드상에 반환코드가 없음.  
			//파일을 닫지 않으면 다른곳에서 해당 파일을 사용하지 못하는 경우가 발생함
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
