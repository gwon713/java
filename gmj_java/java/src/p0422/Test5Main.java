package p0422;

import javax.sql.rowset.spi.SyncProvider;

class A{
	int x = 10;
}
public class Test5Main {
	public static void main(String[] args){
		A a = null;
		int[] b = {1,2,3};
		int res;
		
		try{
			System.out.println("1");
			System.out.println(a.x);
			System.out.println("2");
			for(int i=0; i<b.length; i++){
				System.out.print(b[i]+"\t");
			}
			System.out.println("\n3");
			res = 3/0;
			System.out.println("4");
		}catch(NullPointerException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("5");
		
	}
}
