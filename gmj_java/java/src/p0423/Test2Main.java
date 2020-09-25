package p0423;

import java.util.ArrayList;
class A{
	int x;

	public A(int x){
		this.x = x;
		
	}
	public boolean equals(Object obj){
		if(obj != null && obj instanceof A){
			A obj2 = (A) obj;
			if(x==obj2.x){
				return true;
			}
		}
		return false;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	
}
public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<A> a1 = new ArrayList<A>();
		for(int i=1; i<6; i++){
			a1.add(new A(i));
		}
		
		for(int i=0; i<a1.size(); i++){
			System.out.println(a1.get(i));
		}
		a1.set(1,new A(20));
		System.out.println("=======");
		for(int i=0; i<a1.size(); i++){
			System.out.println(a1.get(i));
		}
		System.out.println("=======");
		for(int i=0; i<a1.size(); i++){	
			A n = a1.get(i);
			if(n.x == 3){
				System.out.println("found : "+i);
				a1.remove(i);		
				break;
			}
			if(i==a1.size()-1) System.out.println("not found");
			
		}
		
		
		for(int i=0; i<a1.size(); i++){
			System.out.println(a1.get(i));
		}
		System.out.println("=======");
		a1.remove(0);
		for(int i=0; i<a1.size(); i++){
			System.out.println(a1.get(i));
		}
	}


}
