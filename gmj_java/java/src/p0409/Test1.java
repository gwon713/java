package p0409;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//2차원 배열 기초
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
		
		//2차원 배열 활용
		String[] name = new String[3];
		int[][] score = new int[3][5];
		float[] avg = new float[3];
		String[] arr = {"번호","국어","영어","수학","총점"};
		
		for(int i=0;i<3;i++){
			System.out.print("이름 : ");
			name[i]=sc.nextLine();
			System.out.print("번호 : ");
			score[i][0]=sc.nextInt();
			System.out.print("국어 : ");
			score[i][1]=sc.nextInt();
			System.out.print("영어 : ");
			score[i][2]=sc.nextInt();
			System.out.print("수학 : ");
			score[i][3]=sc.nextInt();
			score[i][4]=score[i][1]+score[i][2]+score[i][3];
			avg[i]=(float)score[i][4]/3;
			sc.nextLine();
		}
		int tmp;
		String tmp_s;
		float tmp_f;
		int[] tmp_arr;
		//버블 정렬 총점기준 오름차순 정렬
		for(int i=0;i<name.length-1;i++){
			for(int j=0;j<name.length-1-i;j++){
				if(score[j][4] < score[j+1][4]){
					tmp_s=name[j];//이름 교환
					name[j]=name[j+1];
					name[j+1]=tmp_s;
					
//					for(int k=0; k<score[j].length; k++){//score 교환
//						tmp = score[j][k];
//						score[j][k] = score[j+1][k];
//						score[j+1][k] = tmp;
//					}
					tmp_arr = score[j]; //score 교환 참조값 활용
					score[j] = score[j+1];
					score[j+1] = tmp_arr;
					
					
					tmp_f = avg[j];//avg 교환
					avg[j]=avg[j+1];
					avg[j+1]=tmp_f;
				}
			}
		}
		
		
		for(int i=0;i<3;i++){
			System.out.print("이름 : "+name[i]+"  ");
			for(int j=0;j<5;j++){
				System.out.print(arr[j]+" : "+score[i][j]+"  ");
			}
			System.out.println("평균 : "+avg[i]+"  ");
		}
		
		
		//2차원 배열 활용
//		int[][] arr ={{1,2},{3,4,5,6},{7,8,9}};
//
//		for(int i=0; i<arr.length; i++){
//			for(int j=0; j<arr[i].length; j++){
//				System.out.print(arr[i][j]);
//			}
//		}
		
		//함수 
		
		
	}

}
