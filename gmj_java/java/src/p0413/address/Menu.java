package p0413.address;

import java.util.Scanner;

public class Menu {
	Service service = new Service();
	
	void run(Scanner sc){
		boolean flag = true;
		int menu;
		String str = "1.add 2.search 3.edit 4.del 5.printAll 6.end";
		while(flag){
			System.out.println(str);
			menu = sc.nextInt();
			switch(menu){
			case 1 : service.addMember(sc); break;
			case 2 : service.printMember(sc); break;
			case 3 : service.editMember(sc); break;
			case 4 : service.delMember(sc); break;
			case 5 : service.printAll(); break;
			case 6 : flag = false;
			}
		}
	}
}
