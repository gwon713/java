package p0420;

public class Son extends Father {//Father: ��Ӱ���
	public void test() {
		System.out.println("method");
		System.out.println("b:" + b + "/c:" + c + "/d:" + d);// ��Ӱ��迩�� private��
																// ��� �� ����
	}
}

class Other {
	private Father f;//Father: ���԰���

	public Other() {//������
		f = new Father();
	}

	public void test() {
		System.out.println("method");
		System.out.println("b:" + f.b + "/c:" + f.c + "/d:" + f.d);//����Ʈ, protected, public ����� ���� ��Ű������ ���ٰ���
	}
}

//�ڹٿ��� ����� ���ϻ�Ӹ� ����(�θ�� 1���� ����)








