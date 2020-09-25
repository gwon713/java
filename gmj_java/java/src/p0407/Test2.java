package p0407;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		//문제 1 
		/*System.out.print("점수 입력(0~100) : ");
		int grade = sc.nextInt();
		if (grade >=0 && grade <= 100){
			if (grade >= 60){
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else{
			System.out.println("error");
		}


		//문제 2
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

		//문제 3
		System.out.print("0~100 점수 입력 : ");
		int num1 = sc.nextInt();
		if (num1>100 || num1<0){
			System.out.println("error");
		}else{
			if(num1>=90){
				System.out.println("A");
			}else if(num1>=80){
				System.out.println("B");
			}else if(num1>=70){
				System.out.println("C");
			}else if(num1>=60){
				System.out.println("D");
			}else{
				System.out.println("F");
			}
		}

		//문제4
		String myid="myid", mypwd="1234";
		System.out.print("id 입력 : ");
		String id = sc.nextLine();
		System.out.print("password 입력 : ");
		String pwd = sc.nextLine();

		if (id.equals(myid)){
			if (pwd.equals(mypwd)){
				System.out.println("로그인 성공");
			}else {
				System.out.println("잘못된 pwd");
			}
		}else {
			System.out.println("잘못된 id");
		}

		//문제5
		System.out.print("숫자 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("연산 기호 입력(+,-,*,/) : ");
		String cal = sc.next();

		switch(cal){
		case "+" :
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case "-" :
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case "*" :
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case "/" :
			if(num2==0){
				System.out.println("error"); 
				break;
			}
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
		default :
			System.out.println("잘못된 입력입니다.");
	    }

		//문제6
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		for(int i=1; i<=num; i++){
			if(num%i==0)
				System.out.print(i+" ");
		}

		//문제7

		for(int i=1;i<=9;i++){
			System.out.println("4 * "+i+"= "+(4*i));
		}

		//문제8
		String star = "*";
		for(int i=1;i<=4;i++){
			System.out.println(star);
			star += "*";
		}

		//문제9
		int i=0,j=0;
		for(i=2;i<10;i++){
			System.out.println("-------"+i+"단-------");
			for(j=1;j<10;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}

		//문제10
		int i=0,j=0;
		for(i=1;i<10;i++){
			for(j=2;j<10;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}

		//문제11
		int i=0,j=0,count=0;
		for(i=2;i<=100;i++){
			count=0;
			for(j=2;j<=i;j++){
				if(i%j==0)
					count++;
			}
			if(count<2)
				System.out.print(i+" ");		
		}*/

		//문제12
		int hp=30,exp=0,level=1,select=0;
		boolean toggle = true;
		while(toggle){
			System.out.println("메뉴\n1.밥먹기 2.잠자기 3.놀기 4.운동하기 5.상태확인 6.종료");
			System.out.print("선택 : ");
			select = sc.nextInt();
			switch(select){
			case 1 :
				System.out.println("-----밥먹기-----");
				hp+=5;
				break;
			case 2 :
				System.out.println("-----잠자기-----");
				hp+=10;
				break;
			case 3 :
				System.out.println("-----놀기-----");
				hp-=8;
				exp+=10;
				if(exp>=20){
					level+=1;
					exp=0;
					System.out.println("level up");
				}
				if(hp<=0){
					System.out.println("-----사망-----  level : "+level);
					toggle=false;
				}
				break;
			case 4 :
				System.out.println("-----운동하기-----");
				hp-=15;
				exp+=15;
				if(exp>=20){
					level+=1;
					exp=0;
					System.out.println("level up");
				}
				if(hp<=0){
					System.out.println("-----사망-----  level : "+level);
					toggle=false;
				}
				break;
			case 5 :
				System.out.println("-----상태확인-----");
				System.out.println("hp : "+hp+" exp : "+exp+" level : "+level);
				break;
			case 6 :
				System.out.println("-----종료-----");
				toggle=false;
				break;
			default :
				System.out.println("-----error-----");
				break;
			}
		}
		


	}

}


