package p0410;
class MyArr{
	int [] arr;
	
	void setArr(int[] a){
		arr = a;
	}
	boolean checkArr(){
		if(arr == null){
			System.out.println("배열을 먼저 생성하시오");
		}
		return true;
	}
	void printArr(){
		int i;
		if(!checkArr()){
			return;
		}
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	void selectSort(){
		int i,j,tmp,min;
		if(!checkArr()){
			return;
		}
		//선택정렬
		for(i=0; i<arr.length-1; i++){
			min = i;
			for(j=i+1; j<arr.length; j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			if(arr[min] != arr[i]){
				tmp = arr[i];
				arr[i]=arr[min];
				arr[min]=tmp;
			}
		}
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void seqSearch(int num){
		if(!checkArr()){
			return;
		}
		int i;
		for(i=0; i<arr.length; i++){
			if(num==arr[i]){
				System.out.println(i+"번째 방에 있음");
				break;
			}
		}
		if (i == arr.length){
			System.out.println("없다");
		}
	}
	void binarySearch(int num){
		if(!checkArr()){
			return;
		}
		selectSort();
		int f=0, e=arr.length-1,mid;
		while(f<=e){
			mid = (f+e)/2;
			if(arr[mid]>num){
				e = mid-1;
			} else if(arr[mid]<num){
				f = mid+1;
			} else{
				System.out.println(mid+"번째 방에 있음");
				break;
			}
		}
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArr ma = new MyArr();
		int[] a = {8,3,7,4,6,1,5,2};
		ma.setArr(a);
		ma.seqSearch(1);
		ma.seqSearch(13);
		ma.binarySearch(6);
		ma.binarySearch(36);
		ma.printArr();
	}
}

