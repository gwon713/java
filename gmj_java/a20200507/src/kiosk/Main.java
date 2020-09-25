package kiosk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Service s = new ServiceImp();
		StoreMenu m = new StoreMenu(s);
		m.run(sc);
	}

}
