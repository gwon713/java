package p0423;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Dao dao = new DaoImp();
		Service service = new ServiceImp(dao);
		Menu m = new Menu(service);
		m.run(sc);
	}

}
