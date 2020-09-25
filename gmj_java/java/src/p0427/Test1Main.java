package p0427;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		byte[] arr = new byte[5];
		try{
			FileInputStream fi = new FileInputStream("src/p0427/File/a.txt");
			BufferedInputStream bi = new BufferedInputStream(fi);
			while((ch = bi.read()) != -1 ){
				System.out.print((char) ch);
			}
			System.out.println();
			bi.close();
			fi.close();
			
			fi = new FileInputStream("src/p0427/File/a.txt");
			while(true){
				if(fi.read(arr)==-1) break;
				if(fi.available()<arr.length){
					Arrays.fill(arr, 0, arr.length, (byte)0);
				}
				System.out.println(new String(arr));
			}
			fi.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
