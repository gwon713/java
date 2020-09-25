package p0422;
class Test1 implements Cloneable{
	int x,y;
	
	public Test1(){
		
	}
	public Test1(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null && obj instanceof Test1){
			Test1 obj2 = (Test1)obj;
			if(x==obj2.x && y==obj2.y){
				return true;
			}
		}
		return false;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	public String toString() {
		return "Test1 [x=" + x + ", y=" + y + "]";
	}
}
public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1(3,4);
		Test1 t2 = null;
		Test1 t3 = t1;//얕은 복사
		try {
			t2 = (Test1) t1.clone();//깊은 복사
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println("---참조값---");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		System.out.println("\nt1==t2:"+(t1 == t2));
		System.out.println("t1==t3:"+(t1 == t3));
		
		System.out.println("t1.equals(t2)"+t1.equals(t2));
		System.out.println("t1.equals(t3)"+t1.equals(t3));
	}

}
