package p0427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/p0427/File/c.txt";
		try {
			FileWriter fw = new FileWriter(path);//문자 단위(2바이트)씩 쓰는 스트림
			FileReader fr = new FileReader("src/p0427/File/b.txt");//문자 단위(2바이트)씩 읽는 스트림
			int ch;

			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br = new BufferedReader(fr);
			while((ch=fr.read()) != -1){
				fw.write(ch);
			}
			bw.close();
			br.close();
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
