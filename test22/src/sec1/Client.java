package sec1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("192.168.20.203", 6000);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				System.out.print("전송 : ");
				String outMsg = sc.nextLine();
				out.println(outMsg);
				out.flush();
				
				if("quit".equalsIgnoreCase(outMsg)) {
					break;
				}
				
				String inMsg = in.readLine();
				System.out.println("[From Server] "+inMsg);
				
				if("quit".equalsIgnoreCase(inMsg)) {
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				if(socket!=null) {
					socket.close();
				}
				System.out.println("[연결 종료!]");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
