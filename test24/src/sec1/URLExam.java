package sec1;

import java.net.MalformedURLException;
import java.net.URL;

public class URLExam {
	public static void main(String[] args) throws MalformedURLException {
		URL webtoon = new URL("https://comic.naver.com/index");
		System.out.println("프로토콜 종류 : "+webtoon.getProtocol());
		System.out.println("포트 번호 : "+webtoon.getPort());
		System.out.println("호스트 이름 : "+webtoon.getHost());
		System.out.println("파일(경로 포함) : "+webtoon.getFile());
		System.out.println("전체 URL : "+webtoon.toExternalForm());
	}
}
