package p0409;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1;//��ü����
		p1 = new Person();// ��ü���� Person()//������ -> ��ü �ʱ�ȭ
		p1.age=10;//��� ���� ������ -> .
		p1.name = "aaa";//��� ���� ������ -> .
		p1.setInfo(10, "aaa");	//	System.out.println("p1.age : "+p1.age);
		p1.printInfo();

		Person p2 = new Person();
		p2.age = 20;
		p2.name = "bbb";
		
		p1.setInfo(20, "bbb");	//	System.out.println("p2.age : "+p2.age);
		p1.printInfo();	//	System.out.println("p2.name : "+p2.name);

		Person p3 = p1; //��ü ����x �������� ����
		
		p1.setInfo(10, "aaa"); //		System.out.println("p3.age : "+p3.age);
		p1.printInfo();		//		System.out.println("p3.name : "+p3.name);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
