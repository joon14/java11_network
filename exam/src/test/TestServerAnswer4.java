package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServerAnswer4 {
	public static void main(String[] args) {
		try {
			//문제(ServerSocket server = new ServerSocket();). 포트번호가 지정되지 않아 서버소켓이 생성되지 않아 통신할 수 없음
			//-> 조치사항. ServerSocket server = new ServerSocket("3000");
			ServerSocket server = new ServerSocket();
			Socket s = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
