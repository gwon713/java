package p0408;

import java.util.Scanner;
import java.util.stream.StreamSupport;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//문제1
		/*int score[] = new int[5];
		float avg = 0;
		String[] sub = {"번호","국어","영어","수학"};
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		for(int i=0;i<4;i++){
			System.out.print(sub[i]+" : ");
			score[i]=sc.nextInt();
		}
		for(int i=1; i<4; i++){
			score[4]+=score[i];
			System.out.print(sub[i]+" : "+score[i]+" ");
		}
		System.out.println();
		avg=(float)score[4]/3;
		System.out.println("총점 : "+score[4]+" 평균 : "+avg);*/
		
		//버블 정렬
//		int list[] = {5,8,3,6,2,9,1,7,4};
//		int sub=0;
//		for(int i=0;i<list.length-1;i++){
//			for(int j=0; j<list.length-1;j++){
//				if(list[j]>list[j+1]){
//					sub = list[j+1];
//					list[j+1]=list[j];
//					list[j]=sub;
//				}
//			}
//		}
//		for(int i=0;i<list.length;i++){
//			System.out.print(list[i]+" ");
//		}
		
		//삽입 정렬 insert sort
//		int list[] = {5,8,3,6,2,9,1,7,4};
//		int sub=0;
//		for(int i=1;i<list.length;i++){
//			sub=list[i];
//			int j=i-1;
//			while(j>=0 && list[j]>sub){
//				list[j+1]=list[j];
//				j--;
//			}
//			list[j+1]=sub;
//		}
//		for(int i=0;i<list.length;i++){
//			System.out.print(list[i]+" ");
//		}
		
		//선택정렬
//		int list[] = {5,8,3,6,2,9,1,7,4};
//		int sub=0,min;
//		for(int i=0;i<list.length-1;i++){
//			min=i;
//			for(int j=i+1;j<list.length;j++){
//				if(list[min]>list[j]){
//					min=j;
//				}
//			}
//			if(min!=0){
//				sub=list[min];
//				list[min]=list[i];
//				list[i]=sub;
//			}
//			
//		}
//		for(int i=0;i<list.length;i++){
//			System.out.print(list[i]+" ");
//		}
		
		//이진 탐색
//		int list[] = {1,2,3,4,5,6,7,8,9};
//		int mid,first=0,end=list.length-1,count=0;
//		
//		System.out.print(": ");
//		int search = sc.nextInt();
//		
//		while(first<=end){
//			mid=(first+end)/2;
//			if(list[mid]==search){
//				System.out.println("found");
//				break;
//			}else if(list[mid]<search){
//				first=mid+1;
//			}else{
//				end=mid-1;
//			}
//			count++;
//		}
//		if(first>end){
//			System.out.println("not found");
//		}
//		System.out.println(count);
		
		//배열 삽입
//		int[] a ={1,2,3};//new 없이도 생성됨. 초기화
//		int[] b;//생성 안됨
//		int i;
//		//얕은 복사 -> b=a;
//		b = new int[a.length];//깊은 복사
//		
//		
//		for(i=0;i<a.length;i++){//깊은 복사
//			b[i]=a[i];
//		}
//
//		for(i=0; i<a.length; i++){
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		for(i=0; i<b.length; i++){
//			System.out.print(b[i]+"\t");
//		}
//		System.out.println();
//		
//		b[1]=200;
//		for(i=0; i<a.length; i++){
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		for(i=0; i<b.length; i++){
//			System.out.print(b[i]+"\t");
//		}
		
//		int[] a = {1,2,3,4,5};
//		int[] b = new int[3];
//		
//		int i;
//		//p1:원본  p2:복사할 원본 배열의 시작 인덱스 p3:복사 대상 p4:대상 배열 시작 인덱스 p5:복사할 요소 개수
//		System.arraycopy(a, 1, b, 0, 3);//깊은복사 
//		
//		for(i=0; i<a.length; i++){
//			System.out.print(a[i]+"\t");
//		}
//		System.out.println();
//		for(i=0; i<b.length; i++){
//			System.out.print(b[i]+"\t");
//		}
//		System.out.println();
		
	}

}
