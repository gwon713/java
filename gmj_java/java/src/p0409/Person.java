package p0409;
//ĸ��ȭ
public class Person{
	//������� : Ŭ���� �ȿ��� ��������ó�� ��� �Լ����� ��밡�� 
	int age;
	String name;
	
	//�޼ҵ�
	void setInfo(int a, String n){//�Ķ���� -> �������� ���� �Լ� �ȿ����� ��밡��
		age = a;
		name = n;
	}
	//�޼ҵ�
	void printInfo(){
		System.out.println("age:"+age);
		System.out.println("name:"+name);
	}
}
