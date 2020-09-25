package p0409;
class TestArr{
	int[] arr = new int[5];
	
	void setArr(){
		for(int i=0; i<arr.length; i++){
			arr[i] = i+1;
		}
	}
	void printArr(){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

class TestArr2{
	int[] arr;
	int sum;
	int tmp;
	
	void setArr(int[] a){
		arr=a;
	}
	void printArr(){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	int sumArr(int[] a){
		arr=a;
		sum = 0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}
	int[] maxminArr(){
		int[] res = {arr[0],arr[0]};
		for(int i=0; i<arr.length; i++){
			if(res[0]<arr[i]){
				res[0]=arr[i];
			}
			if(res[1]>arr[i]){
				res[1]=arr[i];
			}
		}
		return res;
	}
	void sort(){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0; j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tmp;
				}
			}
		}	
	}
}

public class TestArrmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArr ta = new TestArr();
		ta.setArr();
		ta.printArr();
		
		int[] x = {3,8,5,7,2,4,1,6}; 
		TestArr2 ta2 = new TestArr2();
		ta2.setArr(x);
		System.out.println();
		ta2.printArr();
		int[] maxmin=ta2.maxminArr();
		System.out.println("\n"+ta2.sumArr(x));
		System.out.println("max :"+maxmin[0]+" min : "+maxmin[1]);
		ta2.sort();
		ta2.printArr();
		
		
		
	
	}

}
