package sec1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

import sec1.ServerBack.ReceiveInfo;

public class ClientBack extends Thread {
	private String NickName, IPAddress;
	private int Port;
	private Socket socket;
	private String Message;
	private DataInputStream in;
	private DataOutputStream out;
	private ChatClientGUI chatgui;
	ArrayList<String> NickNameList = new ArrayList<String>(); // 유저목록을 저장합니다.

	public void getUserInfo(String NickName, String IPAddress, int Port) {
		this.NickName = NickName;
		this.IPAddress = IPAddress;
		this.Port = Port;
	}

	public void setGui(ChatClientGUI chatgui) {
		this.chatgui = chatgui;
	}
	
	@Override
	public void run() {
		try {
			socket = new Socket(IPAddress, Port);
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			out.writeUTF(NickName);
			while (in != null) { 
				//임의의 식별자를 받아 닉네임 혹은 일반 메세지를 구분
				Message = in.readUTF();
				if (Message.contains("+++닉네임의시작+++")) { 
					//"+++닉네임의시작+++" 라는 수식어가 붙어있는 경우, 닉네임으로 간주
					chatgui.UserList.setText(null);
					NickNameList.add(Message.substring(12));
					chatgui.AppendUserList(NickNameList);
				} else if (Message.contains("님이 입장하셨습니다.\n")) {
					//"님이 입장하셨습니다." 라는 식별자를 받으면 기존의 닉네임리스트(NickNameList) 초기화 후 새로입력
					NickNameList.clear();
					chatgui.UserList.setText(null);
					chatgui.AppendMessage(Message);
					//chatgui.AppendUserList(NickNameList);
				} else if (Message.contains("님이 퇴장하셨습니다.\n")) {
					//"님이 퇴장하셨습니다." 라는 식별자를 받으면 기존의 닉네임리스트(NickNameList) 초기화 후 새로입력
					NickNameList.clear();
					chatgui.UserList.setText(null);
					chatgui.AppendMessage(Message);
					//chatgui.AppendUserList(NickNameList);
				} else {
					//위 모든 조건이 아닌경우, 일반 메세지로 간주
					chatgui.AppendMessage(Message);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Transmit(String Message) {
		//입력받은 값을 서버로 전송
		try {
			out.writeUTF(Message);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
