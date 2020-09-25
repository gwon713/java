package p0409;

import java.util.Scanner;

public class Test_multi {
	static int add(int num1,int num2){
		return num1+num2;
	}
	static int sub(int num1,int num2){
		return num1-num2;
	}
	static int mul(int num1,int num2){
		return num1*num2;
	}
	static float div(int num1,int num2){
		return num1/num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 : ");
		int n1 = sc.nextInt();
		System.out.print("num2 : ");
		int n2 = sc.nextInt();
		System.out.print("¿¬»ê (+,-,*,/) : ");
		String x = sc.next();
		
		switch(x){
		case "+":
			System.out.println("result : "+add(n1,n2));
			break;
		case "-":
			System.out.println("result : "+sub(n1,n2));
			break;
		case "*":
			System.out.println("result : "+mul(n1,n2));
			break;
		case "/":
			if(n1!=0 && n2!=0) {
				System.out.println("result : "+div(n1,n2));
				break;
			}else {
				System.out.println("error");
				break;
			}
			
		default : 
			
		}
		
		
	}

}
