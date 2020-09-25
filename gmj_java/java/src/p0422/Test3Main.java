package p0422;

import java.util.Scanner;

public class Test3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] del = {"십장생","개나리","진달래","꽃놀이","산책"};
		System.out.println("메세지를 입력하시오 ");
		String msg = sc.nextLine();
		System.out.println("원본 메세지");
		System.out.println(msg);
		for(String s:del){
			if(msg.contains(s)){
				msg = msg.replace(s, "삐리리");
			}
		}
		System.out.println("처리 메세지");
		System.out.println(msg);
	}

}
