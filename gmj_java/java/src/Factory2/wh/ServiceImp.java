package Factory2.wh;

import java.util.ArrayList;
import java.util.Scanner;

import Factory.order.Order;

public class ServiceImp implements Service {
	private Dao dao;
	public ServiceImp(Dao dao){
		this.dao = dao;
	}
	@Override
	public void addProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("name:");
		String name = sc.next();
		System.out.print("price:");
		int price = sc.nextInt();
		System.out.print("amount:");
		int amount = sc.nextInt();
		dao.insert(new Product(name, price, amount));
	}

	@Override
	public void printProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("search num:");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);
		if (p == null) {
			System.out.println("없는 제품");
		} else {
			System.out.println(p);
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		//Product[] d = dao.selectAll();
		ArrayList<Product> d = dao.selectAll2();
		for (Product p : d) {
			System.out.println(p);
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("search name:");
		String name = sc.next();
		//Product[] d = dao.selectByName(name);
		ArrayList<Product> d = dao.selectByName2(name);
		for (Product p : d) {
			System.out.println(p);
		}
	}

	@Override
	public void editPrice(Scanner sc) {
		// TODO Auto-generated method stub
		Product p = new Product();
		System.out.print("edit num:");
		p.setNum(sc.nextInt());
		System.out.print("new price:");
		p.setPrice(sc.nextInt());
		dao.updatePrice(p);
	}

	@Override
	public void in(Scanner sc) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setName("in");
		System.out.print("입고할 제품 num:");
		p.setNum(sc.nextInt());
		System.out.print("입고량:");
		p.setAmount(sc.nextInt());
		dao.in_out(p);
	}

	@Override
	public void out(Scanner sc, Order[] or) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("del num:");
		int num = sc.nextInt();
		dao.delete(num);
	}

	@Override
	public Product getByNum(int num) {
		// TODO Auto-generated method stub
		return dao.selectByNum(num);
	}

	@Override
	public Product[] getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	@Override
	public void in_out(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

}
