package p0410;

import java.util.Scanner;

class Student {
	String name;
	int[] score;
	float avg;
	
	void setinfo(String n, int[] s){
		name = n;
		score = s;
		for(int i=0; i<4; i++){
			score[4] += score[i];
		}
		avg = (float)score[4]/3;
	}
	void printInfo(){
		System.out.print(name+"/");
		for(int i=0; i<score.length; i++){
			System.out.print(score[i]+"/");
		}
		System.out.println(avg);
	}
}

public class StudentMain {
	static void input(Scanner sc,Student s){
		int[] a = new int[5];
		String[] title = {"num:","kor:","eng:","math"};
		System.out.print("name:");
		String name = sc.next();
		for(int i=0;i<4;i++){
			System.out.print(title[i]);
			a[i] = sc.nextInt();
		}
		s.setinfo(name, a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		input(sc,s1);
		Student s2 = new Student();
		input(sc,s2);
		Student s3 = new Student();
		input(sc,s3);
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
	}
}
