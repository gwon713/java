package p0427.memo;

import java.util.Scanner;

public class Menu {
	private Service service;

	public Menu() {
		service = new Service();
	}

	public void run(Scanner sc) {
		String s = "1.읽기 2.쓰기 3.삭제 4.종료";
		boolean flag = true;
		int menu;
		service.mkDir();
		while (flag) {
			System.out.println(s);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.read(sc);
				break;
			case 2:
				service.write(sc);
				break;
			case 3:
				service.delFile(sc);
				break;
			case 4:
				flag = false;
			}
		}
	}
}
