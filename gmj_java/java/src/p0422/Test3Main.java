package p0422;

import java.util.Scanner;

public class Test3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] del = {"�����","������","���޷�","�ɳ���","��å"};
		System.out.println("�޼����� �Է��Ͻÿ� ");
		String msg = sc.nextLine();
		System.out.println("���� �޼���");
		System.out.println(msg);
		for(String s:del){
			if(msg.contains(s)){
				msg = msg.replace(s, "�߸���");
			}
		}
		System.out.println("ó�� �޼���");
		System.out.println(msg);
	}

}
