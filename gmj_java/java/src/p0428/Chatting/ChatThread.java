package p0428.Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatThread extends Thread {
	private Socket socket;//클라이언트 1명을 담당할 소켓
	private BufferedReader br;//
	private PrintWriter out;
	private ChatRoom room;

	public ChatThread(Socket socket, ChatRoom room){
		this.socket = socket;
		this.room = room;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String id = socket.getInetAddress().getHostName();//클라이언트의 ip를 id지정
		room.sendMsgAll("["+id+"]님이 들어왔습니다.");//채팅방에 있는 모두에게 입장메세지 전송
		while(true){
			String str;
			try {
				str = br.readLine();//담당한 클라이언트 1명이 전송하는 메세지를 한줄씩 계속 읽는다.
				if(str.startsWith("/stop")){///stop를 전송하면 나가는 걸로 처리
					sendMsg(str);//담당한 클라이언트 1명에게 종료메세지 전송
					room.delete(this);//채팅방 벡터에서 현제 쓰레드 객체 삭제
					room.sendMsgAll("["+id+"]님이 나가셨습니다.");//채팅방 모두에게 나감 메세지 전송
					break;
				}
				room.sendMsgAll("["+id+"]"+str);//받은 메세지를 채팅방 모두에게 전송
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//담당 클라이언트의 메세지를 받는다.
			
		}
	}
	public void sendMsg(String msg){
		out.println(msg);
	}
}
