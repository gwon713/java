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
			FileWriter fw = new FileWriter(path);//���� ����(2����Ʈ)�� ���� ��Ʈ��
			FileReader fr = new FileReader("src/p0427/File/b.txt");//���� ����(2����Ʈ)�� �д� ��Ʈ��
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
