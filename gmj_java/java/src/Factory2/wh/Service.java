package Factory2.wh;

import java.util.Scanner;

import Factory.order.Order;

public interface Service {
	void addProduct(Scanner sc);
	void printProduct(Scanner sc);
	void printAll();
	void getByName(Scanner sc);
	void editPrice(Scanner sc);
	void in(Scanner sc);
	void out(Scanner sc,Order[] or);
	void delProduct(Scanner sc);
	Product getByNum(int num);
	Product[] getAll();
	void in_out(Scanner sc);
}
