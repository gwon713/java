package Game;

import java.util.Scanner;

public class Menu {
	void select_character(Scanner sc){
		
		Pocketmon poc = new Pocketmon();
		int menu;
		boolean flag = true;
		String str = "1.��ī�� 2.�̻��ؾ� 3.���̸� 4.����";
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
		String str = "1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� 6.���� 7.Ư�����";
		Pocket.setInfo();
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1:
				Pocket.��Ա�();
				break;
			case 2:
				Pocket.���ڱ�();
				break;
			case 3:
				flag = Pocket.���();
				break;
			case 4:
				flag = Pocket.��ϱ�();
				break;
			case 5:
				Pocket.printInfo();
				break;
			case 6:
				flag = false;
				break;
			case 7:
				if(Pocket instanceof Picachu){
					((Picachu)Pocket).�������();
				}
				if(Pocket instanceof Bulbasaur){
					((Bulbasaur)Pocket).����ä��();
				}
				if(Pocket instanceof Charmander){
					((Charmander)Pocket).ȭ�����();
				}
				break;
			}
		}
	}
	
}
