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
			System.out.println("���� ����");
			while(true){
				Socket socket = ss.accept();//Ŭ���̾�Ʈ ���Ӵ��
				ChatThread th = new ChatThread(socket, room);//���ӿϷ� �� ����� ������ ����. ����� ���ϰ� ä�ù� ����
				room.addMember(th);//������ �����带 ä�ù濡 �߰�
				th.start();//������ ����
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
