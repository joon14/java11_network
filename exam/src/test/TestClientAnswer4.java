package test;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClientAnswer4 {
	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			//문제(Socket s = new Socket();). 서버소켓의 ip주소와 포트번호가 지정되지 않아 소켓이 생성되지 않았으므로 통신이 불가능하다.
			//-> 조치사항. Socket s = new Socket(ip, "3000");
			Socket s = new Socket();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
