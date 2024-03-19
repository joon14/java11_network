package sec1;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionExam {
	public static void main(String[] args) {
		try {
			URL webtoon = new URL("https://comic.naver.com/index");
			URLConnection webtoonCon;
			try {
				webtoonCon = webtoon.openConnection();
				System.out.println("문서의 타입 : "+webtoonCon.getContentType());
				System.out.println("문서의 마지막 수정 일자 : "+new Date(webtoonCon.getLastModified()));
				System.out.println("문서의 크기 : "+webtoonCon.getContentLength()+"Bytes");
				
				int size = webtoonCon.getContentLength();
				if(size>0) {
					System.out.println("*** 문서의 내용은 다음과 같습니다. ***");
					InputStream input = webtoonCon.getInputStream();
					int i = size;
					int c;
					
					while(((c=input.read()) != -1) && (--i>0)) {
						System.out.print((char)c);
					}
					input.close();
				}
				else {
					System.out.println("문서의 내용이 없습니다.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
