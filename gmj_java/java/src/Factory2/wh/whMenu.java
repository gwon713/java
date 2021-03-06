package Factory2.wh;

import java.util.Scanner;

public class whMenu {
	private Service service;

	public whMenu(Service service) {
		this.service = service;
	}

	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.제품등록 2.번호로검색 3.이름으로검색 4.가격수정 5.입출고 6.삭제 7.제품전체목록 8.종료";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.addProduct(sc);
				break;
			case 2:
				service.printProduct(sc);
				break;
			case 3:
				service.getByName(sc);
				break;
			case 4:
				service.editPrice(sc);
				break;
			case 5:
				service.in_out(sc);
				break;
			case 6:
				service.delProduct(sc);
				break;
			case 7:
				service.printAll();
				break;
			case 8:
				flag = false;
			}
		}
	}
}
