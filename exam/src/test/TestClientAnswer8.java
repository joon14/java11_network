package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestClientAnswer8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		try {
			//문제1. 해당 문제에서 주어진 ip주소를 사용하지 않음
			socket = new Socket("127.0.0.1", 8080);//socket = new Socket("192.168.0.1", 8080);
			//문제2. socket이 null이 아닐 때 실행문이 실행되어야함.
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
