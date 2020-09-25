package p0413.address;

import java.util.Scanner;

public class Service {
	Dao dao = new Dao();
	
	void addMember(Scanner sc){
		Member m = new Member();
		String name="",tel="",address="";
		do{
			System.out.print("name : ");
			name = sc.next();
		}while(dao.getIdx(name)>=0);//중복체크
		System.out.print("tel : ");
		tel = sc.next();
		System.out.print("address : ");
		address = sc.next();
		m.setInfo(name, tel, address);
		dao.insert(m);
	}
	void printMember(Scanner sc){
		String name="";
		System.out.print("search name : ");
		name = sc.next();
		Member m = dao.select(name);
		if(m==null) System.out.println("not found");
		else m.printInfo();
		
	}
	void editMember(Scanner sc){
		String name="",tel="",address="";
		System.out.print("edit name : ");
		name = sc.next();
		System.out.print("new tel : ");
		tel = sc.next();
		System.out.print("new address : ");
		address = sc.next();
		Member m = new Member();
		m.setInfo(name, tel, address);
		dao.update(m);
	}
	void delMember(Scanner sc){
		String name="";
		System.out.print("del name : ");
		name = sc.next();
		dao.delete(name);
	}
	void printAll(){
		dao.printAll();
	}
}
