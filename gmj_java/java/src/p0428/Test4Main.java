package p0428;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Test4 extends Thread{
		@Override
	public void run() {
		// TODO Auto-generated method stub
		String path = "src/p0428/c.txt";
		try {
			FileReader fr = new FileReader(path);//문자 단위(2바이트)씩 읽는 스트림

			BufferedReader br = new BufferedReader(fr);
			while(fr.read() != -1){
				System.out.println(fr.read());
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
public class Test4Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t = new Test4();
		t.start();
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true){
			str = sc.next();
			if(str.startsWith("/stop")){
				break;
			}
			System.out.println(str);
		}
	 
	}
 }
}
