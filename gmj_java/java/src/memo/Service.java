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

	// ���丮 ����
	public boolean mkDir() {
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("memo ���丮�� �����Ǿ����ϴ�.");
			return true;
		} else {
			return false;
		}
	}

	// ���ϸ� ����
	public String mkFileName(Scanner sc) {
		String[] files = dir.list();// memo ������ ���� ����� �о� files�� ��´�.
		String fName = "";
		int i;
		do {
			System.out.print("���ϸ�:");
			fName = sc.next();// ���⿡�� ����� ���ϸ� �Է¹���
			for (i = 0; i < files.length; i++) {
				if (fName.equals(files[i])) { // �ߺ�Ȯ��
					System.out.println("�ߺ��� ���ϸ�(1.���ϸ� �ٽ��Է� 2.�̾��)");
					int m = sc.nextInt();
					if (m == 1) {// �ٽ��Է�
						break;
					} else if (m == 2) {// �̾��
						cont = true; // �̾��� ������ ���ڴٸ� ǥ��
						return fName; // �̾���� ���ϸ�
					}
				}
			}
			if (i == files.length) {
				return fName; // ���ξ� ���ϸ�
			}

		} while (true);
	}

	// ���� �б�
	public void read(Scanner sc) {
		String[] files = dir.list(); // ���� ���� ��� ����
		int i;
		if (files.length <= 0) {
			System.out.println("���� ������ ����");
			return;
		}
		for (i = 0; i < files.length; i++) {// ���� ���� ��� ���. �迭�� �ε����� ���� ���
			System.out.println(i + ". " + files[i]);
		}
		// i = -1;
		do {
			System.out.print("���� ���� ��ȣ:");
			i = sc.nextInt(); // ���� ����
		} while (i < 0 || i >= files.length);

		try {
			// ������ ���Ͽ��� ���� ������ ���� �� �ִ� ��Ʈ�� ����
			BufferedReader br = new BufferedReader(new FileReader(path + files[i]));
			while ((i = br.read()) != -1) {// ������ ���� ���������� 2����Ʈ�� �о i�� ����
				System.out.print((char) i);// ���� i�� �ֿܼ� ���
			}
			br.close();// ��Ʈ�� �ݴ´�.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ���� ����
	public void write(Scanner sc) {
		cont = false;
		String fName = mkFileName(sc);
		String str = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path + fName, cont));
			System.out.println("������ �Է��Ͻÿ�. �Է��� ���߷��� /stop�� �Է��Ͻÿ�");
			while (!str.startsWith("/stop")) {
				// sc.nextLine();//���ۿ� ���� ���͸� �Ծ����.
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
		String[] files = dir.list(); // ���� ���� ��� ����
		int i;
		if (files.length <= 0) {
			System.out.println("������ ����");
			return;
		}
		for (i = 0; i < files.length; i++) {// ���� ���� ��� ���. �迭�� �ε����� ���� ���
			System.out.println(i + ". " + files[i]);
		}
		System.out.println("������ ������ �����Ͻÿ�");
		i = sc.nextInt();
		if (i < 0 || i >= files.length) {
			System.out.println("�߸��� ��ȣ. ���� ���");
			return;
		}
		File f = new File(path + files[i]);
		f.delete();
		System.out.println(files[i] + "�� �����Ǿ����ϴ�.");
	}
}
