package Game;

public class Charmander extends Pocketmon{
	void setInfo(){
		name = "���̸�";
		hp = 25;
		exp = 0;
		level = 1;
	}
	void levelCheck() {
		if (exp >= 15) {
			level++;
			exp -= 15;
			System.out.println("������");
		}
	}
	void ȭ�����(){
		System.out.println("ȭ�����");
	}
}
