package p0407;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int a=10, b=20;
		boolean flag = (a>=10 && b>20);
		System.out.println(flag);
        
		
		try {
			int a = System.in.read();
			System.out.println(a);
		}catch (IOException e){
			e.printStackTrace();
		}
	    
		Scanner sc = new Scanner(System.in);
		System.out.print("번호:");
		int num = sc.nextInt();//int 값 하나
		System.out.print("이름:");
		String name = sc.next();//공백없는 문자열 하나(단어 하나)
		System.out.print("키:");
		float height = sc.nextFloat();//float하나
		System.out.print("주소:");
		sc.nextLine();//키 입력할때 버퍼에 남은 엔터 제거
		String address = sc.nextLine();//한 줄(엔터 만날 때 까지)
		
		System.out.println("num:"+num);
		System.out.println("name:"+name);
		System.out.println("height:"+height);
		System.out.println("address:"+address);
		sc.close();
		
		//자동 형변환, 강제 형변환
		System.out.println(5/2);
		System.out.println(5.0/2);
		
		double a = 5/2;
		System.out.println(a);
		double b = (double)5/2;
		System.out.println(b);
		
		float f = 3.14f;//실수 상수의 타입을 float로 지정
		System.out.println(f);
		long l = 2000l;//정수 상수의 타입을 long으로 지정
		System.out.println(l);
		
		int a1 = 10;//10진수
		int a2 = 0x3af2;//16진수0-9, a-f
		int a3 = 0b100101;//2진수
		int a4 = 0123;//8진수
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		char x = 'a';
		String z = "abc";
		
		System.out.println("aaa\tbbb");
		System.out.println("aaa\nbbb");
		System.out.println("aa\"ab\"bb");
		
		//조건문
		int x=3;
		if(x > 0){//조건이 참일때
			System.out.println("x는 0보다 큼");
		} else {//조건이 거짓일때
			System.out.println("x는 10보다 크지 않다");
		}
		
		//equals
		String id = "1234";
		if (id.equals("1234")){
			System.out.println("id 일치");
		}else {
			System.out.println("id 불일치");
		}
		
		//switch
		int x=3;
		switch(x){
		case 1 :
			System.out.println("x는 1");
			break;
		case 2 :
			System.out.println("x는 2");
			break;
		case 3 :
			System.out.println("x는 3");
			break;
		default : 
			System.out.println("x는 이외의 값");
		}
		
		char ch = 'b';
		switch(ch){
		case 'a':
			System.out.println("1번 문자");
			break;
		case 'b':
			System.out.println("2번 문자");
			break;
		case 'c':
			System.out.println("3번 문자");
			break;
		default:
			break;
		}
		
		String str = "ccc";
		switch(str){
		case "aaa":
			System.out.println("1번 문자열");
			break;
		case "bbb":
			System.out.println("2번 문자열");
			break;
		case "ccc":
			System.out.println("3번 문자열");
			break;
		default:
			break;
		}
		
		//for
		for(int i=1;i<=100;i++){
			if(i%2==1)
			System.out.print(i+" ");
		}
		int result=0;
		for(int i=1;i<=100;i++){
			result+=i;			
		}
		System.out.println("1~100합 : "+result);
		
		int i=1,num;
		while(i<5){
			System.out.println(i++);
		}
		
		while(i!=0){
			System.out.print("출력할 숫자 입력 : ");
			num = sc.nextInt();
			System.out.println("입력값 : "+num);
			System.out.print("반복 멈추려면 0 입력 : ");
			i = sc.nextInt();
		}
		
		i=10;
		while(i<5){//0번 돌아감
			System.out.println(i++);
		}
		
		while(i>5){//무한루프
			System.out.println(i++);
		}
		while(true){//무한루프
			System.out.println(i++);
		}
		for(;;){//무한루프
			
		}*/
		int i=1,num;
		System.out.print("점수 입력 : ");
		num = sc.nextInt();
		while(num>100 || num<0){
			System.out.print("점수 입력 : ");
			num = sc.nextInt();
		}
		if(num>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
