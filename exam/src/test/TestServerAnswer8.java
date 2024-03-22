package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestServerAnswer8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server = null;
		try {
			//문제1. 해당문제에 주어진 포트번호를 사용하지 않음
			server = new ServerSocket(8080);//server = new ServerSocket(8888);
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			//문제2. accept가 없음
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + " 가 연결을 요청함...");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter((socket.getOutputStream()));
			// 이하 코드는 중간 생략..
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
