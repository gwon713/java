package p0428;
class Test2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=27;i++){
			System.out.print(i+"\t");
		}
	}
	
}
public class Test2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		Thread th = new Thread(t);
		th.start();
		
		for(char i='a'; i<='z'; i++){
			System.out.print(i+"\t");
		}
	}

}
