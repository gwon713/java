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
		System.out.print("��ȣ:");
		int num = sc.nextInt();//int �� �ϳ�
		System.out.print("�̸�:");
		String name = sc.next();//������� ���ڿ� �ϳ�(�ܾ� �ϳ�)
		System.out.print("Ű:");
		float height = sc.nextFloat();//float�ϳ�
		System.out.print("�ּ�:");
		sc.nextLine();//Ű �Է��Ҷ� ���ۿ� ���� ���� ����
		String address = sc.nextLine();//�� ��(���� ���� �� ����)
		
		System.out.println("num:"+num);
		System.out.println("name:"+name);
		System.out.println("height:"+height);
		System.out.println("address:"+address);
		sc.close();
		
		//�ڵ� ����ȯ, ���� ����ȯ
		System.out.println(5/2);
		System.out.println(5.0/2);
		
		double a = 5/2;
		System.out.println(a);
		double b = (double)5/2;
		System.out.println(b);
		
		float f = 3.14f;//�Ǽ� ����� Ÿ���� float�� ����
		System.out.println(f);
		long l = 2000l;//���� ����� Ÿ���� long���� ����
		System.out.println(l);
		
		int a1 = 10;//10����
		int a2 = 0x3af2;//16����0-9, a-f
		int a3 = 0b100101;//2����
		int a4 = 0123;//8����
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		char x = 'a';
		String z = "abc";
		
		System.out.println("aaa\tbbb");
		System.out.println("aaa\nbbb");
		System.out.println("aa\"ab\"bb");
		
		//���ǹ�
		int x=3;
		if(x > 0){//������ ���϶�
			System.out.println("x�� 0���� ŭ");
		} else {//������ �����϶�
			System.out.println("x�� 10���� ũ�� �ʴ�");
		}
		
		//equals
		String id = "1234";
		if (id.equals("1234")){
			System.out.println("id ��ġ");
		}else {
			System.out.println("id ����ġ");
		}
		
		//switch
		int x=3;
		switch(x){
		case 1 :
			System.out.println("x�� 1");
			break;
		case 2 :
			System.out.println("x�� 2");
			break;
		case 3 :
			System.out.println("x�� 3");
			break;
		default : 
			System.out.println("x�� �̿��� ��");
		}
		
		char ch = 'b';
		switch(ch){
		case 'a':
			System.out.println("1�� ����");
			break;
		case 'b':
			System.out.println("2�� ����");
			break;
		case 'c':
			System.out.println("3�� ����");
			break;
		default:
			break;
		}
		
		String str = "ccc";
		switch(str){
		case "aaa":
			System.out.println("1�� ���ڿ�");
			break;
		case "bbb":
			System.out.println("2�� ���ڿ�");
			break;
		case "ccc":
			System.out.println("3�� ���ڿ�");
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
		System.out.println("1~100�� : "+result);
		
		int i=1,num;
		while(i<5){
			System.out.println(i++);
		}
		
		while(i!=0){
			System.out.print("����� ���� �Է� : ");
			num = sc.nextInt();
			System.out.println("�Է°� : "+num);
			System.out.print("�ݺ� ���߷��� 0 �Է� : ");
			i = sc.nextInt();
		}
		
		i=10;
		while(i<5){//0�� ���ư�
			System.out.println(i++);
		}
		
		while(i>5){//���ѷ���
			System.out.println(i++);
		}
		while(true){//���ѷ���
			System.out.println(i++);
		}
		for(;;){//���ѷ���
			
		}*/
		int i=1,num;
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		while(num>100 || num<0){
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}
		if(num>=60)
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}

}
