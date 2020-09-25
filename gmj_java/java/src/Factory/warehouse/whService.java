package Factory.warehouse;

import java.util.Scanner;

public class whService {
	private Dao dao;

	public whService() {
		dao = new Dao();
	}

	public void addProduct(Scanner sc) {
		// 제품의 이름, 가격, 수량을 입력받아서 Product객체에 담는다
		// dao.insert(p)
	}

	public void getProductByNum(Scanner sc) {
		// 제품번호 입력받아 검색해서 출력
	}

	public void getProductByName(Scanner sc) {
		// 제품명 입력받아 검색해서 출력
	}

	public void editProduct(Scanner sc) {
		// 수정할 제품의 번호와 새 가격을 입력받아 Product 객체에 담아서
		// dao.updatePrice(p)
	}

	public void in_out(Scanner sc) {
		// 입출고할 제품번호와 입출고 수량을 입력받아서
		// dao.updateAmount()호출
	}

	public void delProduct(Scanner sc) {
		// 삭제할 제품 번호를 입력받아서
		// dao.delete()호출
	}

	public void printAll() {
		// dao.selectAll()호출해서 반환된 배열을 변수에 담아 전체 출력
	}

	public Product[] getAll() {// 주문에서 사용하도록 전체 제품목록 반환
		return dao.selectAll();
	}
}
