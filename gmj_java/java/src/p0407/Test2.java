package p0407;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		//���� 1 
		/*System.out.print("���� �Է�(0~100) : ");
		int grade = sc.nextInt();
		if (grade >=0 && grade <= 100){
			if (grade >= 60){
				System.out.println("�հ�");
			}else {
				System.out.println("���հ�");
			}
		}else{
			System.out.println("error");
		}


		//���� 2
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}

		//���� 3
		System.out.print("0~100 ���� �Է� : ");
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

		//����4
		String myid="myid", mypwd="1234";
		System.out.print("id �Է� : ");
		String id = sc.nextLine();
		System.out.print("password �Է� : ");
		String pwd = sc.nextLine();

		if (id.equals(myid)){
			if (pwd.equals(mypwd)){
				System.out.println("�α��� ����");
			}else {
				System.out.println("�߸��� pwd");
			}
		}else {
			System.out.println("�߸��� id");
		}

		//����5
		System.out.print("���� 2�� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("���� ��ȣ �Է�(+,-,*,/) : ");
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
			System.out.println("�߸��� �Է��Դϴ�.");
	    }

		//����6
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for(int i=1; i<=num; i++){
			if(num%i==0)
				System.out.print(i+" ");
		}

		//����7

		for(int i=1;i<=9;i++){
			System.out.println("4 * "+i+"= "+(4*i));
		}

		//����8
		String star = "*";
		for(int i=1;i<=4;i++){
			System.out.println(star);
			star += "*";
		}

		//����9
		int i=0,j=0;
		for(i=2;i<10;i++){
			System.out.println("-------"+i+"��-------");
			for(j=1;j<10;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}

		//����10
		int i=0,j=0;
		for(i=1;i<10;i++){
			for(j=2;j<10;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}

		//����11
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

		//����12
		int hp=30,exp=0,level=1,select=0;
		boolean toggle = true;
		while(toggle){
			System.out.println("�޴�\n1.��Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� 6.����");
			System.out.print("���� : ");
			select = sc.nextInt();
			switch(select){
			case 1 :
				System.out.println("-----��Ա�-----");
				hp+=5;
				break;
			case 2 :
				System.out.println("-----���ڱ�-----");
				hp+=10;
				break;
			case 3 :
				System.out.println("-----���-----");
				hp-=8;
				exp+=10;
				if(exp>=20){
					level+=1;
					exp=0;
					System.out.println("level up");
				}
				if(hp<=0){
					System.out.println("-----���-----  level : "+level);
					toggle=false;
				}
				break;
			case 4 :
				System.out.println("-----��ϱ�-----");
				hp-=15;
				exp+=15;
				if(exp>=20){
					level+=1;
					exp=0;
					System.out.println("level up");
				}
				if(hp<=0){
					System.out.println("-----���-----  level : "+level);
					toggle=false;
				}
				break;
			case 5 :
				System.out.println("-----����Ȯ��-----");
				System.out.println("hp : "+hp+" exp : "+exp+" level : "+level);
				break;
			case 6 :
				System.out.println("-----����-----");
				toggle=false;
				break;
			default :
				System.out.println("-----error-----");
				break;
			}
		}
		


	}

}


