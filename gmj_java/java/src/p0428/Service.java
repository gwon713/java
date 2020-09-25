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
		
		String[] files = dir.list(); // ���� ���� ��� ����
		int i;
		if (files.length <= 0) {
			System.out.println("���� ������ ����");
			return;
		}
		for (i = 0; i < files.length; i++) {// ���� ���� ��� ���. �迭�� �ε����� ���� ���
			System.out.println(i + ". " + files[i]);
		}
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
}
