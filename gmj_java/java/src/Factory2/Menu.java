package Factory2;

import java.util.ArrayList;
import java.util.Scanner;

import Factory2.wh.Service;
import Factory2.wh.ServiceImp;
import Factory2.wh.DaoImp;
import Factory2.wh.whMenu;

public class Menu {
	private whMenu menu1;
	//private OrderMenu menu2;
	private Service wh_service;
	//private OrderService o_service;

	public Menu() {
		wh_service = new ServiceImp(new DaoImp());
		wh_service = new ServiceImp(new DaoImp());
		//o_service = new OrderService();

		menu1 = new whMenu(wh_service);
		// menu2 = new OrderMenu(o_service, wh_service);
	}

	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.공장 2.편의점 3.종료";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				menu1.run(sc);
				break;
			case 2:
				//menu2.run(sc);
				break;
			case 3:
				flag = false;
			}
		}
	}
}
