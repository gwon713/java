package p0423;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImp implements Service {
	private Dao dao;
	public ServiceImp(Dao dao){
		this.dao = dao;
	}
	@Override
	public void addMember(Scanner sc) {
		// TODO Auto-generated method stub
		Member m = new Member();
		System.out.println("<�� ��� ���>");
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
		System.out.println("search name : ");
		String name = sc.next();
		Member m = dao.select(name);
		if(m==null){
			System.out.println("��ϵ��� ���� ���");
		}else{
			System.out.println(m);
		}
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println("<��ü���>");
		ArrayList<Member> a1 = new ArrayList<Member>();
		for(Member m:a1){
			System.out.println(m);
		}
	}

	@Override
	public void editMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("����");
		Member m = new Member();
		System.out.print("name : ");
		m.setName(sc.next());
		Member m2 = dao.select(m.getName());
		if(m2==null){
			System.out.println("��ϵ��� ���� ���. �������");
			return;
		}
		System.out.println(m.getName()+"�� ���� �� ����");
		System.out.println(m2);
		System.out.print("tel : ");
		m.setTel(sc.next());
		System.out.print("address : ");
		m.setAddress(sc.next());
		dao.update(m);
	}

	@Override
	public void delMember(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("<����>");
		System.out.println("del name : ");
		String name = sc.next();
		dao.delete(name);
	}

}
