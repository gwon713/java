package p0428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class EchoServerTh extends Thread{
	private Socket socket;
	public EchoServerTh(Socket socket){
		this.socket = socket;
	}
	public void run(){
		try{
			InputStream is = socket.getInputStream();//���Ͽ��� ���� ��Ʈ�� ����. �� Ŭ���̾�Ʈ�� ���� ������ ����
			InputStreamReader ir = new InputStreamReader(is);

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			while(true){
				String str = br.readLine();//Ŭ���̾�Ʈ�� ���� �޼��� ���� ����
				System.out.println("Ŭ���̾�Ʈ �޼���:"+str);
				out.println(str+"\n");//Ŭ���̾�Ʈ�� ���� �޼����� �ٽ� Ŭ���̾�Ʈ���� ����
				if(str.startsWith("/stop")){
					break;
				}
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket ss = new ServerSocket(3333);//���� ���� ���� �Ķ����
			System.out.println("���� ����");
			while(true){
				Socket socket = ss.accept();//Ŭ���̾�Ʈ ���� ��ٸ��� ��û����. ������ �� Ŭ���̾�Ʈ 1:1 ����� ���� ��ȯ
				System.out.println("Ŭ���̾�Ʈ ����");
				new EchoServerTh(socket).start();
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
