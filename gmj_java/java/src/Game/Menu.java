package Game;

import java.util.Scanner;

public class Menu {
	void select_character(Scanner sc){
		
		Pocketmon poc = new Pocketmon();
		int menu;
		boolean flag = true;
		String str = "1.피카츄 2.이상해씨 3.파이리 4.종료";
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				poc = new Picachu();
				flag = false;
				break;
			case 2:
				poc = new Bulbasaur();
				flag = false;
				break;
			case 3:
				poc = new Charmander();
				flag = false;
				break;
			case 4:
				flag = false;
				break;
			}
		}
		run(sc,poc);
	}
	void run(Scanner sc,Pocketmon Pocket){
		int menu;
		boolean flag = true;
		String str = "1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.정보확인 6.종료 7.특기공격";
		Pocket.setInfo();
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				Pocket.밥먹기();
				break;
			case 2:
				Pocket.잠자기();
				break;
			case 3:
				flag = Pocket.놀기();
				break;
			case 4:
				flag = Pocket.운동하기();
				break;
			case 5:
				Pocket.printInfo();
				break;
			case 6:
				flag = false;
				break;
			case 7:
				if(Pocket instanceof Picachu){
					((Picachu)Pocket).전기공격();
				}
				if(Pocket instanceof Bulbasaur){
					((Bulbasaur)Pocket).덩쿨채찍();
				}
				if(Pocket instanceof Charmander){
					((Charmander)Pocket).화염방사();
				}
				break;
			}
		}
	}
	
}
