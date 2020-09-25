package p0421;

import java.awt.Frame;

public class MyInterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterImp1 m1 = new MyInterImp1();
		m1.test1();
		m1.test2();
		MyFrame mf = new MyFrame();
		mf.setSize(300,200);
		mf.setVisible(true);
		Thread th = new Thread(mf);
		th.start();
	}

}
class MyFrame extends Frame implements Runnable{
		public void run(){
			int i;
			for(i=0;i<10;i++){
				this.setTitle("my frame:"+i);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
}


