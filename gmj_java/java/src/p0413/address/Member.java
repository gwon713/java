package p0413.address;
public class Member{
	String name;
	String tel;
	String address;
	
	void setInfo(String name,String tel,String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	void printInfo(){
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
}
