package p0429;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Service service = new ServiceImp();
		Menu m = new Menu(service);
		m.run(new Scanner(System.in));
	}

}
