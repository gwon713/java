package jdbc.addr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao = new DaoImpl();
		Menu m = new Menu();
		m.run(new Scanner(System.in));
	}

}
