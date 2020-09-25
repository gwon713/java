package p0409;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1;//객체선언
		p1 = new Person();// 객체생성 Person()//생성자 -> 객체 초기화
		p1.age=10;//멤버 접근 연산자 -> .
		p1.name = "aaa";//멤버 접근 연산자 -> .
		p1.setInfo(10, "aaa");	//	System.out.println("p1.age : "+p1.age);
		p1.printInfo();

		Person p2 = new Person();
		p2.age = 20;
		p2.name = "bbb";
		
		p1.setInfo(20, "bbb");	//	System.out.println("p2.age : "+p2.age);
		p1.printInfo();	//	System.out.println("p2.name : "+p2.name);

		Person p3 = p1; //객체 생성x 참조값만 복사
		
		p1.setInfo(10, "aaa"); //		System.out.println("p3.age : "+p3.age);
		p1.printInfo();		//		System.out.println("p3.name : "+p3.name);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
