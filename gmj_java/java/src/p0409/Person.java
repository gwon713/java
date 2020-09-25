package p0409;
//캡슐화
public class Person{
	//멤버변수 : 클래스 안에서 전역변수처럼 모든 함수에서 사용가능 
	int age;
	String name;
	
	//메소드
	void setInfo(int a, String n){//파라메터 -> 지역변수 현재 함수 안에서만 사용가능
		age = a;
		name = n;
	}
	//메소드
	void printInfo(){
		System.out.println("age:"+age);
		System.out.println("name:"+name);
	}
}
