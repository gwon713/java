package p0429;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImp implements Service {
	private Dao dao;
	
	public ServiceImp(){
		dao = new DaoImp();
	}
	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.print("name : ");
		m.setName(sc.next());
		System.out.print("tel : ");
		m.setTel(sc.next());
		System.out.print("address : ");
		m.setAddress(sc.next());
		dao.insert(m);
	}

	@Override
	public void getMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("search num:");
		int num = sc.nextInt();
		Member m = dao.selectByNum(num);
		if(m==null){
			System.out.println("not found");
		}else{
			
			System.out.println(m);
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("search name:");
		String name = sc.next();
		ArrayList<Member> list = dao.selectByName(name);
		if(list.isEmpty()){
			System.out.println("not found");
		}else{
			for(Member m:list){
				System.out.println(m);
			}
		}
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		ArrayList<Member> list = dao.selectAll();
		for(Member m:list){
			System.out.println(m);
		}
	}

	@Override
	public void editMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.print("edit name : ");
		m.setName(sc.next());
		System.out.print("new tel : ");
		m.setTel(sc.next());
		System.out.print("new address : ");
		m.setAddress(sc.next());
		dao.update(m);
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("delete num:");
		int num = sc.nextInt();
		dao.delete(num);
	}

}
