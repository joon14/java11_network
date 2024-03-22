package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClientAnswer6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		int port = 3000;
		try {
			//문제1. 클라이언트는 port번호와 ip주소 둘 다 입력해야하지만 아래 코드는 ip주소가 없음
			socket = new Socket("127.0.0.1",port);//socket = new Socket(port);
			if(socket != null) {
				System.out.println("[Client]");
				System.out.println("서버와 연결 성공!");
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
			// 이하 코드는 중간 생략..

			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
