package p0428;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.Scanner;

public class Service {
	public Service(){
		this.path = "src/p0428/";
		dir = new File(path);
	}
	private String path;
	private File dir;

	public void read(Scanner sc) {
		
		String[] files = dir.list(); // 읽을 파일 목록 저장
		int i;
		if (files.length <= 0) {
			System.out.println("읽을 파일이 없다");
			return;
		}
		for (i = 0; i < files.length; i++) {// 읽을 파일 목록 출력. 배열의 인덱스도 같이 출력
			System.out.println(i + ". " + files[i]);
		}
		do {
			System.out.print("읽을 파일 번호:");
			i = sc.nextInt(); // 파일 선택
		} while (i < 0 || i >= files.length);

		try {
			// 선택한 파일에서 문자 단위로 읽을 수 있는 스트림 생성
			BufferedReader br = new BufferedReader(new FileReader(path + files[i]));
			while ((i = br.read()) != -1) {// 파일의 끝을 만날때까지 2바이트씩 읽어서 i에 저장
				System.out.print((char) i);// 읽은 i를 콘솔에 출력
			}
			br.close();// 스트림 닫는다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
