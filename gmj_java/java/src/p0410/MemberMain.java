package p0410;

import java.util.Scanner;

class Member{
	String id,pwd,name,email;
	
	void setMember(String id,String pwd,String name,String email){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
	void printMember(){
		System.out.println("====ȸ���������====");
		System.out.println("id : "+id);
		System.out.println("pwd : "+pwd);
		System.out.println("name : "+name);
		System.out.println("email : "+email);
	}
}
public class MemberMain {
	static void signup(Member m, Scanner sc){

		System.out.print("ȸ������");
		System.out.print("id : ");
		String id=sc.nextLine();
		System.out.print("pwd : ");
		String pwd=sc.nextLine();
		System.out.print("name : ");
		String name=sc.nextLine();
		System.out.print("email : ");
		String email=sc.nextLine();
		
		m.setMember(id, pwd, name, email);
	}
	static void login(Member m,Scanner sc){
		while(true){
			System.out.print("�α���");
			System.out.print("id : ");
			String id=sc.nextLine();
			System.out.print("pwd : ");
			String pwd=sc.nextLine();
			if(m.id.equals(id)&&m.pwd.equals(pwd)){
				System.out.println("�α��� ����");
				break;
			}else {
				System.out.println("�α��� ����");
			}
		}	
	}
	static void edit(Member m,Scanner sc){
		System.out.print("���� ����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean login = false;
		Member m1 = new Member();
		signup(m1,sc);
		login(m1,sc);
		m1.printMember();

//		System.out.print("������ ȸ�� ���� ���");
	}

}
