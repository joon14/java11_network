package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		BufferedReader in = null;	//메세지 받기
		PrintWriter out = null;		//메세지 보내기
		
		Socket socket = null;	//클라이언트용 소켓
		
		Scanner sc = new Scanner(System.in);	//메세지 입력
		
		try {
			socket = new Socket("127.0.0.1", 6000);	//서버연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				System.out.print("[From Client] : ");	//보낼 메세지 작성
				String outMessage = sc.nextLine();
				
				out.println(outMessage);	//보낼 메세지 저장
				out.flush();				//메세지 전송
				
				if(outMessage.contains("quit")) {
					break;
				}
				
				String inMessage = in.readLine();	//받은 메세지
				System.out.println("[From Server] : "+inMessage);
				
				if(inMessage.contains("quit")) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[Client Socket Error!]");
		} finally {
			try {
				sc.close();
				socket.close();
				System.out.println("[Client Socket Exit!]");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[Client Socket Exit Error!]");
			}
		}
	}
}
