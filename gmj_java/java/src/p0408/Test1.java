package p0408;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int num;
//		String str="";
//		while(true){
//			System.out.println("����� ���ڸ� �Է��϶�");
//			num = sc.nextInt();
//			System.out.println("�Է°�:"+num);
//			System.out.println("���߷��� stop�� �Է��϶�");
//			str=sc.next();
//			if(str.startsWith("stop")){
//				break;
//			}
//		}
		
		
//		int[] arr = new int[5];
//		int i;
//		for(i=0; i<arr.length; i++){
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
//		
//		int[] arr1 = new int[]{1,2,3,4,5};
//		int[] arr2 = {1,2,3,4,5};

		
//		char[] arr = {'h','e','l','l','o'};
//		for(int i=0; i<arr.length; i++){
//			System.out.print(arr[i]);
//		}
		
		int[] arr = new int[5];
		
		int i,max=0,min=0;
		float result=0;
		
		for(i=0; i<arr.length; i++){
			System.out.print("num : ");
			arr[i] = sc.nextInt();
			result+=arr[i];
		}
		max= (int)(result/arr.length);
		min= (int)(result/arr.length);
		for(i=0; i<arr.length; i++){
			if(arr[i]>max) max=arr[i];
			if(arr[i]<min) min=arr[i];
		}
		System.out.print("���� : "+(int)result+" ��� : "+((float)result/arr.length)+" �ִ밪 : "+max+" �ּڰ� : "+min);
		
		System.out.print("\nŽ�� : ");
		int search = sc.nextInt();
		
		for(i=0;i<arr.length;i++){
			if(search==arr[i]) {
				System.out.println((i+1)+"��° ��");
				break;
			}
			if(i==arr.length-1) System.out.println("not found");
		}
	}
}