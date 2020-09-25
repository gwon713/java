package p0428;
class Test3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<101; i++){
			System.out.println(getName()+":"+i);//현재 쓰레드 이름 반환
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName()+"쓰레드 종료/우선순위:"+getPriority());//우선순위값 반환
	}
	
}
public class Test3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<11; i++){
			Test3 t = new Test3();
			t.setPriority(i);//우선순위값 설정
			t.start();
		}
	}

}
