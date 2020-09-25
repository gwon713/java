package p0428;

class Test1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=27;i++){
			System.out.print(i+"\t");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//run() 쓰레드 동작구현
	
}
public class Test1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.start();
		
		for(char i='a'; i<='z'; i++){
			System.out.print(i+"\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
