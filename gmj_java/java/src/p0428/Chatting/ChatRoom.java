package p0428.Chatting;

import java.util.Vector;

public class ChatRoom {
	private Vector<ChatThread> members;
	public ChatRoom(){
		members = new Vector<ChatThread>();//채팅방 생성
	}
	
	public void addMember(ChatThread ch){//채팅방에 한사람 추가
		members.add(ch);
	}
	public void delete(ChatThread ch){//채팅방에 한사람 삭제
		members.remove(ch);
	}
	public void sendMsgAll(String msg){//채팅방 모든 사람에게 메세지 전송
		for(ChatThread ch : members){
			ch.sendMsg(msg);
		}
	}
}
