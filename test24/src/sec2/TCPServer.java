package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TCPServer {
	public static void main(String[] args) {
		ServerSocket server = null;	//서버용
		Socket socket = null;		//클라이언트용
		
		Scanner sc = new Scanner(System.in);	//메시지 입력
		
		BufferedReader in = null;	//메세지 받기
		PrintWriter out = null;		//메세지 보내기
		
		try {
			server = new ServerSocket(6000);
			System.out.println("Server Port : 6000");	//특정 포트번호로 서버 시작
			socket = server.accept();					//클라이언트 연결 대기
			System.out.println("Connected Waiting...");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				//수신
				String inMessage = in.readLine();	//클라이언트로 부터 온 메세지
				System.out.println("[From Client] : "+inMessage);
				
				if(inMessage.contains("quit")) {
					break;
				}
				
				System.out.print("[Send to Message] : ");
				String outMessage = sc.nextLine();	//클라이언트로 보낼 메세지 작성
				
				//발신
				out.println(outMessage);	//송신 객체에 메세지 저장
				out.flush();				//클라이언트에게 송신 메시지 전달
				
				if(outMessage.contains("quit")) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Socket Starting Error");
		} finally {
			try {
				sc.close();
				socket.close();
				server.close();
				System.out.println("Connected Exit!");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Socket Error!");
			}
		}
	}
}
