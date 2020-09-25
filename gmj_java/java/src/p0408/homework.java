package p0408;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n1=0,n2=1,fibo=0;
		for(int i=1; i<=80; i++){
			if(i==1) continue;
			fibo=n1+n2;
			n1=n2;
			n2=fibo;
		}
		System.out.println(fibo);
		
		
		long[] fibo1 = new long[80];
		for(int i=0; i<80;i++){
			if(i<2) {
				fibo1[i]=1;
				continue;
			}
			fibo1[i]=fibo1[i-2]+fibo1[i-1];
		}
		System.out.println(fibo1[79]);
	}

}
