package p0429;

import java.util.Scanner;


public class Menu {
	private Service service;

	public Menu(Service service) {
		this.service = new ServiceImp();
	}

	public void run(Scanner sc) {
		boolean flag = true;
		String str = "1.등록 2.번호로검색 3.이름으로검색 4.수정 5.삭제 6.목록 7.종료";
		int menu;
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.addMember(sc);
				break;
			case 2:
				service.getMember(sc);
				break;
			case 3:
				service.getByName(sc);
			case 4:
				service.editMember(sc);
				break;
			case 5:
				service.delMember(sc);
				break;
			case 6:
				service.getAll();
				break;
			case 7:
				flag = false;
				break;
			}
		}
	}
}