package p0409;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//2���� �迭 ����
//		int[][] arr = new int[2][3];
//		
//		int i,j;
//		for(i=0;i<2;i++){
//			for(j=0;j<3;j++){
//				arr[i][j]=3*i+j+1;
//			}
//		}
//		for(i=0;i<2;i++){
//			for(j=0;j<3;j++){
//				System.out.println(arr[i][j]);
//			}
//		}
//		System.out.println(arr[0].length); //3
		
		
//		int[][] arr = {{1,2,3},{4,5,6}};
//		
//		for(int i=0; i<arr.length; i++){
//			for(int j=0; j<arr[i].length; j++){
//				System.out.println(arr[i][j]);
//			}
//		}
		
		//2���� �迭 Ȱ��
		String[] name = new String[3];
		int[][] score = new int[3][5];
		float[] avg = new float[3];
		String[] arr = {"��ȣ","����","����","����","����"};
		
		for(int i=0;i<3;i++){
			System.out.print("�̸� : ");
			name[i]=sc.nextLine();
			System.out.print("��ȣ : ");
			score[i][0]=sc.nextInt();
			System.out.print("���� : ");
			score[i][1]=sc.nextInt();
			System.out.print("���� : ");
			score[i][2]=sc.nextInt();
			System.out.print("���� : ");
			score[i][3]=sc.nextInt();
			score[i][4]=score[i][1]+score[i][2]+score[i][3];
			avg[i]=(float)score[i][4]/3;
			sc.nextLine();
		}
		int tmp;
		String tmp_s;
		float tmp_f;
		int[] tmp_arr;
		//���� ���� �������� �������� ����
		for(int i=0;i<name.length-1;i++){
			for(int j=0;j<name.length-1-i;j++){
				if(score[j][4] < score[j+1][4]){
					tmp_s=name[j];//�̸� ��ȯ
					name[j]=name[j+1];
					name[j+1]=tmp_s;
					
//					for(int k=0; k<score[j].length; k++){//score ��ȯ
//						tmp = score[j][k];
//						score[j][k] = score[j+1][k];
//						score[j+1][k] = tmp;
//					}
					tmp_arr = score[j]; //score ��ȯ ������ Ȱ��
					score[j] = score[j+1];
					score[j+1] = tmp_arr;
					
					
					tmp_f = avg[j];//avg ��ȯ
					avg[j]=avg[j+1];
					avg[j+1]=tmp_f;
				}
			}
		}
		
		
		for(int i=0;i<3;i++){
			System.out.print("�̸� : "+name[i]+"  ");
			for(int j=0;j<5;j++){
				System.out.print(arr[j]+" : "+score[i][j]+"  ");
			}
			System.out.println("��� : "+avg[i]+"  ");
		}
		
		
		//2���� �迭 Ȱ��
//		int[][] arr ={{1,2},{3,4,5,6},{7,8,9}};
//
//		for(int i=0; i<arr.length; i++){
//			for(int j=0; j<arr[i].length; j++){
//				System.out.print(arr[i][j]);
//			}
//		}
		
		//�Լ� 
		
		
	}

}
