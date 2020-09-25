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
			InputStream is = socket.getInputStream();//소켓에서 읽을 스트림 생성. 즉 클라이언트가 보낸 데이터 읽음
			InputStreamReader ir = new InputStreamReader(is);

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			while(true){
				String str = br.readLine();//클라이언트가 보낸 메세지 한줄 읽음
				System.out.println("클라이언트 메세지:"+str);
				out.println(str+"\n");//클라이언트가 보낸 메세지를 다시 클라이언트에게 보냄
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
			ServerSocket ss = new ServerSocket(3333);//서버 소켓 오픈 파라메터
			System.out.println("서버 시작");
			while(true){
				Socket socket = ss.accept();//클라이언트 접속 기다리다 요청수락. 수락후 이 클라이언트 1:1 통신할 소켓 반환
				System.out.println("클라이언트 접속");
				new EchoServerTh(socket).start();
			}
			
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
