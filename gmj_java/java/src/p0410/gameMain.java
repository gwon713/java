package p0410;

import java.util.Scanner;

class Game{
	Scanner sc = new Scanner(System.in);
	int hp=30,exp=0,level=1,select;
	boolean toggle = true;
	void eat(){
		System.out.println("-----밥먹기----- hp+5");
		hp+=5;
	}
	void sleep(){
		System.out.println("-----잠자기-----hp+10");
		hp+=10;
	}
	void play(){
		System.out.println("-----놀기-----hp-8 exp+10");
		hp-=8;
		exp+=10;
		if(exp>=20){
			level+=1;
			exp=0;
			System.out.println("level up");
		}
		if(hp<=0){
			System.out.println("-----사망-----  level : "+level);
			toggle=false;
		}
	}
	void exercise(){
		System.out.println("-----운동하기-----hp-15 exp+15");
		hp-=15;
		exp+=15;
		if(exp>=20){
			level+=1;
			exp=0;
			System.out.println("level up");
		}
		if(hp<=0){
			System.out.println("-----사망-----  level : "+level);
			toggle=false;
		}
	}
	void check(){
		System.out.println("-----상태확인-----");
		System.out.println("hp : "+hp+" exp : "+exp+" level : "+level);
	}
	void end(){
		System.out.println("-----종료-----");
		toggle=false;
	}
	void select(int s){
		
	}
	void menu(){
		while(toggle){
			System.out.println("메뉴\n1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.상태확인 6.종료");
			System.out.print("선택 : ");
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
