package p0410;

import java.util.Scanner;

class Menu{
	Scanner sc = new Scanner(System.in);

	Person person1[] = new Person[10];
	int i=0; 
	int searchnum=0;
	String name = null; 
	String phone = null;
	String addr = null;
	boolean toggle = false;
	boolean searchtoggle = false;
	void open(){
		int inputnum =0; 
		boolean flag=true; 
		System.out.println("==========주소록 관리 ============");
		while(flag){
			flag = true;
			System.out.println("1.등록, 2.수정, 3.삭제, 4.검색, 5.출력, 6.종료");
			System.out.print("메뉴 선택 : ");
			inputnum = sc.nextInt();
			
			switch(inputnum){
			case 1 : input(); open(); break;
			case 2 : edit(); open(); break;
			case 3 : delete(); open(); break;
			case 4 : search(); open(); break;
			case 5 : printInfo(); open(); break;
			case 6 : end(); break;
			default : 
				System.out.println("다시 입력해주세요");
				flag=true; 
				break;
			}
		}
	}
	void input() {
		toggle = true;
		for(int j=0;j<=person1.length;j++){
			if(j==person1.length){
				System.out.println("자리없음");
				return;
				}
			if(person1[j] == null) {
				i=j; 
				break;
				}
		}

		sc.nextLine();
		System.out.println("등록");
		System.out.print("이름 : ");	
		name = sc.nextLine();
		for(int j=0;j<person1.length;j++){
			if(person1[j] != null) {
				if(person1[j].getName().equals(name)) {	
					System.out.println("같은 이름이 존재합니다 다시 입력해주세요."); 
					toggle = false;
					break;
				}
			}
		}
		if(toggle)input2();

	}
	void input2() {
		System.out.print("전화번호 : ");
		phone = sc.nextLine();

		System.out.print("주소 : "); 
		addr = sc.nextLine();

		Person person = new Person(name,phone,addr);

		if(i<person1.length){
			person1[i]=person;
		}
	}
	void edit(){
		System.out.println("수정");
		search();
		if(searchtoggle) input2();
	}
	void delete(){
		System.out.println("삭제");
		search();
		if (searchtoggle) {
			person1[searchnum] = null;
			System.out.println("삭제완료");
		}
	}

	void search(){
		
		System.out.println("검색");
		sc.nextLine();
		System.out.print("찾고자 하는 이름  : ");
		String input = sc.nextLine();
			
		for(int j=0;j<person1.length;j++){
			if(person1[j] != null) {
				if(person1[j].getName().equals(input)) {
					searchnum=j;
					printInfo1(searchnum);
					searchtoggle = true;
					break;
				}
			}
			else {
				System.out.println("not found"); 
				searchtoggle = false;
				break;
			}
		}

	}
	
	void printInfo(){
		System.out.println("-----------------------------------------");
		for(int i=0;i<person1.length;i++){
			if(person1[i] != null) {
				System.out.println("["+(i)+"] "+person1[i].getName()+" "+person1[i].getPhone()+" "+person1[i].getAddr()+" ");
			}
		}
	}
	void printInfo1(int i){
		System.out.println("-----------------------------------------");
		if(person1[i] != null) {
			System.out.println("["+(i)+"] "+person1[i].getName()+" "+person1[i].getPhone()+" "+person1[i].getAddr()+" ");

		}

	}
	void end(){
		System.out.println("종료");
		System.exit(1);
	}
}
class Person{
	private String name;
	private String phone;
	private String addr;
	
	Person(String name,	String phone, String addr){
		this.name=name;
		this.phone=phone;
		this.addr=addr;
	}
	String getName() {
		return name;
	}
	String getPhone() {
		return phone;
	}
	String getAddr() {
		return addr;
	}

	void setName(String name) {	
		this.name = name;	
	}
	void setPhone(String phone) {
		this.phone = phone;	
	}
	void setAddr(String addr) {
		this.addr = addr;	
	}
}
public class addressbookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu address1 = new Menu();
		address1.open();
	}

}
