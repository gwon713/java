package p0420;
class Car{
	String name;
	
	public void beep(){
		System.out.println("����");
	}
}
class �ҹ��� extends Car{
	public �ҹ���(){
		name = "�ҹ���";
	}

	@Override
	public void beep() {
		System.out.println("��~~~~~~��");
	}
}
class ����� extends Car{
	public �����(){
		name = "�����";
	}

	@Override
	public void beep() {
		System.out.println("���� ����");
	}
}
class ���深�� extends Car{
	public ���深��(){
		name = "���深��";
	}

	@Override
	public void beep() {
		System.out.println("�߿��߿�");
	}
}
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = null;
		c = new ���深��();
		c.beep();
	}

}
