package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClientAnswer7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		//문제1. 문제에서 제시한 포트번호를 이용하고 있지 않음
		int port = 8888;//int port = 8000;
		try {
			socket = new Socket("localhost", port);
			//문제2. 소켓이 연결되지 않을 경우에 실행문을 실행하도록 잘못되어 있음
			if(socket != null) {//if(socket == null) {
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
