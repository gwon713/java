package p0410;

import java.util.Scanner;

class Game{
	Scanner sc = new Scanner(System.in);
	int hp=30,exp=0,level=1,select;
	boolean toggle = true;
	void eat(){
		System.out.println("-----��Ա�----- hp+5");
		hp+=5;
	}
	void sleep(){
		System.out.println("-----���ڱ�-----hp+10");
		hp+=10;
	}
	void play(){
		System.out.println("-----���-----hp-8 exp+10");
		hp-=8;
		exp+=10;
		if(exp>=20){
			level+=1;
			exp=0;
			System.out.println("level up");
		}
		if(hp<=0){
			System.out.println("-----���-----  level : "+level);
			toggle=false;
		}
	}
	void exercise(){
		System.out.println("-----��ϱ�-----hp-15 exp+15");
		hp-=15;
		exp+=15;
		if(exp>=20){
			level+=1;
			exp=0;
			System.out.println("level up");
		}
		if(hp<=0){
			System.out.println("-----���-----  level : "+level);
			toggle=false;
		}
	}
	void check(){
		System.out.println("-----����Ȯ��-----");
		System.out.println("hp : "+hp+" exp : "+exp+" level : "+level);
	}
	void end(){
		System.out.println("-----����-----");
		toggle=false;
	}
	void select(int s){
		
	}
	void menu(){
		while(toggle){
			System.out.println("�޴�\n1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� 6.����");
			System.out.print("���� : ");
			select=sc.nextInt();
			switch(select){
			case 1 :
				eat();
				break;
			case 2 :
				sleep();
				break;
			case 3 :
				play();
				break;
			case 4 :
				exercise();
				break;
			case 5 :
				check();
				break;
			case 6 :
				end();
				break;
			default :
				System.out.println("-----error-----");
				break;
			}
		}
	}
}
public class gameMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Game a = new Game();
		a.menu();
	}

}
