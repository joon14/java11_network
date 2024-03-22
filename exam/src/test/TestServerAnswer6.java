package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServerAnswer6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		//문제1. port번호는 3000이라고 제시되었지만 아래 코드는 3333으로 포트번호를 잘못 기입함.
		int port = 3000;//int port = 3333;
		String serverIP = "127.0.0.1";
		ServerSocket server = null;
		try {
			//문제2.서버소켓은 port번호만 입력하면 되지만 해당 코드는 ip주소와 포트번호 둘 다 있으므로 오류가 발생
			server = new ServerSocket(port);//server = new ServerSocket(serverIP, port);
			//문제3. Socket socket = server.accept(); 가 없어 클라이언트의 요청을 기다릴 수가 없음
			//-> 클라이언트의 요청을 기다리기 위해 Socket socket = server.accept(); 가 있어야 하지만 해당 코드가 존재하지 않으므로 추가함.
			Socket socket = server.accept();
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			System.out.println(socket.getInetAddress().getHostAddress() + " 가 연결을 요청함...");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter((socket.getOutputStream()));
		// 이하 코드는 중간 생략..
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
