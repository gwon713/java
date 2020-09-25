package p0427.memo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Service {
	private String path;
	private File dir;
	private boolean cont;

	public Service() {
		this.path = "src/p0427/memo/memo/";
		dir = new File(path);
	}

	// 디렉토리 생성
	public boolean mkDir() {
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("memo 디렉토리가 생성되었습니다.");
			return true;
		} else {
			return false;
		}
	}

	// 파일명 생성
	public String mkFileName(Scanner sc) {
		String[] files = dir.list();// memo 폴더의 파일 목록을 읽어 files에 담는다.
		String fName = "";
		int i;
		do {
			System.out.print("파일명:");
			fName = sc.next();// 쓰기에서 사용할 파일명 입력받음
			for (i = 0; i < files.length; i++) {
				if (fName.equals(files[i])) { // 중복확인
					System.out.println("중복된 파일명(1.파일명 다시입력 2.이어쓰기)");
					int m = sc.nextInt();
					if (m == 1) {// 다시입력
						break;
					} else if (m == 2) {// 이어쓰기
						cont = true; // 이어쓰기로 파일을 쓰겠다를 표시
						return fName; // 이어쓰기할 파일명
					}
				}
			}
			if (i == files.length) {
				return fName; // 새로쓸 파일명
			}

		} while (true);
	}

	// 파일 읽기
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
		// i = -1;
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

	// 파일 쓰기
	public void write(Scanner sc) {
		cont = false;
		String fName = mkFileName(sc);
		String str = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path + fName, cont));
			System.out.println("내용을 입력하시오. 입력을 멈추려면 /stop을 입력하시오");
			while (!str.startsWith("/stop")) {
				// sc.nextLine();//버퍼에 남은 엔터를 먹어버림.
				str = sc.next();
				if (!str.startsWith("/stop")) {
					bw.write(str + "\n");
				}
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delFile(Scanner sc) {
		String[] files = dir.list(); // 읽을 파일 목록 저장
		int i;
		if (files.length <= 0) {
			System.out.println("파일이 없다");
			return;
		}
		for (i = 0; i < files.length; i++) {// 읽을 파일 목록 출력. 배열의 인덱스도 같이 출력
			System.out.println(i + ". " + files[i]);
		}
		System.out.println("삭제할 파일을 선택하시오");
		i = sc.nextInt();
		if (i < 0 || i >= files.length) {
			System.out.println("잘못된 번호. 삭제 취소");
			return;
		}
		File f = new File(path + files[i]);
		f.delete();
		System.out.println(files[i] + "이 삭제되었습니다.");
	}
}
