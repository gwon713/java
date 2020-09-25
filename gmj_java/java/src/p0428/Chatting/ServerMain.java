package p0428.Chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatRoom room = new ChatRoom();
		try {
			@SuppressWarnings("resource")
			ServerSocket ss = new ServerSocket(3333);
			System.out.println("서버 시작");
			while(true){
				Socket socket = ss.accept();//클라이언트 접속대기
				ChatThread th = new ChatThread(socket, room);//접속완료 시 담당할 쓰레드 생성. 사용할 소켓과 채팅방 전달
				room.addMember(th);//생성한 쓰레드를 채팅방에 추가
				th.start();//쓰레드 실행
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
