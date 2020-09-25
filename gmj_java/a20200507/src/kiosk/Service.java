package kiosk;

import java.util.Scanner;

public interface Service {
	void addFood(Scanner sc);
	
	void editFood(Scanner sc);

	void delFood(Scanner sc);
	
	void getAll();
	
	void daySales();
	
	void monthSales();
	
}
