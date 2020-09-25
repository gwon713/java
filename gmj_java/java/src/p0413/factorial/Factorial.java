package p0413.factorial;
class Facto{
	int facto(int x){
		if(x==1) return 1;
		else System.out.println(x+" * facto("+(x-1)+")"); return x*facto(x-1);
	}
	long fibo(int x){
		if(x <= 2){
			return 1;
		}
		else {
			return fibo(x-1)+fibo(x-2);
		}
	}
}
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facto f = new Facto();
		int num = f.facto(4);
		System.out.println("num : "+num);
		for(int i=1; i<=80; i++){
			System.out.print(f.fibo(i)+"\t");
		}
	}

}
