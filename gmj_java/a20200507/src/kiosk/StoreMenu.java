package kiosk;

import java.util.Scanner;


public class StoreMenu {
	private Service service;

	public StoreMenu(Service service) {
		this.service = new ServiceImp();
	}
	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.�޴��߰� 2.�޴����� 3.�޴����� 4.�޴���� 5.�Ϸ� ���� 6.�Ѵ� ���� 7.�ı�� ��� 8.����";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.addFood(sc);
				break;
			case 2:
				service.editFood(sc);
				break;
			case 3:
				service.delFood(sc);
				break;
			case 4:
				service.getAll();
				break;
			case 5:
				service.daySales();
				break;
			case 6:
				service.monthSales();
				break;
			case 7 :
				
				break;
			case 8:
				flag = false;
			}
		}
	}
}
