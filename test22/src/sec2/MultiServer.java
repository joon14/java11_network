package sec2;

import java.io.IOException;
//import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//import java.net.UnknownHostException;

public class MultiServer {
	public static void main(String[] args) {
		/* public void start(){} 라고 한 경우,
		MultiServer multi = new MultiServer();
		multi.start();
		*/
		start();
	}
	
	public static void start() {
		/*
		String addr = null;
		InetAddress local;
		try {
			local = InetAddress.getLocalHost();
			addr = local.getHostAddress();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		*/
		
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			server = new ServerSocket(8000);
			
			while(true) {
				//System.out.println(addr+"[Server 실행] : Client 연결 대기 중...");
				System.out.println("[Server 실행] : Client 연결 대기 중...");
				socket = server.accept();
				ReceiveThread receiveThread = new ReceiveThread(socket);
				receiveThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(server != null) {
				try {
					server.close();
					System.out.println("[서버 종료]");
				} catch (IOException e) {
					System.out.println("[서버 소켓 통신 오류]");
					e.printStackTrace();
				}
			}
		}
	}
}
