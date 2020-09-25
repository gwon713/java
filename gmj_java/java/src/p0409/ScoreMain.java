package p0409;

import java.util.Scanner;

class Student{
	String name;
	int num,kor,eng,math,total;
	float avg;
	
	void setInfo(String nm,int n,int k,int e,int m){
		name=nm;
		num=n;
		kor=k;
		eng=e;
		math=m;
		total=kor+num+math;
		avg=(float)total/3;
	}
	void printInfo(){
		System.out.println("name :"+name);
		System.out.println("num :"+num);
		System.out.println("kor :"+name);
		System.out.println("eng :"+eng);
		System.out.println("math :"+math);
		System.out.println("total :"+total);
		System.out.println("avg :"+avg);
		System.out.println("============");
	}
}

public class ScoreMain {
	static void input(Student s, Scanner sc){
		System.out.print("name : ");
		String name = sc.nextLine();
		System.out.print("num : ");
		int num = sc.nextInt();
		System.out.print("kor : ");
		int kor = sc.nextInt();
		System.out.print("eng : ");
		int eng = sc.nextInt();
		System.out.print("math : ");
		int math = sc.nextInt();
		sc.nextLine();
		s.setInfo(name, num, kor, eng, math);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		input(s1,sc);
		Student s2 = new Student();
		input(s2,sc);
		Student s3 = new Student();
		input(s3,sc);
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
	}

}
