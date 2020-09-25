package p0428.Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatThread extends Thread {
	private Socket socket;//Ŭ���̾�Ʈ 1���� ����� ����
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
		String id = socket.getInetAddress().getHostName();//Ŭ���̾�Ʈ�� ip�� id����
		room.sendMsgAll("["+id+"]���� ���Խ��ϴ�.");//ä�ù濡 �ִ� ��ο��� ����޼��� ����
		while(true){
			String str;
			try {
				str = br.readLine();//����� Ŭ���̾�Ʈ 1���� �����ϴ� �޼����� ���پ� ��� �д´�.
				if(str.startsWith("/stop")){///stop�� �����ϸ� ������ �ɷ� ó��
					sendMsg(str);//����� Ŭ���̾�Ʈ 1���� ����޼��� ����
					room.delete(this);//ä�ù� ���Ϳ��� ���� ������ ��ü ����
					room.sendMsgAll("["+id+"]���� �����̽��ϴ�.");//ä�ù� ��ο��� ���� �޼��� ����
					break;
				}
				room.sendMsgAll("["+id+"]"+str);//���� �޼����� ä�ù� ��ο��� ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//��� Ŭ���̾�Ʈ�� �޼����� �޴´�.
			
		}
	}
	public void sendMsg(String msg){
		out.println(msg);
	}
}
